package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VoucherPwd;
import cn.threefishes.cloudrepository.entity.VoucherPwdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoucherPwdMapper {
    long countByExample(VoucherPwdExample example);

    int deleteByExample(VoucherPwdExample example);

    int deleteByPrimaryKey(Integer pwdId);

    int insert(VoucherPwd record);

    int insertSelective(VoucherPwd record);

    List<VoucherPwd> selectByExampleWithRowbounds(VoucherPwdExample example, RowBounds rowBounds);

    List<VoucherPwd> selectByExample(VoucherPwdExample example);

    VoucherPwd selectByPrimaryKey(Integer pwdId);

    int updateByExampleSelective(@Param("record") VoucherPwd record, @Param("example") VoucherPwdExample example);

    int updateByExample(@Param("record") VoucherPwd record, @Param("example") VoucherPwdExample example);

    int updateByPrimaryKeySelective(VoucherPwd record);

    int updateByPrimaryKey(VoucherPwd record);
}