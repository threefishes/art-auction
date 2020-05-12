package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VirtualBill;
import cn.threefishes.cloudrepository.entity.VirtualBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VirtualBillMapper {
    long countByExample(VirtualBillExample example);

    int deleteByExample(VirtualBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(VirtualBill record);

    int insertSelective(VirtualBill record);

    List<VirtualBill> selectByExampleWithRowbounds(VirtualBillExample example, RowBounds rowBounds);

    List<VirtualBill> selectByExample(VirtualBillExample example);

    VirtualBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") VirtualBill record, @Param("example") VirtualBillExample example);

    int updateByExample(@Param("record") VirtualBill record, @Param("example") VirtualBillExample example);

    int updateByPrimaryKeySelective(VirtualBill record);

    int updateByPrimaryKey(VirtualBill record);
}