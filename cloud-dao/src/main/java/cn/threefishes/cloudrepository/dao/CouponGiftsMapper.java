package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponGifts;
import cn.threefishes.cloudrepository.entity.CouponGiftsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponGiftsMapper {
    long countByExample(CouponGiftsExample example);

    int deleteByExample(CouponGiftsExample example);

    int deleteByPrimaryKey(Integer giftsId);

    int insert(CouponGifts record);

    int insertSelective(CouponGifts record);

    List<CouponGifts> selectByExampleWithRowbounds(CouponGiftsExample example, RowBounds rowBounds);

    List<CouponGifts> selectByExample(CouponGiftsExample example);

    CouponGifts selectByPrimaryKey(Integer giftsId);

    int updateByExampleSelective(@Param("record") CouponGifts record, @Param("example") CouponGiftsExample example);

    int updateByExample(@Param("record") CouponGifts record, @Param("example") CouponGiftsExample example);

    int updateByPrimaryKeySelective(CouponGifts record);

    int updateByPrimaryKey(CouponGifts record);
}