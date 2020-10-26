package elm.demo.service.impl;

import elm.demo.dao.OrderlistMapper;
import elm.demo.domain.Orderlist;
import elm.demo.domain.OrderlistExample;
import elm.demo.service.OrderlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "orderlistService")
public class OrderlistServiceImpl implements OrderlistService {
    @Autowired
    private OrderlistMapper orderlistMapper;
    @Override
    public long countByExample(OrderlistExample example) {
        return orderlistMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(OrderlistExample example) {
        return orderlistMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer oid) {
        return orderlistMapper.deleteByPrimaryKey(oid);
    }

    @Override
    public int insert(Orderlist record) {
        return orderlistMapper.insert(record);
    }

    @Override
    public int insertSelective(Orderlist record) {
        return orderlistMapper.insertSelective(record);
    }

    @Override
    public List<Orderlist> selectByExample(OrderlistExample example) {
        return orderlistMapper.selectByExample(example);
    }

    @Override
    public Orderlist selectByPrimaryKey(Integer oid) {
        return orderlistMapper.selectByPrimaryKey(oid);
    }

    @Override
    public int updateByExampleSelective(Orderlist record, OrderlistExample example) {
        return orderlistMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Orderlist record, OrderlistExample example) {
        return orderlistMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Orderlist record) {
        return orderlistMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Orderlist record) {
        return orderlistMapper.updateByPrimaryKey(record);
    }
}
