package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainBillOffline;
import cn.threefishes.cloudrepository.entity.ChainBillOfflineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainBillOfflineMapper {
    long countByExample(ChainBillOfflineExample example);

    int deleteByExample(ChainBillOfflineExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(ChainBillOffline record);

    int insertSelective(ChainBillOffline record);

    List<ChainBillOffline> selectByExampleWithRowbounds(ChainBillOfflineExample example, RowBounds rowBounds);

    List<ChainBillOffline> selectByExample(ChainBillOfflineExample example);

    ChainBillOffline selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") ChainBillOffline record, @Param("example") ChainBillOfflineExample example);

    int updateByExample(@Param("record") ChainBillOffline record, @Param("example") ChainBillOfflineExample example);

    int updateByPrimaryKeySelective(ChainBillOffline record);

    int updateByPrimaryKey(ChainBillOffline record);
}