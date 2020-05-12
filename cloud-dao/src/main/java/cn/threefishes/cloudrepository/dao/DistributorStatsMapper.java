package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorStats;
import cn.threefishes.cloudrepository.entity.DistributorStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorStatsMapper {
    long countByExample(DistributorStatsExample example);

    int deleteByExample(DistributorStatsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DistributorStats record);

    int insertSelective(DistributorStats record);

    List<DistributorStats> selectByExampleWithRowbounds(DistributorStatsExample example, RowBounds rowBounds);

    List<DistributorStats> selectByExample(DistributorStatsExample example);

    DistributorStats selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DistributorStats record, @Param("example") DistributorStatsExample example);

    int updateByExample(@Param("record") DistributorStats record, @Param("example") DistributorStatsExample example);

    int updateByPrimaryKeySelective(DistributorStats record);

    int updateByPrimaryKey(DistributorStats record);
}