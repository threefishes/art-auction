package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CategoryBrandExample;
import cn.threefishes.cloudrepository.entity.CategoryBrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CategoryBrandMapper {
    long countByExample(CategoryBrandExample example);

    int deleteByExample(CategoryBrandExample example);

    int deleteByPrimaryKey(CategoryBrandKey key);

    int insert(CategoryBrandKey record);

    int insertSelective(CategoryBrandKey record);

    List<CategoryBrandKey> selectByExampleWithRowbounds(CategoryBrandExample example, RowBounds rowBounds);

    List<CategoryBrandKey> selectByExample(CategoryBrandExample example);

    int updateByExampleSelective(@Param("record") CategoryBrandKey record, @Param("example") CategoryBrandExample example);

    int updateByExample(@Param("record") CategoryBrandKey record, @Param("example") CategoryBrandExample example);
}