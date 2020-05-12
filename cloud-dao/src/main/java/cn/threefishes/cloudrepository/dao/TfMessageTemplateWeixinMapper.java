package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfMessageTemplateWeixin;
import cn.threefishes.cloudrepository.entity.TfMessageTemplateWeixinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfMessageTemplateWeixinMapper {
    long countByExample(TfMessageTemplateWeixinExample example);

    int deleteByExample(TfMessageTemplateWeixinExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(TfMessageTemplateWeixin record);

    int insertSelective(TfMessageTemplateWeixin record);

    List<TfMessageTemplateWeixin> selectByExampleWithRowbounds(TfMessageTemplateWeixinExample example, RowBounds rowBounds);

    List<TfMessageTemplateWeixin> selectByExample(TfMessageTemplateWeixinExample example);

    TfMessageTemplateWeixin selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") TfMessageTemplateWeixin record, @Param("example") TfMessageTemplateWeixinExample example);

    int updateByExample(@Param("record") TfMessageTemplateWeixin record, @Param("example") TfMessageTemplateWeixinExample example);

    int updateByPrimaryKeySelective(TfMessageTemplateWeixin record);

    int updateByPrimaryKey(TfMessageTemplateWeixin record);
}