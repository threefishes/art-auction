package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatOrders;
import cn.threefishes.cloudrepository.entity.StatOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatOrdersMapper {
    long countByExample(StatOrdersExample example);

    int deleteByExample(StatOrdersExample example);

    int deleteByPrimaryKey(Integer ordersId);

    int insert(StatOrders record);

    int insertSelective(StatOrders record);

    List<StatOrders> selectByExampleWithRowbounds(StatOrdersExample example, RowBounds rowBounds);

    List<StatOrders> selectByExample(StatOrdersExample example);

    StatOrders selectByPrimaryKey(Integer ordersId);

    int updateByExampleSelective(@Param("record") StatOrders record, @Param("example") StatOrdersExample example);

    int updateByExample(@Param("record") StatOrders record, @Param("example") StatOrdersExample example);

    int updateByPrimaryKeySelective(StatOrders record);

    int updateByPrimaryKey(StatOrders record);
}