package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinAutoReplyRule;
import cn.threefishes.cloudrepository.entity.WeixinAutoReplyRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinAutoReplyRuleMapper {
    long countByExample(WeixinAutoReplyRuleExample example);

    int deleteByExample(WeixinAutoReplyRuleExample example);

    int deleteByPrimaryKey(Integer ruleId);

    int insert(WeixinAutoReplyRule record);

    int insertSelective(WeixinAutoReplyRule record);

    List<WeixinAutoReplyRule> selectByExampleWithRowbounds(WeixinAutoReplyRuleExample example, RowBounds rowBounds);

    List<WeixinAutoReplyRule> selectByExample(WeixinAutoReplyRuleExample example);

    WeixinAutoReplyRule selectByPrimaryKey(Integer ruleId);

    int updateByExampleSelective(@Param("record") WeixinAutoReplyRule record, @Param("example") WeixinAutoReplyRuleExample example);

    int updateByExample(@Param("record") WeixinAutoReplyRule record, @Param("example") WeixinAutoReplyRuleExample example);

    int updateByPrimaryKeySelective(WeixinAutoReplyRule record);

    int updateByPrimaryKey(WeixinAutoReplyRule record);
}