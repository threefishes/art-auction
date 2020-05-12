package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorStatsLog;
import cn.threefishes.cloudrepository.entity.DistributorStatsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorStatsLogMapper {
    long countByExample(DistributorStatsLogExample example);

    int deleteByExample(DistributorStatsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(DistributorStatsLog record);

    int insertSelective(DistributorStatsLog record);

    List<DistributorStatsLog> selectByExampleWithRowbounds(DistributorStatsLogExample example, RowBounds rowBounds);

    List<DistributorStatsLog> selectByExample(DistributorStatsLogExample example);

    DistributorStatsLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") DistributorStatsLog record, @Param("example") DistributorStatsLogExample example);

    int updateByExample(@Param("record") DistributorStatsLog record, @Param("example") DistributorStatsLogExample example);

    int updateByPrimaryKeySelective(DistributorStatsLog record);

    int updateByPrimaryKey(DistributorStatsLog record);
}