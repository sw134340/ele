package elm.demo.dao;

import elm.demo.domain.StAc;
import elm.demo.domain.StAcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StAcMapper {
    long countByExample(StAcExample example);

    int deleteByExample(StAcExample example);

    int deleteByPrimaryKey(Integer stid);

    int insert(StAc record);

    int insertSelective(StAc record);

    List<StAc> selectByExample(StAcExample example);

    StAc selectByPrimaryKey(Integer stid);

    int updateByExampleSelective(@Param("record") StAc record, @Param("example") StAcExample example);

    int updateByExample(@Param("record") StAc record, @Param("example") StAcExample example);

    int updateByPrimaryKeySelective(StAc record);

    int updateByPrimaryKey(StAc record);
}