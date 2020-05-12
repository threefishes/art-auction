package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainCouponActivity;
import cn.threefishes.cloudrepository.entity.ChainCouponActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainCouponActivityMapper {
    long countByExample(ChainCouponActivityExample example);

    int deleteByExample(ChainCouponActivityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChainCouponActivity record);

    int insertSelective(ChainCouponActivity record);

    List<ChainCouponActivity> selectByExampleWithRowbounds(ChainCouponActivityExample example, RowBounds rowBounds);

    List<ChainCouponActivity> selectByExample(ChainCouponActivityExample example);

    ChainCouponActivity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChainCouponActivity record, @Param("example") ChainCouponActivityExample example);

    int updateByExample(@Param("record") ChainCouponActivity record, @Param("example") ChainCouponActivityExample example);

    int updateByPrimaryKeySelective(ChainCouponActivity record);

    int updateByPrimaryKey(ChainCouponActivity record);
}