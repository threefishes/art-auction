package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.advertorial_article_comment;
import cn.threefishes.cloudrepository.entity.advertorial_article_commentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface advertorial_article_commentMapper {
    long countByExample(advertorial_article_commentExample example);

    int deleteByExample(advertorial_article_commentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(advertorial_article_comment record);

    int insertSelective(advertorial_article_comment record);

    List<advertorial_article_comment> selectByExampleWithRowbounds(advertorial_article_commentExample example, RowBounds rowBounds);

    List<advertorial_article_comment> selectByExample(advertorial_article_commentExample example);

    advertorial_article_comment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") advertorial_article_comment record, @Param("example") advertorial_article_commentExample example);

    int updateByExample(@Param("record") advertorial_article_comment record, @Param("example") advertorial_article_commentExample example);

    int updateByPrimaryKeySelective(advertorial_article_comment record);

    int updateByPrimaryKey(advertorial_article_comment record);
}