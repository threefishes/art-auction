package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GroupOpen;
import cn.threefishes.cloudrepository.entity.GroupOpenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GroupOpenMapper {
    long countByExample(GroupOpenExample example);

    int deleteByExample(GroupOpenExample example);

    int deleteByPrimaryKey(Integer goId);

    int insert(GroupOpen record);

    int insertSelective(GroupOpen record);

    List<GroupOpen> selectByExampleWithRowbounds(GroupOpenExample example, RowBounds rowBounds);

    List<GroupOpen> selectByExample(GroupOpenExample example);

    GroupOpen selectByPrimaryKey(Integer goId);

    int updateByExampleSelective(@Param("record") GroupOpen record, @Param("example") GroupOpenExample example);

    int updateByExample(@Param("record") GroupOpen record, @Param("example") GroupOpenExample example);

    int updateByPrimaryKeySelective(GroupOpen record);

    int updateByPrimaryKey(GroupOpen record);
}