package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorUpLog;
import cn.threefishes.cloudrepository.entity.DistributorUpLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorUpLogMapper {
    long countByExample(DistributorUpLogExample example);

    int deleteByExample(DistributorUpLogExample example);

    int deleteByPrimaryKey(Integer distributorUpLogId);

    int insert(DistributorUpLog record);

    int insertSelective(DistributorUpLog record);

    List<DistributorUpLog> selectByExampleWithRowbounds(DistributorUpLogExample example, RowBounds rowBounds);

    List<DistributorUpLog> selectByExample(DistributorUpLogExample example);

    DistributorUpLog selectByPrimaryKey(Integer distributorUpLogId);

    int updateByExampleSelective(@Param("record") DistributorUpLog record, @Param("example") DistributorUpLogExample example);

    int updateByExample(@Param("record") DistributorUpLog record, @Param("example") DistributorUpLogExample example);

    int updateByPrimaryKeySelective(DistributorUpLog record);

    int updateByPrimaryKey(DistributorUpLog record);
}