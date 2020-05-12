package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ThemeItem;
import cn.threefishes.cloudrepository.entity.ThemeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThemeItemMapper {
    long countByExample(ThemeItemExample example);

    int deleteByExample(ThemeItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ThemeItem record);

    int insertSelective(ThemeItem record);

    List<ThemeItem> selectByExampleWithBLOBsWithRowbounds(ThemeItemExample example, RowBounds rowBounds);

    List<ThemeItem> selectByExampleWithBLOBs(ThemeItemExample example);

    List<ThemeItem> selectByExampleWithRowbounds(ThemeItemExample example, RowBounds rowBounds);

    List<ThemeItem> selectByExample(ThemeItemExample example);

    ThemeItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ThemeItem record, @Param("example") ThemeItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ThemeItem record, @Param("example") ThemeItemExample example);

    int updateByExample(@Param("record") ThemeItem record, @Param("example") ThemeItemExample example);

    int updateByPrimaryKeySelective(ThemeItem record);

    int updateByPrimaryKeyWithBLOBs(ThemeItem record);

    int updateByPrimaryKey(ThemeItem record);
}