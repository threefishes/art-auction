package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GroupLog;
import cn.threefishes.cloudrepository.entity.GroupLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GroupLogMapper {
    long countByExample(GroupLogExample example);

    int deleteByExample(GroupLogExample example);

    int deleteByPrimaryKey(Integer glId);

    int insert(GroupLog record);

    int insertSelective(GroupLog record);

    List<GroupLog> selectByExampleWithRowbounds(GroupLogExample example, RowBounds rowBounds);

    List<GroupLog> selectByExample(GroupLogExample example);

    GroupLog selectByPrimaryKey(Integer glId);

    int updateByExampleSelective(@Param("record") GroupLog record, @Param("example") GroupLogExample example);

    int updateByExample(@Param("record") GroupLog record, @Param("example") GroupLogExample example);

    int updateByPrimaryKeySelective(GroupLog record);

    int updateByPrimaryKey(GroupLog record);
}