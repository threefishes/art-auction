package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TempDataSetting;
import cn.threefishes.cloudrepository.entity.TempDataSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TempDataSettingMapper {
    long countByExample(TempDataSettingExample example);

    int deleteByExample(TempDataSettingExample example);

    int deleteByPrimaryKey(String title);

    int insert(TempDataSetting record);

    int insertSelective(TempDataSetting record);

    List<TempDataSetting> selectByExampleWithRowbounds(TempDataSettingExample example, RowBounds rowBounds);

    List<TempDataSetting> selectByExample(TempDataSettingExample example);

    TempDataSetting selectByPrimaryKey(String title);

    int updateByExampleSelective(@Param("record") TempDataSetting record, @Param("example") TempDataSettingExample example);

    int updateByExample(@Param("record") TempDataSetting record, @Param("example") TempDataSettingExample example);

    int updateByPrimaryKeySelective(TempDataSetting record);

    int updateByPrimaryKey(TempDataSetting record);
}