package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersSeckill;
import cn.threefishes.cloudrepository.entity.OrdersSeckillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersSeckillMapper {
    long countByExample(OrdersSeckillExample example);

    int deleteByExample(OrdersSeckillExample example);

    int deleteByPrimaryKey(Integer ordersSeckillId);

    int insert(OrdersSeckill record);

    int insertSelective(OrdersSeckill record);

    List<OrdersSeckill> selectByExampleWithRowbounds(OrdersSeckillExample example, RowBounds rowBounds);

    List<OrdersSeckill> selectByExample(OrdersSeckillExample example);

    OrdersSeckill selectByPrimaryKey(Integer ordersSeckillId);

    int updateByExampleSelective(@Param("record") OrdersSeckill record, @Param("example") OrdersSeckillExample example);

    int updateByExample(@Param("record") OrdersSeckill record, @Param("example") OrdersSeckillExample example);

    int updateByPrimaryKeySelective(OrdersSeckill record);

    int updateByPrimaryKey(OrdersSeckill record);
}