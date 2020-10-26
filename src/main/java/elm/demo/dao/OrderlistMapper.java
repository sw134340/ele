package elm.demo.dao;

import elm.demo.domain.Orderlist;
import elm.demo.domain.OrderlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderlistMapper {
    long countByExample(OrderlistExample example);

    int deleteByExample(OrderlistExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Orderlist record);

    int insertSelective(Orderlist record);

    List<Orderlist> selectByExample(OrderlistExample example);
    List<Orderlist> selectByExampleWithObject(OrderlistExample example);

    Orderlist selectByPrimaryKey(Integer oid);
    Orderlist selectByPrimaryKeyWithObject(Integer oid);


    int updateByExampleSelective(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByExample(@Param("record") Orderlist record, @Param("example") OrderlistExample example);

    int updateByPrimaryKeySelective(Orderlist record);

    int updateByPrimaryKey(Orderlist record);
}