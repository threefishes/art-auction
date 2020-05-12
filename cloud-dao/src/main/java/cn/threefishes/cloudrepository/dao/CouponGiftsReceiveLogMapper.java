package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CouponGiftsReceiveLog;
import cn.threefishes.cloudrepository.entity.CouponGiftsReceiveLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CouponGiftsReceiveLogMapper {
    long countByExample(CouponGiftsReceiveLogExample example);

    int deleteByExample(CouponGiftsReceiveLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(CouponGiftsReceiveLog record);

    int insertSelective(CouponGiftsReceiveLog record);

    List<CouponGiftsReceiveLog> selectByExampleWithRowbounds(CouponGiftsReceiveLogExample example, RowBounds rowBounds);

    List<CouponGiftsReceiveLog> selectByExample(CouponGiftsReceiveLogExample example);

    CouponGiftsReceiveLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") CouponGiftsReceiveLog record, @Param("example") CouponGiftsReceiveLogExample example);

    int updateByExample(@Param("record") CouponGiftsReceiveLog record, @Param("example") CouponGiftsReceiveLogExample example);

    int updateByPrimaryKeySelective(CouponGiftsReceiveLog record);

    int updateByPrimaryKey(CouponGiftsReceiveLog record);
}