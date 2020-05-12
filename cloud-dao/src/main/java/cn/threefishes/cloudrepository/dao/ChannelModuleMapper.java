package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChannelModule;
import cn.threefishes.cloudrepository.entity.ChannelModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChannelModuleMapper {
    long countByExample(ChannelModuleExample example);

    int deleteByExample(ChannelModuleExample example);

    int deleteByPrimaryKey(Integer moduleId);

    int insert(ChannelModule record);

    int insertSelective(ChannelModule record);

    List<ChannelModule> selectByExampleWithRowbounds(ChannelModuleExample example, RowBounds rowBounds);

    List<ChannelModule> selectByExample(ChannelModuleExample example);

    ChannelModule selectByPrimaryKey(Integer moduleId);

    int updateByExampleSelective(@Param("record") ChannelModule record, @Param("example") ChannelModuleExample example);

    int updateByExample(@Param("record") ChannelModule record, @Param("example") ChannelModuleExample example);

    int updateByPrimaryKeySelective(ChannelModule record);

    int updateByPrimaryKey(ChannelModule record);
}