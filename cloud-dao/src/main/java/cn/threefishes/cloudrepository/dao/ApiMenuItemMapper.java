package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiMenuItem;
import cn.threefishes.cloudrepository.entity.ApiMenuItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiMenuItemMapper {
    long countByExample(ApiMenuItemExample example);

    int deleteByExample(ApiMenuItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ApiMenuItem record);

    int insertSelective(ApiMenuItem record);

    List<ApiMenuItem> selectByExampleWithRowbounds(ApiMenuItemExample example, RowBounds rowBounds);

    List<ApiMenuItem> selectByExample(ApiMenuItemExample example);

    ApiMenuItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ApiMenuItem record, @Param("example") ApiMenuItemExample example);

    int updateByExample(@Param("record") ApiMenuItem record, @Param("example") ApiMenuItemExample example);

    int updateByPrimaryKeySelective(ApiMenuItem record);

    int updateByPrimaryKey(ApiMenuItem record);
}