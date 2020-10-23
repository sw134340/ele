package elm.demo.service;

import elm.demo.domain.Typeofgoods;
import elm.demo.domain.TypeofgoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TypeofgoodsService {
    long countByExample(TypeofgoodsExample example);

    int deleteByExample(TypeofgoodsExample example);

    int deleteByPrimaryKey(Integer tid);

    int insert(Typeofgoods record);

    int insertSelective(Typeofgoods record);

    List<Typeofgoods> selectByExample(TypeofgoodsExample example);

    Typeofgoods selectByPrimaryKey(Integer tid);

    int updateByExampleSelective(@Param("record") Typeofgoods record, @Param("example") TypeofgoodsExample example);

    int updateByExample(@Param("record") Typeofgoods record, @Param("example") TypeofgoodsExample example);

    int updateByPrimaryKeySelective(Typeofgoods record);

    int updateByPrimaryKey(Typeofgoods record);
}
