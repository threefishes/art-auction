package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaxClassCategory;
import cn.threefishes.cloudrepository.entity.TaxClassCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaxClassCategoryMapper {
    long countByExample(TaxClassCategoryExample example);

    int deleteByExample(TaxClassCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TaxClassCategory record);

    int insertSelective(TaxClassCategory record);

    List<TaxClassCategory> selectByExampleWithRowbounds(TaxClassCategoryExample example, RowBounds rowBounds);

    List<TaxClassCategory> selectByExample(TaxClassCategoryExample example);

    TaxClassCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TaxClassCategory record, @Param("example") TaxClassCategoryExample example);

    int updateByExample(@Param("record") TaxClassCategory record, @Param("example") TaxClassCategoryExample example);

    int updateByPrimaryKeySelective(TaxClassCategory record);

    int updateByPrimaryKey(TaxClassCategory record);
}