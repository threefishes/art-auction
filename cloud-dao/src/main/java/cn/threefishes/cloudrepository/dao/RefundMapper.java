package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Refund;
import cn.threefishes.cloudrepository.entity.RefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundMapper {
    long countByExample(RefundExample example);

    int deleteByExample(RefundExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(Refund record);

    int insertSelective(Refund record);

    List<Refund> selectByExampleWithBLOBsWithRowbounds(RefundExample example, RowBounds rowBounds);

    List<Refund> selectByExampleWithBLOBs(RefundExample example);

    List<Refund> selectByExampleWithRowbounds(RefundExample example, RowBounds rowBounds);

    List<Refund> selectByExample(RefundExample example);

    Refund selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExampleWithBLOBs(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByExample(@Param("record") Refund record, @Param("example") RefundExample example);

    int updateByPrimaryKeySelective(Refund record);

    int updateByPrimaryKeyWithBLOBs(Refund record);

    int updateByPrimaryKey(Refund record);
}