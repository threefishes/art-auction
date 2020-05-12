package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionStoreStat;
import cn.threefishes.cloudrepository.entity.DistributionStoreStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionStoreStatMapper {
    long countByExample(DistributionStoreStatExample example);

    int deleteByExample(DistributionStoreStatExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(DistributionStoreStat record);

    int insertSelective(DistributionStoreStat record);

    List<DistributionStoreStat> selectByExampleWithRowbounds(DistributionStoreStatExample example, RowBounds rowBounds);

    List<DistributionStoreStat> selectByExample(DistributionStoreStatExample example);

    DistributionStoreStat selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") DistributionStoreStat record, @Param("example") DistributionStoreStatExample example);

    int updateByExample(@Param("record") DistributionStoreStat record, @Param("example") DistributionStoreStatExample example);

    int updateByPrimaryKeySelective(DistributionStoreStat record);

    int updateByPrimaryKey(DistributionStoreStat record);
}