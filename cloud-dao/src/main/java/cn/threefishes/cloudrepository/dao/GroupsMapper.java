package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Groups;
import cn.threefishes.cloudrepository.entity.GroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GroupsMapper {
    long countByExample(GroupsExample example);

    int deleteByExample(GroupsExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(Groups record);

    int insertSelective(Groups record);

    List<Groups> selectByExampleWithRowbounds(GroupsExample example, RowBounds rowBounds);

    List<Groups> selectByExample(GroupsExample example);

    Groups selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByExample(@Param("record") Groups record, @Param("example") GroupsExample example);

    int updateByPrimaryKeySelective(Groups record);

    int updateByPrimaryKey(Groups record);
}