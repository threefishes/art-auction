package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Theme;
import cn.threefishes.cloudrepository.entity.ThemeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThemeMapper {
    long countByExample(ThemeExample example);

    int deleteByExample(ThemeExample example);

    int deleteByPrimaryKey(Integer themeId);

    int insert(Theme record);

    int insertSelective(Theme record);

    List<Theme> selectByExampleWithRowbounds(ThemeExample example, RowBounds rowBounds);

    List<Theme> selectByExample(ThemeExample example);

    Theme selectByPrimaryKey(Integer themeId);

    int updateByExampleSelective(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByExample(@Param("record") Theme record, @Param("example") ThemeExample example);

    int updateByPrimaryKeySelective(Theme record);

    int updateByPrimaryKey(Theme record);
}