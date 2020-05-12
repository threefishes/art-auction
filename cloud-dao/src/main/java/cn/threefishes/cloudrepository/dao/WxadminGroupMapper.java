package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WxadminGroup;
import cn.threefishes.cloudrepository.entity.WxadminGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxadminGroupMapper {
    long countByExample(WxadminGroupExample example);

    int deleteByExample(WxadminGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(WxadminGroup record);

    int insertSelective(WxadminGroup record);

    List<WxadminGroup> selectByExampleWithRowbounds(WxadminGroupExample example, RowBounds rowBounds);

    List<WxadminGroup> selectByExample(WxadminGroupExample example);

    WxadminGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") WxadminGroup record, @Param("example") WxadminGroupExample example);

    int updateByExample(@Param("record") WxadminGroup record, @Param("example") WxadminGroupExample example);

    int updateByPrimaryKeySelective(WxadminGroup record);

    int updateByPrimaryKey(WxadminGroup record);
}