package elm.demo.service.impl;

import elm.demo.dao.CustomerMapper;
import elm.demo.dao.OrderlistMapper;
import elm.demo.domain.Customer;
import elm.demo.domain.CustomerExample;
import elm.demo.domain.OrderlistExample;
import elm.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private OrderlistMapper orderlistMapper;

    @Override
    public long countByExample(CustomerExample example) {
        return customerMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(CustomerExample example) {
        //批量删除用户也要先删除相应订单
//        OrderlistExample example1 = new OrderlistExample();
//        OrderlistExample.Criteria criteria = example1.createCriteria();
//        criteria.andOcidIn(ids);
//        orderlistMapper.deleteByExample(example1);
        return customerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByExample(CustomerExample example, List<Integer> ids) {
        return customerMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        //删除单个用户前先删除该用户的订单
        OrderlistExample example = new OrderlistExample();
        OrderlistExample.Criteria criteria = example.createCriteria();
        criteria.andOcidEqualTo(cid);
        orderlistMapper.deleteByExample(example);
        return customerMapper.deleteByPrimaryKey(cid);
    }

    @Override
    public int insert(Customer record) {
        return customerMapper.insert(record);
    }

    @Override
    public int insertSelective(Customer record) {
        return customerMapper.insertSelective(record);
    }

    @Override
    public List<Customer> selectByExample(CustomerExample example) {
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer selectByPrimaryKey(Integer cid) {
        return customerMapper.selectByPrimaryKey(cid);
    }

    @Override
    public int updateByExampleSelective(Customer record, CustomerExample example) {
        return customerMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Customer record, CustomerExample example) {
        return customerMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return customerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return customerMapper.updateByPrimaryKey(record);
    }
}
