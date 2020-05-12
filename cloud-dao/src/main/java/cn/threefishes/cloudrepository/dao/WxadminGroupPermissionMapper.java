package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WxadminGroupPermission;
import cn.threefishes.cloudrepository.entity.WxadminGroupPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxadminGroupPermissionMapper {
    long countByExample(WxadminGroupPermissionExample example);

    int deleteByExample(WxadminGroupPermissionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxadminGroupPermission record);

    int insertSelective(WxadminGroupPermission record);

    List<WxadminGroupPermission> selectByExampleWithRowbounds(WxadminGroupPermissionExample example, RowBounds rowBounds);

    List<WxadminGroupPermission> selectByExample(WxadminGroupPermissionExample example);

    WxadminGroupPermission selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxadminGroupPermission record, @Param("example") WxadminGroupPermissionExample example);

    int updateByExample(@Param("record") WxadminGroupPermission record, @Param("example") WxadminGroupPermissionExample example);

    int updateByPrimaryKeySelective(WxadminGroupPermission record);

    int updateByPrimaryKey(WxadminGroupPermission record);
}