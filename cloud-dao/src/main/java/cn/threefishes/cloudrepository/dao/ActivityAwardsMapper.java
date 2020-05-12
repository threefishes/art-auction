package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ActivityAwards;
import cn.threefishes.cloudrepository.entity.ActivityAwardsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityAwardsMapper {
    long countByExample(ActivityAwardsExample example);

    int deleteByExample(ActivityAwardsExample example);

    int deleteByPrimaryKey(Integer awardsId);

    int insert(ActivityAwards record);

    int insertSelective(ActivityAwards record);

    List<ActivityAwards> selectByExampleWithRowbounds(ActivityAwardsExample example, RowBounds rowBounds);

    List<ActivityAwards> selectByExample(ActivityAwardsExample example);

    ActivityAwards selectByPrimaryKey(Integer awardsId);

    int updateByExampleSelective(@Param("record") ActivityAwards record, @Param("example") ActivityAwardsExample example);

    int updateByExample(@Param("record") ActivityAwards record, @Param("example") ActivityAwardsExample example);

    int updateByPrimaryKeySelective(ActivityAwards record);

    int updateByPrimaryKey(ActivityAwards record);
}