package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShipnoPushdwFailLog;
import cn.threefishes.cloudrepository.entity.ShipnoPushdwFailLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShipnoPushdwFailLogMapper {
    long countByExample(ShipnoPushdwFailLogExample example);

    int deleteByExample(ShipnoPushdwFailLogExample example);

    int deleteByPrimaryKey(Integer shipnoLogId);

    int insert(ShipnoPushdwFailLog record);

    int insertSelective(ShipnoPushdwFailLog record);

    List<ShipnoPushdwFailLog> selectByExampleWithRowbounds(ShipnoPushdwFailLogExample example, RowBounds rowBounds);

    List<ShipnoPushdwFailLog> selectByExample(ShipnoPushdwFailLogExample example);

    ShipnoPushdwFailLog selectByPrimaryKey(Integer shipnoLogId);

    int updateByExampleSelective(@Param("record") ShipnoPushdwFailLog record, @Param("example") ShipnoPushdwFailLogExample example);

    int updateByExample(@Param("record") ShipnoPushdwFailLog record, @Param("example") ShipnoPushdwFailLogExample example);

    int updateByPrimaryKeySelective(ShipnoPushdwFailLog record);

    int updateByPrimaryKey(ShipnoPushdwFailLog record);
}