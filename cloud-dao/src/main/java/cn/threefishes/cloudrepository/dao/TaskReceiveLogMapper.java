package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaskReceiveLog;
import cn.threefishes.cloudrepository.entity.TaskReceiveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskReceiveLogMapper {
    long countByExample(TaskReceiveLogExample example);

    int deleteByExample(TaskReceiveLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(TaskReceiveLog record);

    int insertSelective(TaskReceiveLog record);

    List<TaskReceiveLog> selectByExampleWithRowbounds(TaskReceiveLogExample example, RowBounds rowBounds);

    List<TaskReceiveLog> selectByExample(TaskReceiveLogExample example);

    TaskReceiveLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") TaskReceiveLog record, @Param("example") TaskReceiveLogExample example);

    int updateByExample(@Param("record") TaskReceiveLog record, @Param("example") TaskReceiveLogExample example);

    int updateByPrimaryKeySelective(TaskReceiveLog record);

    int updateByPrimaryKey(TaskReceiveLog record);
}