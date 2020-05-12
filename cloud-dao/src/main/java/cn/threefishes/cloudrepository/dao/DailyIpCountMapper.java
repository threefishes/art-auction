package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DailyIpCount;
import cn.threefishes.cloudrepository.entity.DailyIpCountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DailyIpCountMapper {
    long countByExample(DailyIpCountExample example);

    int deleteByExample(DailyIpCountExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DailyIpCount record);

    int insertSelective(DailyIpCount record);

    List<DailyIpCount> selectByExampleWithRowbounds(DailyIpCountExample example, RowBounds rowBounds);

    List<DailyIpCount> selectByExample(DailyIpCountExample example);

    DailyIpCount selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DailyIpCount record, @Param("example") DailyIpCountExample example);

    int updateByExample(@Param("record") DailyIpCount record, @Param("example") DailyIpCountExample example);

    int updateByPrimaryKeySelective(DailyIpCount record);

    int updateByPrimaryKey(DailyIpCount record);
}