package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersPay;
import cn.threefishes.cloudrepository.entity.OrdersPayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersPayMapper {
    long countByExample(OrdersPayExample example);

    int deleteByExample(OrdersPayExample example);

    int deleteByPrimaryKey(Integer payId);

    int insert(OrdersPay record);

    int insertSelective(OrdersPay record);

    List<OrdersPay> selectByExampleWithRowbounds(OrdersPayExample example, RowBounds rowBounds);

    List<OrdersPay> selectByExample(OrdersPayExample example);

    OrdersPay selectByPrimaryKey(Integer payId);

    int updateByExampleSelective(@Param("record") OrdersPay record, @Param("example") OrdersPayExample example);

    int updateByExample(@Param("record") OrdersPay record, @Param("example") OrdersPayExample example);

    int updateByPrimaryKeySelective(OrdersPay record);

    int updateByPrimaryKey(OrdersPay record);
}