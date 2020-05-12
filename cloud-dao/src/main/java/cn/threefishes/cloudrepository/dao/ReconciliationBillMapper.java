package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ReconciliationBill;
import cn.threefishes.cloudrepository.entity.ReconciliationBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReconciliationBillMapper {
    long countByExample(ReconciliationBillExample example);

    int deleteByExample(ReconciliationBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(ReconciliationBill record);

    int insertSelective(ReconciliationBill record);

    List<ReconciliationBill> selectByExampleWithRowbounds(ReconciliationBillExample example, RowBounds rowBounds);

    List<ReconciliationBill> selectByExample(ReconciliationBillExample example);

    ReconciliationBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") ReconciliationBill record, @Param("example") ReconciliationBillExample example);

    int updateByExample(@Param("record") ReconciliationBill record, @Param("example") ReconciliationBillExample example);

    int updateByPrimaryKeySelective(ReconciliationBill record);

    int updateByPrimaryKey(ReconciliationBill record);
}