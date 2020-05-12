package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Custom;
import cn.threefishes.cloudrepository.entity.CustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomMapper {
    long countByExample(CustomExample example);

    int deleteByExample(CustomExample example);

    int deleteByPrimaryKey(Integer customId);

    int insert(Custom record);

    int insertSelective(Custom record);

    List<Custom> selectByExampleWithRowbounds(CustomExample example, RowBounds rowBounds);

    List<Custom> selectByExample(CustomExample example);

    Custom selectByPrimaryKey(Integer customId);

    int updateByExampleSelective(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByExample(@Param("record") Custom record, @Param("example") CustomExample example);

    int updateByPrimaryKeySelective(Custom record);

    int updateByPrimaryKey(Custom record);
}