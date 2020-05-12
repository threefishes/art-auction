package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdminGroupPermission;
import cn.threefishes.cloudrepository.entity.AdminGroupPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdminGroupPermissionMapper {
    long countByExample(AdminGroupPermissionExample example);

    int deleteByExample(AdminGroupPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminGroupPermission record);

    int insertSelective(AdminGroupPermission record);

    List<AdminGroupPermission> selectByExampleWithRowbounds(AdminGroupPermissionExample example, RowBounds rowBounds);

    List<AdminGroupPermission> selectByExample(AdminGroupPermissionExample example);

    AdminGroupPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminGroupPermission record, @Param("example") AdminGroupPermissionExample example);

    int updateByExample(@Param("record") AdminGroupPermission record, @Param("example") AdminGroupPermissionExample example);

    int updateByPrimaryKeySelective(AdminGroupPermission record);

    int updateByPrimaryKey(AdminGroupPermission record);
}