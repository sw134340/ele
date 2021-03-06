package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.*;
import elm.demo.service.ActiveService;
import elm.demo.service.OrderlistService;
import elm.demo.service.StoreinfoService;
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
@RequestMapping("/storeinforest")
public class StoreinfoController {
    @Autowired
    private StoreinfoService service;
    @Autowired
    private ActiveService activeService;
    @RequestMapping(value = "/index")
    public String index(){
//    return "forward:/WEB-INF/user.jsp";
        return "storeinfo";
    }

    @ResponseBody
    @RequestMapping(value = "/listJSON")
    public MessageAndData listJSON(){
        List<Storeinfo> lists = service.selectByExample(null);
        return MessageAndData.success("").add("lists",lists);
    }

    @ResponseBody
    @RequestMapping(value = "/list",method = {RequestMethod.GET})
    public MessageAndData list(
            StoreinfoCondition condition,/*检索条件*/
            @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
            @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

    ) throws ParseException {
        System.out.println(condition);
        StoreinfoExample example = new StoreinfoExample();
        StoreinfoExample.Criteria criteria = example.createCriteria();

        if(condition.getSid()!=null){
            criteria.andSidEqualTo(condition.getSid());
        }

        String name="";
        if(condition.getSname()!=null && !condition.getSname().equals("")){
            name = "%"+condition.getSname()+"%";
            criteria.andSnameLike(name);
        }
example.setOrderByClause("sid");
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date startDate1 = dateFormat.parse("1970-01-01");
//        Date endDate1 = dateFormat.parse("2999-12-31");
//
//        Date startDate = condition.getStartDate()==null?startDate1:condition.getStartDate();
//        Date endDate = condition.getEndDate()==null?endDate1:condition.getEndDate();
//        if(startDate.after(endDate)){
//            Date tempDate = startDate;
//            startDate = endDate;
//            endDate = tempDate;
//        }
//
//        criteria.andAddTimeBetween(startDate,endDate);


        //获取所有的活动列表

        List<Active> active = activeService.selectByExample(null);
        System.out.println(active);


        //初始化,约束
        PageHelper.startPage(pageNum, pageSize);
        List<Storeinfo> lists = service.selectByExampleWithObject(example);
        System.out.println(lists);
        //使用pageHelper的方式封装数据,默认的导航列表长度为8
        PageInfo pageInfo = new PageInfo(lists, 8);
        return MessageAndData.success("").add("pageInfo",pageInfo).add("active",active);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{id}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("id")Integer id){
        Storeinfo obj = service.selectByPrimaryKey(id);
        return MessageAndData.success("查询成功").add("obj",obj);
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{sid}/{aid}/{offer}", method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("sid") Integer sid,@PathVariable("aid") Integer aid,@PathVariable("offer") Boolean offer) {
        int i = service.updateOffer(sid,aid,offer);
        return MessageAndData.success("处理成功").add("num", i);
    }
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(@RequestParam(value = "file")MultipartFile file, HttpServletRequest request, Storeinfo obj) throws IOException {
        String path="c:\\upload";
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();//迭代建立多级目录
        }
        file.transferTo(file1);
        String avatarUrl = "/upload/" + filename;
        obj.setSphoto(avatarUrl);

        Integer i = service.insertSelective(obj);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{ids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("ids")String ids){
        //获取传递过来的uid列表,分解为一个集合对象
        List<Integer> iIds = new ArrayList<Integer>();
        String splitSymbol="\\D";
        String[] sIds = ids.split(splitSymbol);
        Integer i = null;
        for (String sId : sIds) {
            iIds.add(Integer.parseInt(sId));
        }
//        if(iIds.size() > 1) {//删除多条记录
//            //创建一个UserExample对象
//            StoreinfoExample example = new StoreinfoExample();
//            example.createCriteria().andSidIn(iIds);
//            //执行批量删除
//            i = service.deleteByExample(example);
//        }else{//删除一条记录
//            i = service.deleteByPrimaryKey(iIds.get(0));
//        }
        for (Integer iId : iIds) {
            i += service.deleteByPrimaryKey(iIds.get(iId));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }

    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT, headers="content-type=multipart/form-data")
    public MessageAndData optUpdateRest(@RequestParam(value = "file")MultipartFile file, HttpServletRequest request,Storeinfo obj) throws IOException {
        String path="c:\\upload";
//        String path = request.getSession().getServletContext().getRealPath("/images/upload");
        String filename = UUID.randomUUID() + "-" + file.getOriginalFilename();
        File file1 = new File(path, filename);
        if(!file1.exists()){
            file1.mkdirs();
        }
        file.transferTo(file1);
        String photoUrl = "/upload/" + filename;
        obj.setSphoto(photoUrl);
        //如果涉及到复选框的操作,特别是前台如果通过复选框设置单一字段的状态,需要处理,否则出现能设置上不能取消
        //原因是使用了框架的自动封装功能,如果没有选中则封装为null,example判断如果为null则不会添加到更新字段中
        if (obj.getOffer() == null) {
            obj.setOffer(false);
        }

        int i = service.updateByPrimaryKeySelective(obj);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }

}
