package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialArticleCommentReply_like;
import cn.threefishes.cloudrepository.entity.AdvertorialArticleCommentReply_likeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialArticleCommentReply_likeMapper {
    long countByExample(AdvertorialArticleCommentReply_likeExample example);

    int deleteByExample(AdvertorialArticleCommentReply_likeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AdvertorialArticleCommentReply_like record);

    int insertSelective(AdvertorialArticleCommentReply_like record);

    List<AdvertorialArticleCommentReply_like> selectByExampleWithRowbounds(AdvertorialArticleCommentReply_likeExample example, RowBounds rowBounds);

    List<AdvertorialArticleCommentReply_like> selectByExample(AdvertorialArticleCommentReply_likeExample example);

    AdvertorialArticleCommentReply_like selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AdvertorialArticleCommentReply_like record, @Param("example") AdvertorialArticleCommentReply_likeExample example);

    int updateByExample(@Param("record") AdvertorialArticleCommentReply_like record, @Param("example") AdvertorialArticleCommentReply_likeExample example);

    int updateByPrimaryKeySelective(AdvertorialArticleCommentReply_like record);

    int updateByPrimaryKey(AdvertorialArticleCommentReply_like record);
}