package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialArticleCommentLike;
import cn.threefishes.cloudrepository.entity.AdvertorialArticleCommentLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialArticleCommentLikeMapper {
    long countByExample(AdvertorialArticleCommentLikeExample example);

    int deleteByExample(AdvertorialArticleCommentLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdvertorialArticleCommentLike record);

    int insertSelective(AdvertorialArticleCommentLike record);

    List<AdvertorialArticleCommentLike> selectByExampleWithRowbounds(AdvertorialArticleCommentLikeExample example, RowBounds rowBounds);

    List<AdvertorialArticleCommentLike> selectByExample(AdvertorialArticleCommentLikeExample example);

    AdvertorialArticleCommentLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdvertorialArticleCommentLike record, @Param("example") AdvertorialArticleCommentLikeExample example);

    int updateByExample(@Param("record") AdvertorialArticleCommentLike record, @Param("example") AdvertorialArticleCommentLikeExample example);

    int updateByPrimaryKeySelective(AdvertorialArticleCommentLike record);

    int updateByPrimaryKey(AdvertorialArticleCommentLike record);
}