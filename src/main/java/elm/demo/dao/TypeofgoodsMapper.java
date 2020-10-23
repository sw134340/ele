package elm.demo.dao;

import elm.demo.domain.Typeofgoods;
import elm.demo.domain.TypeofgoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypeofgoodsMapper {
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