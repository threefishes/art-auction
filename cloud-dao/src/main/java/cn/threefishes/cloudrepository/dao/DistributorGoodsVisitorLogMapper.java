package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorGoodsVisitorLog;
import cn.threefishes.cloudrepository.entity.DistributorGoodsVisitorLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorGoodsVisitorLogMapper {
    long countByExample(DistributorGoodsVisitorLogExample example);

    int deleteByExample(DistributorGoodsVisitorLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(DistributorGoodsVisitorLog record);

    int insertSelective(DistributorGoodsVisitorLog record);

    List<DistributorGoodsVisitorLog> selectByExampleWithRowbounds(DistributorGoodsVisitorLogExample example, RowBounds rowBounds);

    List<DistributorGoodsVisitorLog> selectByExample(DistributorGoodsVisitorLogExample example);

    DistributorGoodsVisitorLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") DistributorGoodsVisitorLog record, @Param("example") DistributorGoodsVisitorLogExample example);

    int updateByExample(@Param("record") DistributorGoodsVisitorLog record, @Param("example") DistributorGoodsVisitorLogExample example);

    int updateByPrimaryKeySelective(DistributorGoodsVisitorLog record);

    int updateByPrimaryKey(DistributorGoodsVisitorLog record);
}