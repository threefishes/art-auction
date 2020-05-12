package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdminLog;
import cn.threefishes.cloudrepository.entity.AdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdminLogMapper {
    long countByExample(AdminLogExample example);

    int deleteByExample(AdminLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(AdminLog record);

    int insertSelective(AdminLog record);

    List<AdminLog> selectByExampleWithRowbounds(AdminLogExample example, RowBounds rowBounds);

    List<AdminLog> selectByExample(AdminLogExample example);

    AdminLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByExample(@Param("record") AdminLog record, @Param("example") AdminLogExample example);

    int updateByPrimaryKeySelective(AdminLog record);

    int updateByPrimaryKey(AdminLog record);
}