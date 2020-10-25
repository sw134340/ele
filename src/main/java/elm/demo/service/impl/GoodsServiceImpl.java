package elm.demo.service.impl;

import elm.demo.dao.GoodsMapper;
import elm.demo.domain.Goods;
import elm.demo.domain.GoodsExample;
import elm.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "goodsService")
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public long countByExample(GoodsExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(GoodsExample example) {
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer gid) {
        return 0;
    }

    @Override
    public int insert(Goods record) {
        return 0;
    }

    @Override
    public int insertSelective(Goods record) {
        return 0;
    }

    @Override
    public List<Goods> selectByExample(GoodsExample example) {
        return goodsMapper.selectByExample(example);
    }

    @Override
    public Goods selectByPrimaryKey(Integer gid) {
        return null;
    }

    @Override
    public int updateByExampleSelective(Goods record, GoodsExample example) {
        return 0;
    }

    @Override
    public int updateByExample(Goods record, GoodsExample example) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Goods record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Goods record) {
        return 0;
    }
}
