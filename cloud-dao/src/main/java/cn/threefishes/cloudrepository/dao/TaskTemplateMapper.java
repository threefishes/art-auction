package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaskTemplate;
import cn.threefishes.cloudrepository.entity.TaskTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaskTemplateMapper {
    long countByExample(TaskTemplateExample example);

    int deleteByExample(TaskTemplateExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(TaskTemplate record);

    int insertSelective(TaskTemplate record);

    List<TaskTemplate> selectByExampleWithRowbounds(TaskTemplateExample example, RowBounds rowBounds);

    List<TaskTemplate> selectByExample(TaskTemplateExample example);

    TaskTemplate selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") TaskTemplate record, @Param("example") TaskTemplateExample example);

    int updateByExample(@Param("record") TaskTemplate record, @Param("example") TaskTemplateExample example);

    int updateByPrimaryKeySelective(TaskTemplate record);

    int updateByPrimaryKey(TaskTemplate record);
}