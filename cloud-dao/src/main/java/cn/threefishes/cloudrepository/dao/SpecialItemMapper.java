package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SpecialItem;
import cn.threefishes.cloudrepository.entity.SpecialItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecialItemMapper {
    long countByExample(SpecialItemExample example);

    int deleteByExample(SpecialItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(SpecialItem record);

    int insertSelective(SpecialItem record);

    List<SpecialItem> selectByExampleWithBLOBsWithRowbounds(SpecialItemExample example, RowBounds rowBounds);

    List<SpecialItem> selectByExampleWithBLOBs(SpecialItemExample example);

    List<SpecialItem> selectByExampleWithRowbounds(SpecialItemExample example, RowBounds rowBounds);

    List<SpecialItem> selectByExample(SpecialItemExample example);

    SpecialItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") SpecialItem record, @Param("example") SpecialItemExample example);

    int updateByExampleWithBLOBs(@Param("record") SpecialItem record, @Param("example") SpecialItemExample example);

    int updateByExample(@Param("record") SpecialItem record, @Param("example") SpecialItemExample example);

    int updateByPrimaryKeySelective(SpecialItem record);

    int updateByPrimaryKeyWithBLOBs(SpecialItem record);

    int updateByPrimaryKey(SpecialItem record);
}