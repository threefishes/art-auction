package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TodayExplosionsSchedule;
import cn.threefishes.cloudrepository.entity.TodayExplosionsScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TodayExplosionsScheduleMapper {
    long countByExample(TodayExplosionsScheduleExample example);

    int deleteByExample(TodayExplosionsScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleId);

    int insert(TodayExplosionsSchedule record);

    int insertSelective(TodayExplosionsSchedule record);

    List<TodayExplosionsSchedule> selectByExampleWithRowbounds(TodayExplosionsScheduleExample example, RowBounds rowBounds);

    List<TodayExplosionsSchedule> selectByExample(TodayExplosionsScheduleExample example);

    TodayExplosionsSchedule selectByPrimaryKey(Integer scheduleId);

    int updateByExampleSelective(@Param("record") TodayExplosionsSchedule record, @Param("example") TodayExplosionsScheduleExample example);

    int updateByExample(@Param("record") TodayExplosionsSchedule record, @Param("example") TodayExplosionsScheduleExample example);

    int updateByPrimaryKeySelective(TodayExplosionsSchedule record);

    int updateByPrimaryKey(TodayExplosionsSchedule record);
}