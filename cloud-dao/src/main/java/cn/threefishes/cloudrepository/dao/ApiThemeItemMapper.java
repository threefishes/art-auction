package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiThemeItem;
import cn.threefishes.cloudrepository.entity.ApiThemeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiThemeItemMapper {
    long countByExample(ApiThemeItemExample example);

    int deleteByExample(ApiThemeItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ApiThemeItem record);

    int insertSelective(ApiThemeItem record);

    List<ApiThemeItem> selectByExampleWithRowbounds(ApiThemeItemExample example, RowBounds rowBounds);

    List<ApiThemeItem> selectByExample(ApiThemeItemExample example);

    ApiThemeItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ApiThemeItem record, @Param("example") ApiThemeItemExample example);

    int updateByExample(@Param("record") ApiThemeItem record, @Param("example") ApiThemeItemExample example);

    int updateByPrimaryKeySelective(ApiThemeItem record);

    int updateByPrimaryKey(ApiThemeItem record);
}