package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PushReordersFailLog;
import cn.threefishes.cloudrepository.entity.PushReordersFailLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PushReordersFailLogMapper {
    long countByExample(PushReordersFailLogExample example);

    int deleteByExample(PushReordersFailLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(PushReordersFailLog record);

    int insertSelective(PushReordersFailLog record);

    List<PushReordersFailLog> selectByExampleWithRowbounds(PushReordersFailLogExample example, RowBounds rowBounds);

    List<PushReordersFailLog> selectByExample(PushReordersFailLogExample example);

    PushReordersFailLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") PushReordersFailLog record, @Param("example") PushReordersFailLogExample example);

    int updateByExample(@Param("record") PushReordersFailLog record, @Param("example") PushReordersFailLogExample example);

    int updateByPrimaryKeySelective(PushReordersFailLog record);

    int updateByPrimaryKey(PushReordersFailLog record);
}