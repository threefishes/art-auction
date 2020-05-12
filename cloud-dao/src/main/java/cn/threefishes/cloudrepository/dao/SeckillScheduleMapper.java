package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SeckillSchedule;
import cn.threefishes.cloudrepository.entity.SeckillScheduleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeckillScheduleMapper {
    long countByExample(SeckillScheduleExample example);

    int deleteByExample(SeckillScheduleExample example);

    int deleteByPrimaryKey(Integer scheduleId);

    int insert(SeckillSchedule record);

    int insertSelective(SeckillSchedule record);

    List<SeckillSchedule> selectByExampleWithRowbounds(SeckillScheduleExample example, RowBounds rowBounds);

    List<SeckillSchedule> selectByExample(SeckillScheduleExample example);

    SeckillSchedule selectByPrimaryKey(Integer scheduleId);

    int updateByExampleSelective(@Param("record") SeckillSchedule record, @Param("example") SeckillScheduleExample example);

    int updateByExample(@Param("record") SeckillSchedule record, @Param("example") SeckillScheduleExample example);

    int updateByPrimaryKeySelective(SeckillSchedule record);

    int updateByPrimaryKey(SeckillSchedule record);
}