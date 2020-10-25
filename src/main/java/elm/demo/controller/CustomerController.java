package elm.demo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import elm.demo.domain.Customer;
import elm.demo.domain.CustomerCondition;
import elm.demo.domain.CustomerExample;
import elm.demo.service.CustomerService;
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
@RequestMapping(value = "/customerrest")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @GetMapping(value = "/list")
//    public MessageAndData list(){
//       List<Customer> customers = customerService.selectByExample(null);
//       return MessageAndData.success("").add("customers",customers);
//    }
@ResponseBody
@RequestMapping(value = "/list",method = {RequestMethod.GET})
public MessageAndData list(
        CustomerCondition customerCondition,/*检索条件*/
        @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
        @RequestParam(value = "pageSize",defaultValue = "10")Integer pageSize

) throws ParseException {
    System.out.println(customerCondition);
    CustomerExample customerExample = new CustomerExample();
    CustomerExample.Criteria criteria = customerExample.createCriteria();

    String cName="";
    if(customerCondition.getCname()!=null && !customerCondition.getCname().equals("")){
        cName = "%"+ customerCondition.getCname()+"%";
        criteria.andCnameLike(cName);
    }

    Integer cidC = customerCondition.getCidCondition();
    if(cidC!=null && cidC!=-1 && customerCondition.getCid()!=null){//不限定条件
        if(cidC == 0){
            criteria.andCidGreaterThan(customerCondition.getCid());
        }
        if(cidC == 1){
            criteria.andCidEqualTo(customerCondition.getCid());
        }
        if(cidC == 2){
            criteria.andCidLessThan(customerCondition.getCid());
        }
    }

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date startDate1 = dateFormat.parse("1970-01-01");
    Date endDate1 = dateFormat.parse("2999-12-31");

    Date startDate = customerCondition.getStartDate()==null?startDate1:customerCondition.getStartDate();
    Date endDate = customerCondition.getEndDate()==null?endDate1:customerCondition.getEndDate();
    if(startDate.after(endDate)){
        Date tempDate = startDate;
        startDate = endDate;
        endDate = tempDate;
    }

    criteria.andAddTimeBetween(startDate,endDate);

    //初始化,约束
    PageHelper.startPage(pageNum, pageSize);
    List<Customer> customers = customerService.selectByExample(customerExample);
    //使用pageHelper的方式封装数据,默认的导航列表长度为8
    PageInfo pageInfo = new PageInfo(customers, 8);
    return MessageAndData.success("").add("pageInfo",pageInfo);
}

    @ResponseBody
    @RequestMapping(value = "/opt/{cid}",method = RequestMethod.GET)
    public MessageAndData optSelectPrimaryKey(@PathVariable("cid")Integer cid){
        Customer customer = customerService.selectByPrimaryKey(cid);
        return MessageAndData.success("查询成功").add("customer",customer);
    }

    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.POST)
    public MessageAndData optInsert(Customer customer){
        Integer i = customerService.insertSelective(customer);
        if(i>0){
            return MessageAndData.success("成功添加"+i+"条记录");
        }else{
            return MessageAndData.error("添加失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/opt/{cids}",method = RequestMethod.DELETE)
    public MessageAndData deletes(@PathVariable("cids")String cids){
        //获取传递过来的cid列表,分解为一个集合对象
        List<Integer> iCids = new ArrayList<Integer>();
        String[] sCids = cids.split("-");
        Integer i = null;
        for (String sCid : sCids) {
            iCids.add(Integer.parseInt(sCid));
        }
        if(iCids.size() > 1) {//删除多条记录
            //创建一个CustomerExample对象
            CustomerExample customerExample = new CustomerExample();
            customerExample.createCriteria().andCidIn(iCids);
            //执行批量删除
            i = customerService.deleteByExample(customerExample);
        }else{//删除一条记录
            i = customerService.deleteByPrimaryKey(iCids.get(0));
        }
        return MessageAndData.success("删除成功"+i+"条记录").add("num", i);
    }

    //    如果使用put方法,记得要在web.xml中添加相应过滤器,对象不能封装
    @ResponseBody
    @RequestMapping(value = "/opt",method = RequestMethod.PUT)
    public MessageAndData optUpdate(Customer customer){
        System.out.println(customer);
        int i = customerService.updateByPrimaryKeySelective(customer);
        if(i>0){
            return MessageAndData.success("成功修改"+i+"条记录");
        }else{
            return MessageAndData.error("修改失败");
        }
    }
}
