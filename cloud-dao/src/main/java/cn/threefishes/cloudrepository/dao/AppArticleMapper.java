package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AppArticle;
import cn.threefishes.cloudrepository.entity.AppArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppArticleMapper {
    long countByExample(AppArticleExample example);

    int deleteByExample(AppArticleExample example);

    int deleteByPrimaryKey(Integer appArticleId);

    int insert(AppArticle record);

    int insertSelective(AppArticle record);

    List<AppArticle> selectByExampleWithBLOBsWithRowbounds(AppArticleExample example, RowBounds rowBounds);

    List<AppArticle> selectByExampleWithBLOBs(AppArticleExample example);

    List<AppArticle> selectByExampleWithRowbounds(AppArticleExample example, RowBounds rowBounds);

    List<AppArticle> selectByExample(AppArticleExample example);

    AppArticle selectByPrimaryKey(Integer appArticleId);

    int updateByExampleSelective(@Param("record") AppArticle record, @Param("example") AppArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") AppArticle record, @Param("example") AppArticleExample example);

    int updateByExample(@Param("record") AppArticle record, @Param("example") AppArticleExample example);

    int updateByPrimaryKeySelective(AppArticle record);

    int updateByPrimaryKeyWithBLOBs(AppArticle record);

    int updateByPrimaryKey(AppArticle record);
}