package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatSetting;
import cn.threefishes.cloudrepository.entity.StatSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatSettingMapper {
    long countByExample(StatSettingExample example);

    int deleteByExample(StatSettingExample example);

    int deleteByPrimaryKey(String title);

    int insert(StatSetting record);

    int insertSelective(StatSetting record);

    List<StatSetting> selectByExampleWithRowbounds(StatSettingExample example, RowBounds rowBounds);

    List<StatSetting> selectByExample(StatSettingExample example);

    StatSetting selectByPrimaryKey(String title);

    int updateByExampleSelective(@Param("record") StatSetting record, @Param("example") StatSettingExample example);

    int updateByExample(@Param("record") StatSetting record, @Param("example") StatSettingExample example);

    int updateByPrimaryKeySelective(StatSetting record);

    int updateByPrimaryKey(StatSetting record);
}