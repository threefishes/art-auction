package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersBook;
import cn.threefishes.cloudrepository.entity.OrdersBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersBookMapper {
    long countByExample(OrdersBookExample example);

    int deleteByExample(OrdersBookExample example);

    int deleteByPrimaryKey(Integer bookId);

    int insert(OrdersBook record);

    int insertSelective(OrdersBook record);

    List<OrdersBook> selectByExampleWithRowbounds(OrdersBookExample example, RowBounds rowBounds);

    List<OrdersBook> selectByExample(OrdersBookExample example);

    OrdersBook selectByPrimaryKey(Integer bookId);

    int updateByExampleSelective(@Param("record") OrdersBook record, @Param("example") OrdersBookExample example);

    int updateByExample(@Param("record") OrdersBook record, @Param("example") OrdersBookExample example);

    int updateByPrimaryKeySelective(OrdersBook record);

    int updateByPrimaryKey(OrdersBook record);
}