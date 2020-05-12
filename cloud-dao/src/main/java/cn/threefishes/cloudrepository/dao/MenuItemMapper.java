package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MenuItem;
import cn.threefishes.cloudrepository.entity.MenuItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuItemMapper {
    long countByExample(MenuItemExample example);

    int deleteByExample(MenuItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(MenuItem record);

    int insertSelective(MenuItem record);

    List<MenuItem> selectByExampleWithRowbounds(MenuItemExample example, RowBounds rowBounds);

    List<MenuItem> selectByExample(MenuItemExample example);

    MenuItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") MenuItem record, @Param("example") MenuItemExample example);

    int updateByExample(@Param("record") MenuItem record, @Param("example") MenuItemExample example);

    int updateByPrimaryKeySelective(MenuItem record);

    int updateByPrimaryKey(MenuItem record);
}