package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinAutoReplyKeyword;
import cn.threefishes.cloudrepository.entity.WeixinAutoReplyKeywordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinAutoReplyKeywordMapper {
    long countByExample(WeixinAutoReplyKeywordExample example);

    int deleteByExample(WeixinAutoReplyKeywordExample example);

    int deleteByPrimaryKey(Integer keywordId);

    int insert(WeixinAutoReplyKeyword record);

    int insertSelective(WeixinAutoReplyKeyword record);

    List<WeixinAutoReplyKeyword> selectByExampleWithRowbounds(WeixinAutoReplyKeywordExample example, RowBounds rowBounds);

    List<WeixinAutoReplyKeyword> selectByExample(WeixinAutoReplyKeywordExample example);

    WeixinAutoReplyKeyword selectByPrimaryKey(Integer keywordId);

    int updateByExampleSelective(@Param("record") WeixinAutoReplyKeyword record, @Param("example") WeixinAutoReplyKeywordExample example);

    int updateByExample(@Param("record") WeixinAutoReplyKeyword record, @Param("example") WeixinAutoReplyKeywordExample example);

    int updateByPrimaryKeySelective(WeixinAutoReplyKeyword record);

    int updateByPrimaryKey(WeixinAutoReplyKeyword record);
}