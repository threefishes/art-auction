package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponUseGoods;
import cn.threefishes.cloudrepository.entity.CouponUseGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponUseGoodsMapper {
    long countByExample(CouponUseGoodsExample example);

    int deleteByExample(CouponUseGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CouponUseGoods record);

    int insertSelective(CouponUseGoods record);

    List<CouponUseGoods> selectByExampleWithRowbounds(CouponUseGoodsExample example, RowBounds rowBounds);

    List<CouponUseGoods> selectByExample(CouponUseGoodsExample example);

    CouponUseGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CouponUseGoods record, @Param("example") CouponUseGoodsExample example);

    int updateByExample(@Param("record") CouponUseGoods record, @Param("example") CouponUseGoodsExample example);

    int updateByPrimaryKeySelective(CouponUseGoods record);

    int updateByPrimaryKey(CouponUseGoods record);
}