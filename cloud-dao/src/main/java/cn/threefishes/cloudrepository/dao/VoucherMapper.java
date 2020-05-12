package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Voucher;
import cn.threefishes.cloudrepository.entity.VoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoucherMapper {
    long countByExample(VoucherExample example);

    int deleteByExample(VoucherExample example);

    int deleteByPrimaryKey(Integer voucherId);

    int insert(Voucher record);

    int insertSelective(Voucher record);

    List<Voucher> selectByExampleWithRowbounds(VoucherExample example, RowBounds rowBounds);

    List<Voucher> selectByExample(VoucherExample example);

    Voucher selectByPrimaryKey(Integer voucherId);

    int updateByExampleSelective(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByExample(@Param("record") Voucher record, @Param("example") VoucherExample example);

    int updateByPrimaryKeySelective(Voucher record);

    int updateByPrimaryKey(Voucher record);
}