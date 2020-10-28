package elm.demo.service;

import elm.demo.domain.Goods;
import elm.demo.domain.GoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsService {
    long countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);
    List<Goods> selectByExampleWithObject(GoodsExample example);


    Goods selectByPrimaryKey(Integer gid);
    Goods selectByPrimaryKeyWithObject(Integer gid);
    int updateByExampleSelective(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByExample(@Param("record") Goods record, @Param("example") GoodsExample example);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}
