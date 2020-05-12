package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatHours;
import cn.threefishes.cloudrepository.entity.StatHoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatHoursMapper {
    long countByExample(StatHoursExample example);

    int deleteByExample(StatHoursExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(StatHours record);

    int insertSelective(StatHours record);

    List<StatHours> selectByExampleWithRowbounds(StatHoursExample example, RowBounds rowBounds);

    List<StatHours> selectByExample(StatHoursExample example);

    StatHours selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") StatHours record, @Param("example") StatHoursExample example);

    int updateByExample(@Param("record") StatHours record, @Param("example") StatHoursExample example);

    int updateByPrimaryKeySelective(StatHours record);

    int updateByPrimaryKey(StatHours record);
}