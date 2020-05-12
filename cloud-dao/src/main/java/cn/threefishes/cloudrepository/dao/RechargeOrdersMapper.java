package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RechargeOrders;
import cn.threefishes.cloudrepository.entity.RechargeOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RechargeOrdersMapper {
    long countByExample(RechargeOrdersExample example);

    int deleteByExample(RechargeOrdersExample example);

    int deleteByPrimaryKey(Integer ordersId);

    int insert(RechargeOrders record);

    int insertSelective(RechargeOrders record);

    List<RechargeOrders> selectByExampleWithRowbounds(RechargeOrdersExample example, RowBounds rowBounds);

    List<RechargeOrders> selectByExample(RechargeOrdersExample example);

    RechargeOrders selectByPrimaryKey(Integer ordersId);

    int updateByExampleSelective(@Param("record") RechargeOrders record, @Param("example") RechargeOrdersExample example);

    int updateByExample(@Param("record") RechargeOrders record, @Param("example") RechargeOrdersExample example);

    int updateByPrimaryKeySelective(RechargeOrders record);

    int updateByPrimaryKey(RechargeOrders record);
}