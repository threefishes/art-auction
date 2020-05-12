package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersGift;
import cn.threefishes.cloudrepository.entity.OrdersGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersGiftMapper {
    long countByExample(OrdersGiftExample example);

    int deleteByExample(OrdersGiftExample example);

    int deleteByPrimaryKey(Integer ordersGiftId);

    int insert(OrdersGift record);

    int insertSelective(OrdersGift record);

    List<OrdersGift> selectByExampleWithRowbounds(OrdersGiftExample example, RowBounds rowBounds);

    List<OrdersGift> selectByExample(OrdersGiftExample example);

    OrdersGift selectByPrimaryKey(Integer ordersGiftId);

    int updateByExampleSelective(@Param("record") OrdersGift record, @Param("example") OrdersGiftExample example);

    int updateByExample(@Param("record") OrdersGift record, @Param("example") OrdersGiftExample example);

    int updateByPrimaryKeySelective(OrdersGift record);

    int updateByPrimaryKey(OrdersGift record);
}