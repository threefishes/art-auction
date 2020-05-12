package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VirtualOrders;
import cn.threefishes.cloudrepository.entity.VirtualOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VirtualOrdersMapper {
    long countByExample(VirtualOrdersExample example);

    int deleteByExample(VirtualOrdersExample example);

    int deleteByPrimaryKey(Integer ordersId);

    int insert(VirtualOrders record);

    int insertSelective(VirtualOrders record);

    List<VirtualOrders> selectByExampleWithRowbounds(VirtualOrdersExample example, RowBounds rowBounds);

    List<VirtualOrders> selectByExample(VirtualOrdersExample example);

    VirtualOrders selectByPrimaryKey(Integer ordersId);

    int updateByExampleSelective(@Param("record") VirtualOrders record, @Param("example") VirtualOrdersExample example);

    int updateByExample(@Param("record") VirtualOrders record, @Param("example") VirtualOrdersExample example);

    int updateByPrimaryKeySelective(VirtualOrders record);

    int updateByPrimaryKey(VirtualOrders record);
}