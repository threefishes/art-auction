package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersPushLog;
import cn.threefishes.cloudrepository.entity.OrdersPushLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersPushLogMapper {
    long countByExample(OrdersPushLogExample example);

    int deleteByExample(OrdersPushLogExample example);

    int deleteByPrimaryKey(Integer pushLogId);

    int insert(OrdersPushLog record);

    int insertSelective(OrdersPushLog record);

    List<OrdersPushLog> selectByExampleWithRowbounds(OrdersPushLogExample example, RowBounds rowBounds);

    List<OrdersPushLog> selectByExample(OrdersPushLogExample example);

    OrdersPushLog selectByPrimaryKey(Integer pushLogId);

    int updateByExampleSelective(@Param("record") OrdersPushLog record, @Param("example") OrdersPushLogExample example);

    int updateByExample(@Param("record") OrdersPushLog record, @Param("example") OrdersPushLogExample example);

    int updateByPrimaryKeySelective(OrdersPushLog record);

    int updateByPrimaryKey(OrdersPushLog record);
}