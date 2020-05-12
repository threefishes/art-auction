package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatOrdersUpdateTask;
import cn.threefishes.cloudrepository.entity.StatOrdersUpdateTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatOrdersUpdateTaskMapper {
    long countByExample(StatOrdersUpdateTaskExample example);

    int deleteByExample(StatOrdersUpdateTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(StatOrdersUpdateTask record);

    int insertSelective(StatOrdersUpdateTask record);

    List<StatOrdersUpdateTask> selectByExampleWithRowbounds(StatOrdersUpdateTaskExample example, RowBounds rowBounds);

    List<StatOrdersUpdateTask> selectByExample(StatOrdersUpdateTaskExample example);

    StatOrdersUpdateTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") StatOrdersUpdateTask record, @Param("example") StatOrdersUpdateTaskExample example);

    int updateByExample(@Param("record") StatOrdersUpdateTask record, @Param("example") StatOrdersUpdateTaskExample example);

    int updateByPrimaryKeySelective(StatOrdersUpdateTask record);

    int updateByPrimaryKey(StatOrdersUpdateTask record);
}