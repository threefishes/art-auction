package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.OrdersPushInfo;
import cn.threefishes.cloudrepository.entity.OrdersPushInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OrdersPushInfoMapper {
    long countByExample(OrdersPushInfoExample example);

    int deleteByExample(OrdersPushInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrdersPushInfo record);

    int insertSelective(OrdersPushInfo record);

    List<OrdersPushInfo> selectByExampleWithRowbounds(OrdersPushInfoExample example, RowBounds rowBounds);

    List<OrdersPushInfo> selectByExample(OrdersPushInfoExample example);

    OrdersPushInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrdersPushInfo record, @Param("example") OrdersPushInfoExample example);

    int updateByExample(@Param("record") OrdersPushInfo record, @Param("example") OrdersPushInfoExample example);

    int updateByPrimaryKeySelective(OrdersPushInfo record);

    int updateByPrimaryKey(OrdersPushInfo record);
}