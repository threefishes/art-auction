package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.LiveRoom;
import cn.threefishes.cloudrepository.entity.LiveRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LiveRoomMapper {
    long countByExample(LiveRoomExample example);

    int deleteByExample(LiveRoomExample example);

    int deleteByPrimaryKey(Integer roomId);

    int insert(LiveRoom record);

    int insertSelective(LiveRoom record);

    List<LiveRoom> selectByExampleWithRowbounds(LiveRoomExample example, RowBounds rowBounds);

    List<LiveRoom> selectByExample(LiveRoomExample example);

    LiveRoom selectByPrimaryKey(Integer roomId);

    int updateByExampleSelective(@Param("record") LiveRoom record, @Param("example") LiveRoomExample example);

    int updateByExample(@Param("record") LiveRoom record, @Param("example") LiveRoomExample example);

    int updateByPrimaryKeySelective(LiveRoom record);

    int updateByPrimaryKey(LiveRoom record);
}