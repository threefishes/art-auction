package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponActivity;
import cn.threefishes.cloudrepository.entity.CouponActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponActivityMapper {
    long countByExample(CouponActivityExample example);

    int deleteByExample(CouponActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(CouponActivity record);

    int insertSelective(CouponActivity record);

    List<CouponActivity> selectByExampleWithRowbounds(CouponActivityExample example, RowBounds rowBounds);

    List<CouponActivity> selectByExample(CouponActivityExample example);

    CouponActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") CouponActivity record, @Param("example") CouponActivityExample example);

    int updateByExample(@Param("record") CouponActivity record, @Param("example") CouponActivityExample example);

    int updateByPrimaryKeySelective(CouponActivity record);

    int updateByPrimaryKey(CouponActivity record);
}