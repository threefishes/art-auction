package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorCommissionStats;
import cn.threefishes.cloudrepository.entity.DistributorCommissionStatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorCommissionStatsMapper {
    long countByExample(DistributorCommissionStatsExample example);

    int deleteByExample(DistributorCommissionStatsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DistributorCommissionStats record);

    int insertSelective(DistributorCommissionStats record);

    List<DistributorCommissionStats> selectByExampleWithRowbounds(DistributorCommissionStatsExample example, RowBounds rowBounds);

    List<DistributorCommissionStats> selectByExample(DistributorCommissionStatsExample example);

    DistributorCommissionStats selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DistributorCommissionStats record, @Param("example") DistributorCommissionStatsExample example);

    int updateByExample(@Param("record") DistributorCommissionStats record, @Param("example") DistributorCommissionStatsExample example);

    int updateByPrimaryKeySelective(DistributorCommissionStats record);

    int updateByPrimaryKey(DistributorCommissionStats record);
}