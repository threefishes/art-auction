package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ClerkGroupPermission;
import cn.threefishes.cloudrepository.entity.ClerkGroupPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ClerkGroupPermissionMapper {
    long countByExample(ClerkGroupPermissionExample example);

    int deleteByExample(ClerkGroupPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClerkGroupPermission record);

    int insertSelective(ClerkGroupPermission record);

    List<ClerkGroupPermission> selectByExampleWithRowbounds(ClerkGroupPermissionExample example, RowBounds rowBounds);

    List<ClerkGroupPermission> selectByExample(ClerkGroupPermissionExample example);

    ClerkGroupPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClerkGroupPermission record, @Param("example") ClerkGroupPermissionExample example);

    int updateByExample(@Param("record") ClerkGroupPermission record, @Param("example") ClerkGroupPermissionExample example);

    int updateByPrimaryKeySelective(ClerkGroupPermission record);

    int updateByPrimaryKey(ClerkGroupPermission record);
}