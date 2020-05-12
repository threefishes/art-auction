package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PointsLog;
import cn.threefishes.cloudrepository.entity.PointsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PointsLogMapper {
    long countByExample(PointsLogExample example);

    int deleteByExample(PointsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(PointsLog record);

    int insertSelective(PointsLog record);

    List<PointsLog> selectByExampleWithRowbounds(PointsLogExample example, RowBounds rowBounds);

    List<PointsLog> selectByExample(PointsLogExample example);

    PointsLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") PointsLog record, @Param("example") PointsLogExample example);

    int updateByExample(@Param("record") PointsLog record, @Param("example") PointsLogExample example);

    int updateByPrimaryKeySelective(PointsLog record);

    int updateByPrimaryKey(PointsLog record);
}