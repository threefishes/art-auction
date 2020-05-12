package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersTemplate;
import cn.threefishes.cloudrepository.entity.ShowOrdersTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersTemplateMapper {
    long countByExample(ShowOrdersTemplateExample example);

    int deleteByExample(ShowOrdersTemplateExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(ShowOrdersTemplate record);

    int insertSelective(ShowOrdersTemplate record);

    List<ShowOrdersTemplate> selectByExampleWithRowbounds(ShowOrdersTemplateExample example, RowBounds rowBounds);

    List<ShowOrdersTemplate> selectByExample(ShowOrdersTemplateExample example);

    ShowOrdersTemplate selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") ShowOrdersTemplate record, @Param("example") ShowOrdersTemplateExample example);

    int updateByExample(@Param("record") ShowOrdersTemplate record, @Param("example") ShowOrdersTemplateExample example);

    int updateByPrimaryKeySelective(ShowOrdersTemplate record);

    int updateByPrimaryKey(ShowOrdersTemplate record);
}