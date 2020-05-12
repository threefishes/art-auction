package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ExchangeOrders;
import cn.threefishes.cloudrepository.entity.ExchangeOrdersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExchangeOrdersMapper {
    long countByExample(ExchangeOrdersExample example);

    int deleteByExample(ExchangeOrdersExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ExchangeOrders record);

    int insertSelective(ExchangeOrders record);

    List<ExchangeOrders> selectByExampleWithRowbounds(ExchangeOrdersExample example, RowBounds rowBounds);

    List<ExchangeOrders> selectByExample(ExchangeOrdersExample example);

    ExchangeOrders selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ExchangeOrders record, @Param("example") ExchangeOrdersExample example);

    int updateByExample(@Param("record") ExchangeOrders record, @Param("example") ExchangeOrdersExample example);

    int updateByPrimaryKeySelective(ExchangeOrders record);

    int updateByPrimaryKey(ExchangeOrders record);
}