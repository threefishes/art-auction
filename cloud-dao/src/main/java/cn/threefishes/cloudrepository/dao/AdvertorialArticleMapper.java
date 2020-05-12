package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialArticle;
import cn.threefishes.cloudrepository.entity.AdvertorialArticleExample;
import cn.threefishes.cloudrepository.entity.AdvertorialArticleWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialArticleMapper {
    long countByExample(AdvertorialArticleExample example);

    int deleteByExample(AdvertorialArticleExample example);

    int deleteByPrimaryKey(Integer articleId);

    int insert(AdvertorialArticleWithBLOBs record);

    int insertSelective(AdvertorialArticleWithBLOBs record);

    List<AdvertorialArticleWithBLOBs> selectByExampleWithBLOBsWithRowbounds(AdvertorialArticleExample example, RowBounds rowBounds);

    List<AdvertorialArticleWithBLOBs> selectByExampleWithBLOBs(AdvertorialArticleExample example);

    List<AdvertorialArticle> selectByExampleWithRowbounds(AdvertorialArticleExample example, RowBounds rowBounds);

    List<AdvertorialArticle> selectByExample(AdvertorialArticleExample example);

    AdvertorialArticleWithBLOBs selectByPrimaryKey(Integer articleId);

    int updateByExampleSelective(@Param("record") AdvertorialArticleWithBLOBs record, @Param("example") AdvertorialArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") AdvertorialArticleWithBLOBs record, @Param("example") AdvertorialArticleExample example);

    int updateByExample(@Param("record") AdvertorialArticle record, @Param("example") AdvertorialArticleExample example);

    int updateByPrimaryKeySelective(AdvertorialArticleWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(AdvertorialArticleWithBLOBs record);

    int updateByPrimaryKey(AdvertorialArticle record);
}