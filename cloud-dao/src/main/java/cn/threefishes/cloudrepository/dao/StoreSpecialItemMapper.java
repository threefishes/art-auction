package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreSpecialItem;
import cn.threefishes.cloudrepository.entity.StoreSpecialItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreSpecialItemMapper {
    long countByExample(StoreSpecialItemExample example);

    int deleteByExample(StoreSpecialItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(StoreSpecialItem record);

    int insertSelective(StoreSpecialItem record);

    List<StoreSpecialItem> selectByExampleWithBLOBsWithRowbounds(StoreSpecialItemExample example, RowBounds rowBounds);

    List<StoreSpecialItem> selectByExampleWithBLOBs(StoreSpecialItemExample example);

    List<StoreSpecialItem> selectByExampleWithRowbounds(StoreSpecialItemExample example, RowBounds rowBounds);

    List<StoreSpecialItem> selectByExample(StoreSpecialItemExample example);

    StoreSpecialItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") StoreSpecialItem record, @Param("example") StoreSpecialItemExample example);

    int updateByExampleWithBLOBs(@Param("record") StoreSpecialItem record, @Param("example") StoreSpecialItemExample example);

    int updateByExample(@Param("record") StoreSpecialItem record, @Param("example") StoreSpecialItemExample example);

    int updateByPrimaryKeySelective(StoreSpecialItem record);

    int updateByPrimaryKeyWithBLOBs(StoreSpecialItem record);

    int updateByPrimaryKey(StoreSpecialItem record);
}