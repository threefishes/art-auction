package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersAuthorReply;
import cn.threefishes.cloudrepository.entity.ShowOrdersAuthorReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersAuthorReplyMapper {
    long countByExample(ShowOrdersAuthorReplyExample example);

    int deleteByExample(ShowOrdersAuthorReplyExample example);

    int deleteByPrimaryKey(Integer authorReplyId);

    int insert(ShowOrdersAuthorReply record);

    int insertSelective(ShowOrdersAuthorReply record);

    List<ShowOrdersAuthorReply> selectByExampleWithRowbounds(ShowOrdersAuthorReplyExample example, RowBounds rowBounds);

    List<ShowOrdersAuthorReply> selectByExample(ShowOrdersAuthorReplyExample example);

    ShowOrdersAuthorReply selectByPrimaryKey(Integer authorReplyId);

    int updateByExampleSelective(@Param("record") ShowOrdersAuthorReply record, @Param("example") ShowOrdersAuthorReplyExample example);

    int updateByExample(@Param("record") ShowOrdersAuthorReply record, @Param("example") ShowOrdersAuthorReplyExample example);

    int updateByPrimaryKeySelective(ShowOrdersAuthorReply record);

    int updateByPrimaryKey(ShowOrdersAuthorReply record);
}