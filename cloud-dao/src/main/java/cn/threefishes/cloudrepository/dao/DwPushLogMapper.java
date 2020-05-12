package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DwPushLog;
import cn.threefishes.cloudrepository.entity.DwPushLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DwPushLogMapper {
    long countByExample(DwPushLogExample example);

    int deleteByExample(DwPushLogExample example);

    int deleteByPrimaryKey(Integer pushLogId);

    int insert(DwPushLog record);

    int insertSelective(DwPushLog record);

    List<DwPushLog> selectByExampleWithRowbounds(DwPushLogExample example, RowBounds rowBounds);

    List<DwPushLog> selectByExample(DwPushLogExample example);

    DwPushLog selectByPrimaryKey(Integer pushLogId);

    int updateByExampleSelective(@Param("record") DwPushLog record, @Param("example") DwPushLogExample example);

    int updateByExample(@Param("record") DwPushLog record, @Param("example") DwPushLogExample example);

    int updateByPrimaryKeySelective(DwPushLog record);

    int updateByPrimaryKey(DwPushLog record);
}