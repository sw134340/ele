package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.*;
import elm.demo.service.GoodsService;
import elm.demo.utils.MD5Util;
import elm.demo.utils.MessageAndData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "goodsrest")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            GoodsCondition goodsCondition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        System.out.println(goodsCondition);
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();

        String gName="";
        if(goodsCondition.getGname()!=null && !goodsCondition.getGname().equals("")){
            gName = "%"+ goodsCondition.getGname()+"%";
            criteria.andGnameLike(gName);
        }

        Integer gidC = goodsCondition.getGidCondition();
        if(gidC!=null && gidC!=-1 && goodsCondition.getGid()!=null){//不限定条件
            if(gidC == 0){
                criteria.andGidGreaterThan(goodsCondition.getGid());
            }
            if(gidC == 1){
                criteria.andGidEqualTo(goodsCondition.getGid());
            }
            if(gidC == 2){
                criteria.andGidLessThan(goodsCondition.getGid());
            }
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate1 = dateFormat.parse("1970-01-01");
        Date endDate1 = dateFormat.parse("2999-12-31");

        Date startDate = goodsCondition.getStartDate()==null?startDate1:goodsCondition.getStartDate();
        Date endDate = goodsCondition.getEndDate()==null?endDate1:goodsCondition.getEndDate();
        if(startDate.after(endDate)){
            Date tempDate = startDate;
            startDate = endDate;
            endDate = tempDate;
        }

        criteria.andAddTimeBetween(startDate,endDate);

        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Goods> goods = goodsService.selectByExample(goodsExample);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(goods, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{gid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("gid")Integer gid){
        Goods goods = goodsService.selectByPrimaryKey(gid);
        return MessageAndData.success("查询成功").add("goods",goods);
    }

    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(Goods goods){
        Integer i = goodsService.insertSelective(goods);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{gids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("gids")String gids){
        //获取传递过来的gid列表,分解为一个集合对象
        List<Integer> iGids = new ArrayList<Integer>();
        String[] sGids = gids.split("-");
        Integer i = null;
        for (String sGid : sGids) {
            iGids.add(Integer.parseInt(sGid));
        }
        if(iGids.size() > 1) {//删除多条记录
            //创建一个GoodsExample对象
            GoodsExample goodsExample = new GoodsExample();
            goodsExample.createCriteria().andGidIn(iGids);
            //执行批量删除
            i = goodsService.deleteByExample(goodsExample);
        }else{//删除一条记录
            i = goodsService.deleteByPrimaryKey(iGids.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }

    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT)
    public MessageAndData optUpdate(Goods goods){
        System.out.println(goods);
        int i = goodsService.updateByPrimaryKeySelective(goods);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }

}
