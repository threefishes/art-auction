package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.FormatTemplate;
import cn.threefishes.cloudrepository.entity.FormatTemplateExample;
import cn.threefishes.cloudrepository.entity.FormatTemplateWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FormatTemplateMapper {
    long countByExample(FormatTemplateExample example);

    int deleteByExample(FormatTemplateExample example);

    int deleteByPrimaryKey(Integer formatId);

    int insert(FormatTemplateWithBLOBs record);

    int insertSelective(FormatTemplateWithBLOBs record);

    List<FormatTemplateWithBLOBs> selectByExampleWithBLOBsWithRowbounds(FormatTemplateExample example, RowBounds rowBounds);

    List<FormatTemplateWithBLOBs> selectByExampleWithBLOBs(FormatTemplateExample example);

    List<FormatTemplate> selectByExampleWithRowbounds(FormatTemplateExample example, RowBounds rowBounds);

    List<FormatTemplate> selectByExample(FormatTemplateExample example);

    FormatTemplateWithBLOBs selectByPrimaryKey(Integer formatId);

    int updateByExampleSelective(@Param("record") FormatTemplateWithBLOBs record, @Param("example") FormatTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") FormatTemplateWithBLOBs record, @Param("example") FormatTemplateExample example);

    int updateByExample(@Param("record") FormatTemplate record, @Param("example") FormatTemplateExample example);

    int updateByPrimaryKeySelective(FormatTemplateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FormatTemplateWithBLOBs record);

    int updateByPrimaryKey(FormatTemplate record);
}