package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdminGroup;
import cn.threefishes.cloudrepository.entity.AdminGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdminGroupMapper {
    long countByExample(AdminGroupExample example);

    int deleteByExample(AdminGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(AdminGroup record);

    int insertSelective(AdminGroup record);

    List<AdminGroup> selectByExampleWithRowbounds(AdminGroupExample example, RowBounds rowBounds);

    List<AdminGroup> selectByExample(AdminGroupExample example);

    AdminGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    int updateByExample(@Param("record") AdminGroup record, @Param("example") AdminGroupExample example);

    int updateByPrimaryKeySelective(AdminGroup record);

    int updateByPrimaryKey(AdminGroup record);
}