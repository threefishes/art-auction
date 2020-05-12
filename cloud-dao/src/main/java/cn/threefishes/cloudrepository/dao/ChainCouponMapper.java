package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainCoupon;
import cn.threefishes.cloudrepository.entity.ChainCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainCouponMapper {
    long countByExample(ChainCouponExample example);

    int deleteByExample(ChainCouponExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChainCoupon record);

    int insertSelective(ChainCoupon record);

    List<ChainCoupon> selectByExampleWithRowbounds(ChainCouponExample example, RowBounds rowBounds);

    List<ChainCoupon> selectByExample(ChainCouponExample example);

    ChainCoupon selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChainCoupon record, @Param("example") ChainCouponExample example);

    int updateByExample(@Param("record") ChainCoupon record, @Param("example") ChainCouponExample example);

    int updateByPrimaryKeySelective(ChainCoupon record);

    int updateByPrimaryKey(ChainCoupon record);
}