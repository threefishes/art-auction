package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MessageTemplateCommon;
import cn.threefishes.cloudrepository.entity.MessageTemplateCommonExample;
import cn.threefishes.cloudrepository.entity.MessageTemplateCommonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MessageTemplateCommonMapper {
    long countByExample(MessageTemplateCommonExample example);

    int deleteByExample(MessageTemplateCommonExample example);

    int deleteByPrimaryKey(Integer templateCommonId);

    int insert(MessageTemplateCommonWithBLOBs record);

    int insertSelective(MessageTemplateCommonWithBLOBs record);

    List<MessageTemplateCommonWithBLOBs> selectByExampleWithBLOBsWithRowbounds(MessageTemplateCommonExample example, RowBounds rowBounds);

    List<MessageTemplateCommonWithBLOBs> selectByExampleWithBLOBs(MessageTemplateCommonExample example);

    List<MessageTemplateCommon> selectByExampleWithRowbounds(MessageTemplateCommonExample example, RowBounds rowBounds);

    List<MessageTemplateCommon> selectByExample(MessageTemplateCommonExample example);

    MessageTemplateCommonWithBLOBs selectByPrimaryKey(Integer templateCommonId);

    int updateByExampleSelective(@Param("record") MessageTemplateCommonWithBLOBs record, @Param("example") MessageTemplateCommonExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageTemplateCommonWithBLOBs record, @Param("example") MessageTemplateCommonExample example);

    int updateByExample(@Param("record") MessageTemplateCommon record, @Param("example") MessageTemplateCommonExample example);

    int updateByPrimaryKeySelective(MessageTemplateCommonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MessageTemplateCommonWithBLOBs record);

    int updateByPrimaryKey(MessageTemplateCommon record);
}