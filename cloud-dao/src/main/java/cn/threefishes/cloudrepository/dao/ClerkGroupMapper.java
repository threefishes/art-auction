package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ClerkGroup;
import cn.threefishes.cloudrepository.entity.ClerkGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClerkGroupMapper {
    long countByExample(ClerkGroupExample example);

    int deleteByExample(ClerkGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(ClerkGroup record);

    int insertSelective(ClerkGroup record);

    List<ClerkGroup> selectByExampleWithRowbounds(ClerkGroupExample example, RowBounds rowBounds);

    List<ClerkGroup> selectByExample(ClerkGroupExample example);

    ClerkGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") ClerkGroup record, @Param("example") ClerkGroupExample example);

    int updateByExample(@Param("record") ClerkGroup record, @Param("example") ClerkGroupExample example);

    int updateByPrimaryKeySelective(ClerkGroup record);

    int updateByPrimaryKey(ClerkGroup record);
}