package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ActivityGift;
import cn.threefishes.cloudrepository.entity.ActivityGiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityGiftMapper {
    long countByExample(ActivityGiftExample example);

    int deleteByExample(ActivityGiftExample example);

    int deleteByPrimaryKey(Integer giftId);

    int insert(ActivityGift record);

    int insertSelective(ActivityGift record);

    List<ActivityGift> selectByExampleWithRowbounds(ActivityGiftExample example, RowBounds rowBounds);

    List<ActivityGift> selectByExample(ActivityGiftExample example);

    ActivityGift selectByPrimaryKey(Integer giftId);

    int updateByExampleSelective(@Param("record") ActivityGift record, @Param("example") ActivityGiftExample example);

    int updateByExample(@Param("record") ActivityGift record, @Param("example") ActivityGiftExample example);

    int updateByPrimaryKeySelective(ActivityGift record);

    int updateByPrimaryKey(ActivityGift record);
}