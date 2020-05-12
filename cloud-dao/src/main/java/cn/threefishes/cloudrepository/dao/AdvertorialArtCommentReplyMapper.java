package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialArtCommentReply;
import cn.threefishes.cloudrepository.entity.AdvertorialArtCommentReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialArtCommentReplyMapper {
    long countByExample(AdvertorialArtCommentReplyExample example);

    int deleteByExample(AdvertorialArtCommentReplyExample example);

    int deleteByPrimaryKey(Integer replyId);

    int insert(AdvertorialArtCommentReply record);

    int insertSelective(AdvertorialArtCommentReply record);

    List<AdvertorialArtCommentReply> selectByExampleWithRowbounds(AdvertorialArtCommentReplyExample example, RowBounds rowBounds);

    List<AdvertorialArtCommentReply> selectByExample(AdvertorialArtCommentReplyExample example);

    AdvertorialArtCommentReply selectByPrimaryKey(Integer replyId);

    int updateByExampleSelective(@Param("record") AdvertorialArtCommentReply record, @Param("example") AdvertorialArtCommentReplyExample example);

    int updateByExample(@Param("record") AdvertorialArtCommentReply record, @Param("example") AdvertorialArtCommentReplyExample example);

    int updateByPrimaryKeySelective(AdvertorialArtCommentReply record);

    int updateByPrimaryKey(AdvertorialArtCommentReply record);
}