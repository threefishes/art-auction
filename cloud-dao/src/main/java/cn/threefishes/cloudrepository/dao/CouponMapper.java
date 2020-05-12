package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Coupon;
import cn.threefishes.cloudrepository.entity.CouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponMapper {
    long countByExample(CouponExample example);

    int deleteByExample(CouponExample example);

    int deleteByPrimaryKey(Integer couponId);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    List<Coupon> selectByExampleWithRowbounds(CouponExample example, RowBounds rowBounds);

    List<Coupon> selectByExample(CouponExample example);

    Coupon selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByExample(@Param("record") Coupon record, @Param("example") CouponExample example);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}