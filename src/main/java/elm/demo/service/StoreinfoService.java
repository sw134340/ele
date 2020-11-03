package elm.demo.service;

import elm.demo.domain.Storeinfo;
import elm.demo.domain.StoreinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StoreinfoService {
    long countByExample(StoreinfoExample example);

    int deleteByExample(StoreinfoExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Storeinfo record);

    int insertSelective(Storeinfo record);

    List<Storeinfo> selectByExample(StoreinfoExample example);

    Storeinfo selectByPrimaryKey(Integer sid);
    List<Storeinfo> selectByExampleWithObject(StoreinfoExample example);

    Storeinfo selectByPrimaryKeyWithObject(Integer sid);

    int updateByExampleSelective(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByExample(@Param("record") Storeinfo record, @Param("example") StoreinfoExample example);

    int updateByPrimaryKeySelective(Storeinfo record);

    int updateByPrimaryKey(Storeinfo record);
    int updateOffer(Integer sid,Integer aid,Boolean offer);
}
