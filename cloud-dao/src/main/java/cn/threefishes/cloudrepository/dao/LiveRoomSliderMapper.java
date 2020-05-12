package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.LiveRoomSlider;
import cn.threefishes.cloudrepository.entity.LiveRoomSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LiveRoomSliderMapper {
    long countByExample(LiveRoomSliderExample example);

    int deleteByExample(LiveRoomSliderExample example);

    int deleteByPrimaryKey(Integer liveRoomSliderId);

    int insert(LiveRoomSlider record);

    int insertSelective(LiveRoomSlider record);

    List<LiveRoomSlider> selectByExampleWithBLOBsWithRowbounds(LiveRoomSliderExample example, RowBounds rowBounds);

    List<LiveRoomSlider> selectByExampleWithBLOBs(LiveRoomSliderExample example);

    List<LiveRoomSlider> selectByExampleWithRowbounds(LiveRoomSliderExample example, RowBounds rowBounds);

    List<LiveRoomSlider> selectByExample(LiveRoomSliderExample example);

    LiveRoomSlider selectByPrimaryKey(Integer liveRoomSliderId);

    int updateByExampleSelective(@Param("record") LiveRoomSlider record, @Param("example") LiveRoomSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") LiveRoomSlider record, @Param("example") LiveRoomSliderExample example);

    int updateByExample(@Param("record") LiveRoomSlider record, @Param("example") LiveRoomSliderExample example);

    int updateByPrimaryKeySelective(LiveRoomSlider record);

    int updateByPrimaryKeyWithBLOBs(LiveRoomSlider record);
}