package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.LiveRoomGoods;
import cn.threefishes.cloudrepository.entity.LiveRoomGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface LiveRoomGoodsMapper {
    long countByExample(LiveRoomGoodsExample example);

    int deleteByExample(LiveRoomGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LiveRoomGoods record);

    int insertSelective(LiveRoomGoods record);

    List<LiveRoomGoods> selectByExampleWithRowbounds(LiveRoomGoodsExample example, RowBounds rowBounds);

    List<LiveRoomGoods> selectByExample(LiveRoomGoodsExample example);

    LiveRoomGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LiveRoomGoods record, @Param("example") LiveRoomGoodsExample example);

    int updateByExample(@Param("record") LiveRoomGoods record, @Param("example") LiveRoomGoodsExample example);

    int updateByPrimaryKeySelective(LiveRoomGoods record);

    int updateByPrimaryKey(LiveRoomGoods record);
}