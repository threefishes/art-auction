package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatStoreHours;
import cn.threefishes.cloudrepository.entity.StatStoreHoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatStoreHoursMapper {
    long countByExample(StatStoreHoursExample example);

    int deleteByExample(StatStoreHoursExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(StatStoreHours record);

    int insertSelective(StatStoreHours record);

    List<StatStoreHours> selectByExampleWithRowbounds(StatStoreHoursExample example, RowBounds rowBounds);

    List<StatStoreHours> selectByExample(StatStoreHoursExample example);

    StatStoreHours selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") StatStoreHours record, @Param("example") StatStoreHoursExample example);

    int updateByExample(@Param("record") StatStoreHours record, @Param("example") StatStoreHoursExample example);

    int updateByPrimaryKeySelective(StatStoreHours record);

    int updateByPrimaryKey(StatStoreHours record);
}