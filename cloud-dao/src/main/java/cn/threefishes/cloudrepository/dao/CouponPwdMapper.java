package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponPwd;
import cn.threefishes.cloudrepository.entity.CouponPwdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponPwdMapper {
    long countByExample(CouponPwdExample example);

    int deleteByExample(CouponPwdExample example);

    int deleteByPrimaryKey(Integer pwdId);

    int insert(CouponPwd record);

    int insertSelective(CouponPwd record);

    List<CouponPwd> selectByExampleWithRowbounds(CouponPwdExample example, RowBounds rowBounds);

    List<CouponPwd> selectByExample(CouponPwdExample example);

    CouponPwd selectByPrimaryKey(Integer pwdId);

    int updateByExampleSelective(@Param("record") CouponPwd record, @Param("example") CouponPwdExample example);

    int updateByExample(@Param("record") CouponPwd record, @Param("example") CouponPwdExample example);

    int updateByPrimaryKeySelective(CouponPwd record);

    int updateByPrimaryKey(CouponPwd record);
}