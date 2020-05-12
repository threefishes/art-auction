package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionTeamBill;
import cn.threefishes.cloudrepository.entity.DistributionTeamBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionTeamBillMapper {
    long countByExample(DistributionTeamBillExample example);

    int deleteByExample(DistributionTeamBillExample example);

    int deleteByPrimaryKey(Integer teamBillId);

    int insert(DistributionTeamBill record);

    int insertSelective(DistributionTeamBill record);

    List<DistributionTeamBill> selectByExampleWithRowbounds(DistributionTeamBillExample example, RowBounds rowBounds);

    List<DistributionTeamBill> selectByExample(DistributionTeamBillExample example);

    DistributionTeamBill selectByPrimaryKey(Integer teamBillId);

    int updateByExampleSelective(@Param("record") DistributionTeamBill record, @Param("example") DistributionTeamBillExample example);

    int updateByExample(@Param("record") DistributionTeamBill record, @Param("example") DistributionTeamBillExample example);

    int updateByPrimaryKeySelective(DistributionTeamBill record);

    int updateByPrimaryKey(DistributionTeamBill record);
}