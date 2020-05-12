package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundRecharge;
import cn.threefishes.cloudrepository.entity.RefundRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundRechargeMapper {
    long countByExample(RefundRechargeExample example);

    int deleteByExample(RefundRechargeExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(RefundRecharge record);

    int insertSelective(RefundRecharge record);

    List<RefundRecharge> selectByExampleWithRowbounds(RefundRechargeExample example, RowBounds rowBounds);

    List<RefundRecharge> selectByExample(RefundRechargeExample example);

    RefundRecharge selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") RefundRecharge record, @Param("example") RefundRechargeExample example);

    int updateByExample(@Param("record") RefundRecharge record, @Param("example") RefundRechargeExample example);

    int updateByPrimaryKeySelective(RefundRecharge record);

    int updateByPrimaryKey(RefundRecharge record);
}