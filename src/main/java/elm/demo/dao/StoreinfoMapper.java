package elm.demo.dao;

import elm.demo.domain.Storeinfo;
import elm.demo.domain.StoreinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreinfoMapper {
    long countByExample(StoreinfoExample example);

    int deleteByExample(StoreinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Storeinfo record);

    int insertSelective(Storeinfo record);

    List<Storeinfo> selectByExample(StoreinfoExample example);

    Storeinfo selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByExample(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByPrimaryKeySelective(Storeinfo record);

    int updateByPrimaryKey(Storeinfo record);
}