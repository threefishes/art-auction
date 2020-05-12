package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Gift;
import cn.threefishes.cloudrepository.entity.GiftExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GiftMapper {
    long countByExample(GiftExample example);

    int deleteByExample(GiftExample example);

    int deleteByPrimaryKey(Integer giftId);

    int insert(Gift record);

    int insertSelective(Gift record);

    List<Gift> selectByExampleWithRowbounds(GiftExample example, RowBounds rowBounds);

    List<Gift> selectByExample(GiftExample example);

    Gift selectByPrimaryKey(Integer giftId);

    int updateByExampleSelective(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByExample(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}