package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponUnuseGoods;
import cn.threefishes.cloudrepository.entity.CouponUnuseGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponUnuseGoodsMapper {
    long countByExample(CouponUnuseGoodsExample example);

    int deleteByExample(CouponUnuseGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponUnuseGoods record);

    int insertSelective(CouponUnuseGoods record);

    List<CouponUnuseGoods> selectByExampleWithRowbounds(CouponUnuseGoodsExample example, RowBounds rowBounds);

    List<CouponUnuseGoods> selectByExample(CouponUnuseGoodsExample example);

    CouponUnuseGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponUnuseGoods record, @Param("example") CouponUnuseGoodsExample example);

    int updateByExample(@Param("record") CouponUnuseGoods record, @Param("example") CouponUnuseGoodsExample example);

    int updateByPrimaryKeySelective(CouponUnuseGoods record);

    int updateByPrimaryKey(CouponUnuseGoods record);
}