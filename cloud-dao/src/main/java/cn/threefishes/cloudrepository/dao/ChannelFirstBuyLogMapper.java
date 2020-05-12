package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChannelFirstBuyLog;
import cn.threefishes.cloudrepository.entity.ChannelFirstBuyLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChannelFirstBuyLogMapper {
    long countByExample(ChannelFirstBuyLogExample example);

    int deleteByExample(ChannelFirstBuyLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChannelFirstBuyLog record);

    int insertSelective(ChannelFirstBuyLog record);

    List<ChannelFirstBuyLog> selectByExampleWithRowbounds(ChannelFirstBuyLogExample example, RowBounds rowBounds);

    List<ChannelFirstBuyLog> selectByExample(ChannelFirstBuyLogExample example);

    ChannelFirstBuyLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChannelFirstBuyLog record, @Param("example") ChannelFirstBuyLogExample example);

    int updateByExample(@Param("record") ChannelFirstBuyLog record, @Param("example") ChannelFirstBuyLogExample example);

    int updateByPrimaryKeySelective(ChannelFirstBuyLog record);

    int updateByPrimaryKey(ChannelFirstBuyLog record);
}