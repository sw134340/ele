package elm.demo.service.impl;

import elm.demo.dao.CustomerMapper;
import elm.demo.domain.Customer;
import elm.demo.domain.CustomerExample;
import elm.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public long countByExample(CustomerExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(CustomerExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer cid) {
        return 0;
    }

    @Override
    public int insert(Customer record) {
        return 0;
    }

    @Override
    public int insertSelective(Customer record) {
        return 0;
    }

    @Override
    public List<Customer> selectByExample(CustomerExample example) {
        return customerMapper.selectByExample(example);
    }

    @Override
    public Customer selectByPrimaryKey(Integer cid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Customer record, CustomerExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Customer record, CustomerExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Customer record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Customer record) {
        return 0;
    }
}
