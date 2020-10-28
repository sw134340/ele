package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.Storeinfo;
import elm.demo.domain.Typeofgoods;
import elm.demo.domain.TypeofgoodsCondition;
import elm.demo.domain.TypeofgoodsExample;
import elm.demo.service.TypeofgoodsService;
import elm.demo.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/typeofgoodsrest")
public class TypeofgoodsrestController {
    @Autowired
    private TypeofgoodsService typeofgoodsService;
    @RequestMapping(value = "/index")
    public String index(){
//    return "forward:/WEB-INF/user.jsp";
        return "typeofgoods";
    }

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Typeofgoods> typeofgoods = typeofgoodsService.selectByExample(null);
        return MessageAndData.success("").add("typeofgoods",typeofgoods);
    }


    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            TypeofgoodsCondition typeofgoodsCondition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        System.out.println(typeofgoodsCondition);
        TypeofgoodsExample typeofgoodsExample = new TypeofgoodsExample();
        TypeofgoodsExample.Criteria criteria = typeofgoodsExample.createCriteria();

        String tName = "";
        if (typeofgoodsCondition.getTname() != null && !typeofgoodsCondition.getTname().equals("")) {
            tName = "%" + typeofgoodsCondition.getTname() + "%";
            criteria.andTnameLike(tName);
        }

        Integer tidC = typeofgoodsCondition.getTidCondition();
        if (tidC != null && tidC != -1 && typeofgoodsCondition.getTid() != null) {//不限定条件
            if (tidC == 0) {
                criteria.andTidGreaterThan(typeofgoodsCondition.getTid());
            }
            if (tidC == 1) {
                criteria.andTidEqualTo(typeofgoodsCondition.getTid());
            }
            if (tidC == 2) {
                criteria.andTidLessThan(typeofgoodsCondition.getTid());
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");

        Date startDate = typeofgoodsCondition.getStartDate() == null ? startDate1 : typeofgoodsCondition.getStartDate();
        Date endDate = typeofgoodsCondition.getEndDate() == null ? endDate1 : typeofgoodsCondition.getEndDate();
        if (startDate.after(endDate)) {
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate, endDate);


        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Typeofgoods> typeofgoods = typeofgoodsService.selectByExample(typeofgoodsExample);
        PageInfo pageInfo = new PageInfo(typeofgoods, 8);
        return MessageAndData.success("").add("pageInfo", pageInfo);
    }

        @ResponseBody
        @RequestMapping(value = "/opt/{tid}",method = RequestMethod.GET)
        public MessageAndData optSelectPrimaryKey(@PathVariable("tid")Integer tid){
            Typeofgoods typeofgoods = typeofgoodsService.selectByPrimaryKey(tid);
            return MessageAndData.success("查询成功").add("typeofgoods",typeofgoods);
        }

        @ResponseBody
        @RequestMapping(value = "/opt",method = RequestMethod.POST)
        public MessageAndData optInsert(Typeofgoods typeofgoods){
            Integer i = typeofgoodsService.insertSelective(typeofgoods);
            if(i>0){
                return MessageAndData.success("成功添加"+i+"条记录");
            }else{
                return MessageAndData.error("添加失败");
            }
        }

        @ResponseBody
        @RequestMapping(value = "/opt/{tids}",method = RequestMethod.DELETE)
        public MessageAndData deletes(@PathVariable("tids")String tids){
            //获取传递过来的tid列表,分解为一个集合对象
            List<Integer> iTids = new ArrayList<Integer>();
            String[] sTids = tids.split("-");
            Integer i = null;
            for (String sTid : sTids) {
                iTids.add(Integer.parseInt(sTid));
            }
            if(iTids.size() > 1) {//删除多条记录
                //创建一个UserExample对象
                TypeofgoodsExample typeofgoodsExample1 = new TypeofgoodsExample();
                typeofgoodsExample1.createCriteria().andTidIn(iTids);
                //执行批量删除
                i = typeofgoodsService.deleteByExample(typeofgoodsExample1);
            }else{//删除一条记录
                i = typeofgoodsService.deleteByPrimaryKey(iTids.get(0));
            }
            return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
        }

        //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
        @ResponseBody
        @RequestMapping(value = "/opt",method = RequestMethod.PUT)
        public MessageAndData optUpdate(Typeofgoods typeofgoods){
            System.out.println(typeofgoods);
            int i = typeofgoodsService.updateByPrimaryKeySelective(typeofgoods);
            if(i>0){
                return MessageAndData.success("成功修改"+i+"条记录");
            }else{
                return MessageAndData.error("修改失败");
            }
        }
}
