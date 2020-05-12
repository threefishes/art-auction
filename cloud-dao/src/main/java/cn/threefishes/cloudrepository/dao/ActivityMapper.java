package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Activity;
import cn.threefishes.cloudrepository.entity.ActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityMapper {
    long countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(Activity record);

    int insertSelective(Activity record);

    List<Activity> selectByExampleWithBLOBsWithRowbounds(ActivityExample example, RowBounds rowBounds);

    List<Activity> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExampleWithRowbounds(ActivityExample example, RowBounds rowBounds);

    List<Activity> selectByExample(ActivityExample example);

    Activity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKeyWithBLOBs(Activity record);

    int updateByPrimaryKey(Activity record);
}