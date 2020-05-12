package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatCategoryGeneral;
import cn.threefishes.cloudrepository.entity.StatCategoryGeneralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatCategoryGeneralMapper {
    long countByExample(StatCategoryGeneralExample example);

    int deleteByExample(StatCategoryGeneralExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(StatCategoryGeneral record);

    int insertSelective(StatCategoryGeneral record);

    List<StatCategoryGeneral> selectByExampleWithRowbounds(StatCategoryGeneralExample example, RowBounds rowBounds);

    List<StatCategoryGeneral> selectByExample(StatCategoryGeneralExample example);

    StatCategoryGeneral selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") StatCategoryGeneral record, @Param("example") StatCategoryGeneralExample example);

    int updateByExample(@Param("record") StatCategoryGeneral record, @Param("example") StatCategoryGeneralExample example);

    int updateByPrimaryKeySelective(StatCategoryGeneral record);

    int updateByPrimaryKey(StatCategoryGeneral record);
}