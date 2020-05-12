package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AppArticleCategory;
import cn.threefishes.cloudrepository.entity.AppArticleCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppArticleCategoryMapper {
    long countByExample(AppArticleCategoryExample example);

    int deleteByExample(AppArticleCategoryExample example);

    int deleteByPrimaryKey(Integer appCategoryId);

    int insert(AppArticleCategory record);

    int insertSelective(AppArticleCategory record);

    List<AppArticleCategory> selectByExampleWithRowbounds(AppArticleCategoryExample example, RowBounds rowBounds);

    List<AppArticleCategory> selectByExample(AppArticleCategoryExample example);

    AppArticleCategory selectByPrimaryKey(Integer appCategoryId);

    int updateByExampleSelective(@Param("record") AppArticleCategory record, @Param("example") AppArticleCategoryExample example);

    int updateByExample(@Param("record") AppArticleCategory record, @Param("example") AppArticleCategoryExample example);

    int updateByPrimaryKeySelective(AppArticleCategory record);

    int updateByPrimaryKey(AppArticleCategory record);
}