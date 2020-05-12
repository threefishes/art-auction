package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionBill;
import cn.threefishes.cloudrepository.entity.DistributionBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionBillMapper {
    long countByExample(DistributionBillExample example);

    int deleteByExample(DistributionBillExample example);

    int deleteByPrimaryKey(Integer distributionBillId);

    int insert(DistributionBill record);

    int insertSelective(DistributionBill record);

    List<DistributionBill> selectByExampleWithRowbounds(DistributionBillExample example, RowBounds rowBounds);

    List<DistributionBill> selectByExample(DistributionBillExample example);

    DistributionBill selectByPrimaryKey(Integer distributionBillId);

    int updateByExampleSelective(@Param("record") DistributionBill record, @Param("example") DistributionBillExample example);

    int updateByExample(@Param("record") DistributionBill record, @Param("example") DistributionBillExample example);

    int updateByPrimaryKeySelective(DistributionBill record);

    int updateByPrimaryKey(DistributionBill record);
}