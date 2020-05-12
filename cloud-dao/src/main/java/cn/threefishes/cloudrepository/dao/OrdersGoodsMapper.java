package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersGoods;
import cn.threefishes.cloudrepository.entity.OrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersGoodsMapper {
    long countByExample(OrdersGoodsExample example);

    int deleteByExample(OrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(OrdersGoods record);

    int insertSelective(OrdersGoods record);

    List<OrdersGoods> selectByExampleWithRowbounds(OrdersGoodsExample example, RowBounds rowBounds);

    List<OrdersGoods> selectByExample(OrdersGoodsExample example);

    OrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") OrdersGoods record, @Param("example") OrdersGoodsExample example);

    int updateByExample(@Param("record") OrdersGoods record, @Param("example") OrdersGoodsExample example);

    int updateByPrimaryKeySelective(OrdersGoods record);

    int updateByPrimaryKey(OrdersGoods record);
}