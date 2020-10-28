package elm.demo.service.impl;

import elm.demo.dao.TypeofgoodsMapper;
import elm.demo.domain.Typeofgoods;
import elm.demo.domain.TypeofgoodsExample;
import elm.demo.service.TypeofgoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "typeofgoodsService")
public class TypeofgoodsServiceImpl implements TypeofgoodsService {

    @Autowired
    private TypeofgoodsMapper typeofgoodsMapper;

    @Override
    public long countByExample(TypeofgoodsExample example) {
        return typeofgoodsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TypeofgoodsExample example) {
        return typeofgoodsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer tid) {
        return typeofgoodsMapper.deleteByPrimaryKey(tid);
    }

    @Override
    public int insert(Typeofgoods record) {
        return typeofgoodsMapper.insert(record);
    }

    @Override
    public int insertSelective(Typeofgoods record) {
        return typeofgoodsMapper.insertSelective(record);
    }

    @Override
    public List<Typeofgoods> selectByExample(TypeofgoodsExample example) {
        return typeofgoodsMapper.selectByExample(example);
    }

    @Override
    public Typeofgoods selectByPrimaryKey(Integer tid) {
        return typeofgoodsMapper.selectByPrimaryKey(tid);
    }

    @Override
    public int updateByExampleSelective(Typeofgoods record, TypeofgoodsExample example) {
        return typeofgoodsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Typeofgoods record, TypeofgoodsExample example) {
        return typeofgoodsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Typeofgoods record) {
        return typeofgoodsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Typeofgoods record) {
        return typeofgoodsMapper.updateByPrimaryKey(record);
    }
}
