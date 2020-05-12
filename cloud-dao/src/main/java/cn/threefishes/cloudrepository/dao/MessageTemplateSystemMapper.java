package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MessageTemplateSystem;
import cn.threefishes.cloudrepository.entity.MessageTemplateSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MessageTemplateSystemMapper {
    long countByExample(MessageTemplateSystemExample example);

    int deleteByExample(MessageTemplateSystemExample example);

    int deleteByPrimaryKey(Integer templateSystemId);

    int insert(MessageTemplateSystem record);

    int insertSelective(MessageTemplateSystem record);

    List<MessageTemplateSystem> selectByExampleWithRowbounds(MessageTemplateSystemExample example, RowBounds rowBounds);

    List<MessageTemplateSystem> selectByExample(MessageTemplateSystemExample example);

    MessageTemplateSystem selectByPrimaryKey(Integer templateSystemId);

    int updateByExampleSelective(@Param("record") MessageTemplateSystem record, @Param("example") MessageTemplateSystemExample example);

    int updateByExample(@Param("record") MessageTemplateSystem record, @Param("example") MessageTemplateSystemExample example);

    int updateByPrimaryKeySelective(MessageTemplateSystem record);

    int updateByPrimaryKey(MessageTemplateSystem record);
}