package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainBillOnline;
import cn.threefishes.cloudrepository.entity.ChainBillOnlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainBillOnlineMapper {
    long countByExample(ChainBillOnlineExample example);

    int deleteByExample(ChainBillOnlineExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(ChainBillOnline record);

    int insertSelective(ChainBillOnline record);

    List<ChainBillOnline> selectByExampleWithRowbounds(ChainBillOnlineExample example, RowBounds rowBounds);

    List<ChainBillOnline> selectByExample(ChainBillOnlineExample example);

    ChainBillOnline selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") ChainBillOnline record, @Param("example") ChainBillOnlineExample example);

    int updateByExample(@Param("record") ChainBillOnline record, @Param("example") ChainBillOnlineExample example);

    int updateByPrimaryKeySelective(ChainBillOnline record);

    int updateByPrimaryKey(ChainBillOnline record);
}