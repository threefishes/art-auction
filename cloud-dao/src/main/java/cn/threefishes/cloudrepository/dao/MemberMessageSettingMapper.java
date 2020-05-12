package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberMessageSetting;
import cn.threefishes.cloudrepository.entity.MemberMessageSettingExample;
import cn.threefishes.cloudrepository.entity.MemberMessageSettingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberMessageSettingMapper {
    long countByExample(MemberMessageSettingExample example);

    int deleteByExample(MemberMessageSettingExample example);

    int deleteByPrimaryKey(MemberMessageSettingKey key);

    int insert(MemberMessageSetting record);

    int insertSelective(MemberMessageSetting record);

    List<MemberMessageSetting> selectByExampleWithRowbounds(MemberMessageSettingExample example, RowBounds rowBounds);

    List<MemberMessageSetting> selectByExample(MemberMessageSettingExample example);

    MemberMessageSetting selectByPrimaryKey(MemberMessageSettingKey key);

    int updateByExampleSelective(@Param("record") MemberMessageSetting record, @Param("example") MemberMessageSettingExample example);

    int updateByExample(@Param("record") MemberMessageSetting record, @Param("example") MemberMessageSettingExample example);

    int updateByPrimaryKeySelective(MemberMessageSetting record);

    int updateByPrimaryKey(MemberMessageSetting record);
}