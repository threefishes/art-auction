package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainStatOrders;
import cn.threefishes.cloudrepository.entity.ChainStatOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainStatOrdersMapper {
    long countByExample(ChainStatOrdersExample example);

    int deleteByExample(ChainStatOrdersExample example);

    int deleteByPrimaryKey(Integer ordersId);

    int insert(ChainStatOrders record);

    int insertSelective(ChainStatOrders record);

    List<ChainStatOrders> selectByExampleWithRowbounds(ChainStatOrdersExample example, RowBounds rowBounds);

    List<ChainStatOrders> selectByExample(ChainStatOrdersExample example);

    ChainStatOrders selectByPrimaryKey(Integer ordersId);

    int updateByExampleSelective(@Param("record") ChainStatOrders record, @Param("example") ChainStatOrdersExample example);

    int updateByExample(@Param("record") ChainStatOrders record, @Param("example") ChainStatOrdersExample example);

    int updateByPrimaryKeySelective(ChainStatOrders record);

    int updateByPrimaryKey(ChainStatOrders record);
}