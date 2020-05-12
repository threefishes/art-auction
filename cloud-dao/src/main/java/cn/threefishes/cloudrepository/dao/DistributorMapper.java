package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Distributor;
import cn.threefishes.cloudrepository.entity.DistributorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorMapper {
    long countByExample(DistributorExample example);

    int deleteByExample(DistributorExample example);

    int deleteByPrimaryKey(Integer distributorId);

    int insert(Distributor record);

    int insertSelective(Distributor record);

    List<Distributor> selectByExampleWithRowbounds(DistributorExample example, RowBounds rowBounds);

    List<Distributor> selectByExample(DistributorExample example);

    Distributor selectByPrimaryKey(Integer distributorId);

    int updateByExampleSelective(@Param("record") Distributor record, @Param("example") DistributorExample example);

    int updateByExample(@Param("record") Distributor record, @Param("example") DistributorExample example);

    int updateByPrimaryKeySelective(Distributor record);

    int updateByPrimaryKey(Distributor record);
}