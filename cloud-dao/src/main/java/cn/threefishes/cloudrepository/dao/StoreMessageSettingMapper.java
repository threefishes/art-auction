package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMessageSetting;
import cn.threefishes.cloudrepository.entity.StoreMessageSettingExample;
import cn.threefishes.cloudrepository.entity.StoreMessageSettingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMessageSettingMapper {
    long countByExample(StoreMessageSettingExample example);

    int deleteByExample(StoreMessageSettingExample example);

    int deleteByPrimaryKey(StoreMessageSettingKey key);

    int insert(StoreMessageSetting record);

    int insertSelective(StoreMessageSetting record);

    List<StoreMessageSetting> selectByExampleWithRowbounds(StoreMessageSettingExample example, RowBounds rowBounds);

    List<StoreMessageSetting> selectByExample(StoreMessageSettingExample example);

    StoreMessageSetting selectByPrimaryKey(StoreMessageSettingKey key);

    int updateByExampleSelective(@Param("record") StoreMessageSetting record, @Param("example") StoreMessageSettingExample example);

    int updateByExample(@Param("record") StoreMessageSetting record, @Param("example") StoreMessageSettingExample example);

    int updateByPrimaryKeySelective(StoreMessageSetting record);

    int updateByPrimaryKey(StoreMessageSetting record);
}