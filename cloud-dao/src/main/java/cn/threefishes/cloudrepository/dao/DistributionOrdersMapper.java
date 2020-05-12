package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionOrders;
import cn.threefishes.cloudrepository.entity.DistributionOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionOrdersMapper {
    long countByExample(DistributionOrdersExample example);

    int deleteByExample(DistributionOrdersExample example);

    int deleteByPrimaryKey(Integer distributionOrdersId);

    int insert(DistributionOrders record);

    int insertSelective(DistributionOrders record);

    List<DistributionOrders> selectByExampleWithRowbounds(DistributionOrdersExample example, RowBounds rowBounds);

    List<DistributionOrders> selectByExample(DistributionOrdersExample example);

    DistributionOrders selectByPrimaryKey(Integer distributionOrdersId);

    int updateByExampleSelective(@Param("record") DistributionOrders record, @Param("example") DistributionOrdersExample example);

    int updateByExample(@Param("record") DistributionOrders record, @Param("example") DistributionOrdersExample example);

    int updateByPrimaryKeySelective(DistributionOrders record);

    int updateByPrimaryKey(DistributionOrders record);
}