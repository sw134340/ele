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
        return 0;
    }

    @Override
    public int deleteByExample(TypeofgoodsExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer tid) {
        return 0;
    }

    @Override
    public int insert(Typeofgoods record) {
        return 0;
    }

    @Override
    public int insertSelective(Typeofgoods record) {
        return 0;
    }

    @Override
    public List<Typeofgoods> selectByExample(TypeofgoodsExample example) {
        return typeofgoodsMapper.selectByExample(example);
    }

    @Override
    public Typeofgoods selectByPrimaryKey(Integer tid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Typeofgoods record, TypeofgoodsExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Typeofgoods record, TypeofgoodsExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Typeofgoods record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Typeofgoods record) {
        return 0;
    }
}
