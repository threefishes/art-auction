package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaskReceive;
import cn.threefishes.cloudrepository.entity.TaskReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskReceiveMapper {
    long countByExample(TaskReceiveExample example);

    int deleteByExample(TaskReceiveExample example);

    int deleteByPrimaryKey(Integer receiveId);

    int insert(TaskReceive record);

    int insertSelective(TaskReceive record);

    List<TaskReceive> selectByExampleWithRowbounds(TaskReceiveExample example, RowBounds rowBounds);

    List<TaskReceive> selectByExample(TaskReceiveExample example);

    TaskReceive selectByPrimaryKey(Integer receiveId);

    int updateByExampleSelective(@Param("record") TaskReceive record, @Param("example") TaskReceiveExample example);

    int updateByExample(@Param("record") TaskReceive record, @Param("example") TaskReceiveExample example);

    int updateByPrimaryKeySelective(TaskReceive record);

    int updateByPrimaryKey(TaskReceive record);
}