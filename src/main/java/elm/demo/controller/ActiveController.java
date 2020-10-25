package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.*;
import elm.demo.service.ActiveService;
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
@RequestMapping(value = "/activerest")
public class ActiveController {

    @Autowired
    private ActiveService activeService;

@ResponseBody
@RequestMapping(value = "/list",method = {RequestMethod.GET})
public MessageAndData list(
        ActiveCondition activeCondition,/*检索条件*/
        @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
        @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

) throws ParseException {
    System.out.println(activeCondition);
    ActiveExample activeExample = new ActiveExample();
    ActiveExample.Criteria criteria = activeExample.createCriteria();

    String aName="";
    if(activeCondition.getAname()!=null && !activeCondition.getAname().equals("")){
        aName = "%"+ activeCondition.getAname()+"%";
        criteria.andAnameLike(aName);
    }

    Integer aidC = activeCondition.getAidCondition();
    if(aidC!=null && aidC!=-1 && activeCondition.getAid()!=null){//不限定条件
        if(aidC == 0){
            criteria.andAidGreaterThan(activeCondition.getAid());
        }
        if(aidC == 1){
            criteria.andAidEqualTo(activeCondition.getAid());
        }
        if(aidC == 2){
            criteria.andAidLessThan(activeCondition.getAid());
        }
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date startDate1 = dateFormat.parse("1970-01-01");
    Date endDate1 = dateFormat.parse("2999-12-31");

    Date startDate = activeCondition.getStartDate()==null?startDate1:activeCondition.getStartDate();
    Date endDate = activeCondition.getEndDate()==null?endDate1:activeCondition.getEndDate();
    if(startDate.after(endDate)){
        Date tempDate = startDate;
        startDate = endDate;
        endDate = tempDate;
    }

    criteria.andAddTimeBetween(startDate,endDate);

    //初始化,约束
    PageHelper.startPage(pageNum, pageSize);
    List<Active> actives = activeService.selectByExample(activeExample);
    //使用pageHelper的方式封装数据,默认的导航列表长度为8
    PageInfo pageInfo = new PageInfo(actives, 8);
    return MessageAndData.success("").add("pageInfo",pageInfo);
}

    @ResponseBody
    @RequestMapping(value = "/opt/{aid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("aid")Integer aid){
        Active active = activeService.selectByPrimaryKey(aid);
        return MessageAndData.success("查询成功").add("active",active);
    }

    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(Active active){
        Integer i = activeService.insertSelective(active);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{aids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("aids")String aids){
        //获取传递过来的aid列表,分解为一个集合对象
        List<Integer> iAids = new ArrayList<Integer>();
        String[] sAids = aids.split("-");
        Integer i = null;
        for (String sAid : sAids) {
            iAids.add(Integer.parseInt(sAid));
        }
        if(iAids.size() > 1) {//删除多条记录
            //创建一个ActiverExample对象
            ActiveExample activeExample = new ActiveExample();
            activeExample.createCriteria().andAidIn(iAids);
            //执行批量删除
            i = activeService.deleteByExample(activeExample);
        }else{//删除一条记录
            i = activeService.deleteByPrimaryKey(iAids.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }

    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT)
    public MessageAndData optUpdate(Active active){
        System.out.println(active);
        int i = activeService.updateByPrimaryKeySelective(active);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }
}
