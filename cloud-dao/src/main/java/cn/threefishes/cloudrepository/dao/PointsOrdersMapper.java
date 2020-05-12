package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PointsOrders;
import cn.threefishes.cloudrepository.entity.PointsOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PointsOrdersMapper {
    long countByExample(PointsOrdersExample example);

    int deleteByExample(PointsOrdersExample example);

    int deleteByPrimaryKey(Integer pointsOrdersId);

    int insert(PointsOrders record);

    int insertSelective(PointsOrders record);

    List<PointsOrders> selectByExampleWithRowbounds(PointsOrdersExample example, RowBounds rowBounds);

    List<PointsOrders> selectByExample(PointsOrdersExample example);

    PointsOrders selectByPrimaryKey(Integer pointsOrdersId);

    int updateByExampleSelective(@Param("record") PointsOrders record, @Param("example") PointsOrdersExample example);

    int updateByExample(@Param("record") PointsOrders record, @Param("example") PointsOrdersExample example);

    int updateByPrimaryKeySelective(PointsOrders record);

    int updateByPrimaryKey(PointsOrders record);
}