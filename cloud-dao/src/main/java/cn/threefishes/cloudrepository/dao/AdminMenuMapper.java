package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdminMenu;
import cn.threefishes.cloudrepository.entity.AdminMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdminMenuMapper {
    long countByExample(AdminMenuExample example);

    int deleteByExample(AdminMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminMenu record);

    int insertSelective(AdminMenu record);

    List<AdminMenu> selectByExampleWithRowbounds(AdminMenuExample example, RowBounds rowBounds);

    List<AdminMenu> selectByExample(AdminMenuExample example);

    AdminMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminMenu record, @Param("example") AdminMenuExample example);

    int updateByExample(@Param("record") AdminMenu record, @Param("example") AdminMenuExample example);

    int updateByPrimaryKeySelective(AdminMenu record);

    int updateByPrimaryKey(AdminMenu record);
}