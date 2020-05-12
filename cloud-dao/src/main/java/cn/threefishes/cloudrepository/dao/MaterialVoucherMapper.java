package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MaterialVoucher;
import cn.threefishes.cloudrepository.entity.MaterialVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialVoucherMapper {
    long countByExample(MaterialVoucherExample example);

    int deleteByExample(MaterialVoucherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MaterialVoucher record);

    int insertSelective(MaterialVoucher record);

    List<MaterialVoucher> selectByExampleWithRowbounds(MaterialVoucherExample example, RowBounds rowBounds);

    List<MaterialVoucher> selectByExample(MaterialVoucherExample example);

    MaterialVoucher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MaterialVoucher record, @Param("example") MaterialVoucherExample example);

    int updateByExample(@Param("record") MaterialVoucher record, @Param("example") MaterialVoucherExample example);

    int updateByPrimaryKeySelective(MaterialVoucher record);

    int updateByPrimaryKey(MaterialVoucher record);
}