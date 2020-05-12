package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainOrders;
import cn.threefishes.cloudrepository.entity.ChainOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainOrdersMapper {
    long countByExample(ChainOrdersExample example);

    int deleteByExample(ChainOrdersExample example);

    int deleteByPrimaryKey(Integer ordersId);

    int insert(ChainOrders record);

    int insertSelective(ChainOrders record);

    List<ChainOrders> selectByExampleWithRowbounds(ChainOrdersExample example, RowBounds rowBounds);

    List<ChainOrders> selectByExample(ChainOrdersExample example);

    ChainOrders selectByPrimaryKey(Integer ordersId);

    int updateByExampleSelective(@Param("record") ChainOrders record, @Param("example") ChainOrdersExample example);

    int updateByExample(@Param("record") ChainOrders record, @Param("example") ChainOrdersExample example);

    int updateByPrimaryKeySelective(ChainOrders record);

    int updateByPrimaryKey(ChainOrders record);
}