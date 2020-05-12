package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiMenu;
import cn.threefishes.cloudrepository.entity.ApiMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiMenuMapper {
    long countByExample(ApiMenuExample example);

    int deleteByExample(ApiMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(ApiMenu record);

    int insertSelective(ApiMenu record);

    List<ApiMenu> selectByExampleWithRowbounds(ApiMenuExample example, RowBounds rowBounds);

    List<ApiMenu> selectByExample(ApiMenuExample example);

    ApiMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") ApiMenu record, @Param("example") ApiMenuExample example);

    int updateByExample(@Param("record") ApiMenu record, @Param("example") ApiMenuExample example);

    int updateByPrimaryKeySelective(ApiMenu record);

    int updateByPrimaryKey(ApiMenu record);
}