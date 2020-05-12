package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ExpPointsLog;
import cn.threefishes.cloudrepository.entity.ExpPointsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ExpPointsLogMapper {
    long countByExample(ExpPointsLogExample example);

    int deleteByExample(ExpPointsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(ExpPointsLog record);

    int insertSelective(ExpPointsLog record);

    List<ExpPointsLog> selectByExampleWithRowbounds(ExpPointsLogExample example, RowBounds rowBounds);

    List<ExpPointsLog> selectByExample(ExpPointsLogExample example);

    ExpPointsLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") ExpPointsLog record, @Param("example") ExpPointsLogExample example);

    int updateByExample(@Param("record") ExpPointsLog record, @Param("example") ExpPointsLogExample example);

    int updateByPrimaryKeySelective(ExpPointsLog record);

    int updateByPrimaryKey(ExpPointsLog record);
}