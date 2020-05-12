package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainStatOrdersUpdateTask;
import cn.threefishes.cloudrepository.entity.ChainStatOrdersUpdateTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainStatOrdersUpdateTaskMapper {
    long countByExample(ChainStatOrdersUpdateTaskExample example);

    int deleteByExample(ChainStatOrdersUpdateTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(ChainStatOrdersUpdateTask record);

    int insertSelective(ChainStatOrdersUpdateTask record);

    List<ChainStatOrdersUpdateTask> selectByExampleWithRowbounds(ChainStatOrdersUpdateTaskExample example, RowBounds rowBounds);

    List<ChainStatOrdersUpdateTask> selectByExample(ChainStatOrdersUpdateTaskExample example);

    ChainStatOrdersUpdateTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") ChainStatOrdersUpdateTask record, @Param("example") ChainStatOrdersUpdateTaskExample example);

    int updateByExample(@Param("record") ChainStatOrdersUpdateTask record, @Param("example") ChainStatOrdersUpdateTaskExample example);

    int updateByPrimaryKeySelective(ChainStatOrdersUpdateTask record);

    int updateByPrimaryKey(ChainStatOrdersUpdateTask record);
}