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
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/typeofgoodsrest")
public class TypeofgoodsrestController {
    @Autowired
    private TypeofgoodsService service;
    @RequestMapping(value = "/index")
    public String index(){
//    return "forward:/WEB-INF/user.jsp";
        return "typeofgoods";
    }

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Typeofgoods> typeofgoods = service.selectByExample(null);
        return MessageAndData.success("").add("typeofgoods",typeofgoods);
    }


    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            TypeofgoodsCondition condition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        System.out.println(condition);
        TypeofgoodsExample example = new TypeofgoodsExample();
        TypeofgoodsExample.Criteria criteria = example.createCriteria();

        String tName = "";
        if (condition.getTname() != null && !condition.getTname().equals("")) {
            tName = "%" + condition.getTname() + "%";
            criteria.andTnameLike(tName);
        }

        if(condition.getTid()!=null){
            criteria.andTidEqualTo(condition.getTid());
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");

        Date startDate = condition.getStartDate() == null ? startDate1 : condition.getStartDate();
        Date endDate = condition.getEndDate() == null ? endDate1 : condition.getEndDate();
        if (startDate.after(endDate)) {
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate, endDate);


        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Typeofgoods> typeofgoods = service.selectByExample(example);
        PageInfo pageInfo = new PageInfo(typeofgoods, 8);
        return MessageAndData.success("").add("pageInfo", pageInfo);
    }

        @ResponseBody
        @RequestMapping(value = "/opt/{tid}",method = RequestMethod.GET)
        public MessageAndData optSelectPrimaryKey(@PathVariable("tid")Integer tid){
            Typeofgoods obj = service.selectByPrimaryKey(tid);
            return MessageAndData.success("查询成功").add("obj",obj);
        }

        @ResponseBody
        @RequestMapping(value = "/opt",method = RequestMethod.POST)
        public MessageAndData optInsert(Typeofgoods typeofgoods){
            Integer i = service.insertSelective(typeofgoods);
            if(i>0){
                return MessageAndData.success("成功添加"+i+"条记录");
            }else{
                return MessageAndData.error("添加失败");
            }
        }

        @ResponseBody
        @RequestMapping(value = "/opt/{ids}",method = RequestMethod.DELETE)
        public MessageAndData deletes(@PathVariable("tids")String ids){
            //获取传递过来的tid列表,分解为一个集合对象
            List<Integer> iIds = new ArrayList<Integer>();
            String[] sIds = ids.split("-");
            Integer i = null;
            for (String sTid : sIds) {
                iIds.add(Integer.parseInt(sTid));
            }
            if(iIds.size() > 1) {//删除多条记录
                //创建一个UserExample对象
                TypeofgoodsExample example = new TypeofgoodsExample();
                example.createCriteria().andTidIn(iIds);
                //执行批量删除
                i = service.deleteByExample(example);
            }else{//删除一条记录
                i = service.deleteByPrimaryKey(iIds.get(0));
            }
            return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
        }

        //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
        @ResponseBody
        @RequestMapping(value = "/opt",method = RequestMethod.PUT)
        public MessageAndData optUpdate(Typeofgoods obj){
            System.out.println(obj);
            int i = service.updateByPrimaryKeySelective(obj);
            if(i>0){
                return MessageAndData.success("成功修改"+i+"条记录");
            }else{
                return MessageAndData.error("修改失败");
            }
        }


}
