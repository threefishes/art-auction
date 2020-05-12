package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CancleRefund;
import cn.threefishes.cloudrepository.entity.CancleRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CancleRefundMapper {
    long countByExample(CancleRefundExample example);

    int deleteByExample(CancleRefundExample example);

    int deleteByPrimaryKey(Integer cancleRefundId);

    int insert(CancleRefund record);

    int insertSelective(CancleRefund record);

    List<CancleRefund> selectByExampleWithBLOBsWithRowbounds(CancleRefundExample example, RowBounds rowBounds);

    List<CancleRefund> selectByExampleWithBLOBs(CancleRefundExample example);

    List<CancleRefund> selectByExampleWithRowbounds(CancleRefundExample example, RowBounds rowBounds);

    List<CancleRefund> selectByExample(CancleRefundExample example);

    CancleRefund selectByPrimaryKey(Integer cancleRefundId);

    int updateByExampleSelective(@Param("record") CancleRefund record, @Param("example") CancleRefundExample example);

    int updateByExampleWithBLOBs(@Param("record") CancleRefund record, @Param("example") CancleRefundExample example);

    int updateByExample(@Param("record") CancleRefund record, @Param("example") CancleRefundExample example);

    int updateByPrimaryKeySelective(CancleRefund record);

    int updateByPrimaryKeyWithBLOBs(CancleRefund record);

    int updateByPrimaryKey(CancleRefund record);
}