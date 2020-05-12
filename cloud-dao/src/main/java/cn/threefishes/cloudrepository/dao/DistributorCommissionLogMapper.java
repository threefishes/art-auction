package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorCommissionLog;
import cn.threefishes.cloudrepository.entity.DistributorCommissionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorCommissionLogMapper {
    long countByExample(DistributorCommissionLogExample example);

    int deleteByExample(DistributorCommissionLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(DistributorCommissionLog record);

    int insertSelective(DistributorCommissionLog record);

    List<DistributorCommissionLog> selectByExampleWithRowbounds(DistributorCommissionLogExample example, RowBounds rowBounds);

    List<DistributorCommissionLog> selectByExample(DistributorCommissionLogExample example);

    DistributorCommissionLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") DistributorCommissionLog record, @Param("example") DistributorCommissionLogExample example);

    int updateByExample(@Param("record") DistributorCommissionLog record, @Param("example") DistributorCommissionLogExample example);

    int updateByPrimaryKeySelective(DistributorCommissionLog record);

    int updateByPrimaryKey(DistributorCommissionLog record);
}