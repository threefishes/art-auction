package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinAutoReplyContent;
import cn.threefishes.cloudrepository.entity.WeixinAutoReplyContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinAutoReplyContentMapper {
    long countByExample(WeixinAutoReplyContentExample example);

    int deleteByExample(WeixinAutoReplyContentExample example);

    int deleteByPrimaryKey(Integer contentId);

    int insert(WeixinAutoReplyContent record);

    int insertSelective(WeixinAutoReplyContent record);

    List<WeixinAutoReplyContent> selectByExampleWithBLOBsWithRowbounds(WeixinAutoReplyContentExample example, RowBounds rowBounds);

    List<WeixinAutoReplyContent> selectByExampleWithBLOBs(WeixinAutoReplyContentExample example);

    List<WeixinAutoReplyContent> selectByExampleWithRowbounds(WeixinAutoReplyContentExample example, RowBounds rowBounds);

    List<WeixinAutoReplyContent> selectByExample(WeixinAutoReplyContentExample example);

    WeixinAutoReplyContent selectByPrimaryKey(Integer contentId);

    int updateByExampleSelective(@Param("record") WeixinAutoReplyContent record, @Param("example") WeixinAutoReplyContentExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinAutoReplyContent record, @Param("example") WeixinAutoReplyContentExample example);

    int updateByExample(@Param("record") WeixinAutoReplyContent record, @Param("example") WeixinAutoReplyContentExample example);

    int updateByPrimaryKeySelective(WeixinAutoReplyContent record);

    int updateByPrimaryKeyWithBLOBs(WeixinAutoReplyContent record);

    int updateByPrimaryKey(WeixinAutoReplyContent record);
}