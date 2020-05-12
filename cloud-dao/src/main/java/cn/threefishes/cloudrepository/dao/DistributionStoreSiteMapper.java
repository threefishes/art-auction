package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionStoreSite;
import cn.threefishes.cloudrepository.entity.DistributionStoreSiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionStoreSiteMapper {
    long countByExample(DistributionStoreSiteExample example);

    int deleteByExample(DistributionStoreSiteExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(DistributionStoreSite record);

    int insertSelective(DistributionStoreSite record);

    List<DistributionStoreSite> selectByExampleWithRowbounds(DistributionStoreSiteExample example, RowBounds rowBounds);

    List<DistributionStoreSite> selectByExample(DistributionStoreSiteExample example);

    DistributionStoreSite selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") DistributionStoreSite record, @Param("example") DistributionStoreSiteExample example);

    int updateByExample(@Param("record") DistributionStoreSite record, @Param("example") DistributionStoreSiteExample example);

    int updateByPrimaryKeySelective(DistributionStoreSite record);

    int updateByPrimaryKey(DistributionStoreSite record);
}