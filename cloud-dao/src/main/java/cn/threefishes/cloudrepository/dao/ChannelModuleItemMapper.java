package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChannelModuleItem;
import cn.threefishes.cloudrepository.entity.ChannelModuleItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChannelModuleItemMapper {
    long countByExample(ChannelModuleItemExample example);

    int deleteByExample(ChannelModuleItemExample example);

    int deleteByPrimaryKey(Integer moduleItemId);

    int insert(ChannelModuleItem record);

    int insertSelective(ChannelModuleItem record);

    List<ChannelModuleItem> selectByExampleWithBLOBsWithRowbounds(ChannelModuleItemExample example, RowBounds rowBounds);

    List<ChannelModuleItem> selectByExampleWithBLOBs(ChannelModuleItemExample example);

    List<ChannelModuleItem> selectByExampleWithRowbounds(ChannelModuleItemExample example, RowBounds rowBounds);

    List<ChannelModuleItem> selectByExample(ChannelModuleItemExample example);

    ChannelModuleItem selectByPrimaryKey(Integer moduleItemId);

    int updateByExampleSelective(@Param("record") ChannelModuleItem record, @Param("example") ChannelModuleItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ChannelModuleItem record, @Param("example") ChannelModuleItemExample example);

    int updateByExample(@Param("record") ChannelModuleItem record, @Param("example") ChannelModuleItemExample example);

    int updateByPrimaryKeySelective(ChannelModuleItem record);

    int updateByPrimaryKeyWithBLOBs(ChannelModuleItem record);

    int updateByPrimaryKey(ChannelModuleItem record);
}