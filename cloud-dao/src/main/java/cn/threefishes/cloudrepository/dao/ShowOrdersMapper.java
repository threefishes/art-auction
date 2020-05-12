package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrders;
import cn.threefishes.cloudrepository.entity.ShowOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersMapper {
    long countByExample(ShowOrdersExample example);

    int deleteByExample(ShowOrdersExample example);

    int deleteByPrimaryKey(Integer showOrdersId);

    int insert(ShowOrders record);

    int insertSelective(ShowOrders record);

    List<ShowOrders> selectByExampleWithRowbounds(ShowOrdersExample example, RowBounds rowBounds);

    List<ShowOrders> selectByExample(ShowOrdersExample example);

    ShowOrders selectByPrimaryKey(Integer showOrdersId);

    int updateByExampleSelective(@Param("record") ShowOrders record, @Param("example") ShowOrdersExample example);

    int updateByExample(@Param("record") ShowOrders record, @Param("example") ShowOrdersExample example);

    int updateByPrimaryKeySelective(ShowOrders record);

    int updateByPrimaryKey(ShowOrders record);
}