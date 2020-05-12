package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionCommissionCash;
import cn.threefishes.cloudrepository.entity.DistributionCommissionCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionCommissionCashMapper {
    long countByExample(DistributionCommissionCashExample example);

    int deleteByExample(DistributionCommissionCashExample example);

    int deleteByPrimaryKey(Integer cashId);

    int insert(DistributionCommissionCash record);

    int insertSelective(DistributionCommissionCash record);

    List<DistributionCommissionCash> selectByExampleWithRowbounds(DistributionCommissionCashExample example, RowBounds rowBounds);

    List<DistributionCommissionCash> selectByExample(DistributionCommissionCashExample example);

    DistributionCommissionCash selectByPrimaryKey(Integer cashId);

    int updateByExampleSelective(@Param("record") DistributionCommissionCash record, @Param("example") DistributionCommissionCashExample example);

    int updateByExample(@Param("record") DistributionCommissionCash record, @Param("example") DistributionCommissionCashExample example);

    int updateByPrimaryKeySelective(DistributionCommissionCash record);

    int updateByPrimaryKey(DistributionCommissionCash record);
}