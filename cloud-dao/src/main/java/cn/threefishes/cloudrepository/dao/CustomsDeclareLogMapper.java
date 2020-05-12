package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CustomsDeclareLog;
import cn.threefishes.cloudrepository.entity.CustomsDeclareLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomsDeclareLogMapper {
    long countByExample(CustomsDeclareLogExample example);

    int deleteByExample(CustomsDeclareLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomsDeclareLog record);

    int insertSelective(CustomsDeclareLog record);

    List<CustomsDeclareLog> selectByExampleWithBLOBsWithRowbounds(CustomsDeclareLogExample example, RowBounds rowBounds);

    List<CustomsDeclareLog> selectByExampleWithBLOBs(CustomsDeclareLogExample example);

    List<CustomsDeclareLog> selectByExampleWithRowbounds(CustomsDeclareLogExample example, RowBounds rowBounds);

    List<CustomsDeclareLog> selectByExample(CustomsDeclareLogExample example);

    CustomsDeclareLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomsDeclareLog record, @Param("example") CustomsDeclareLogExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomsDeclareLog record, @Param("example") CustomsDeclareLogExample example);

    int updateByExample(@Param("record") CustomsDeclareLog record, @Param("example") CustomsDeclareLogExample example);

    int updateByPrimaryKeySelective(CustomsDeclareLog record);

    int updateByPrimaryKeyWithBLOBs(CustomsDeclareLog record);

    int updateByPrimaryKey(CustomsDeclareLog record);
}