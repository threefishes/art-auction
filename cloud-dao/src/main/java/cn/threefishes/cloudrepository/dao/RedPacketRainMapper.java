package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RedPacketRain;
import cn.threefishes.cloudrepository.entity.RedPacketRainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RedPacketRainMapper {
    long countByExample(RedPacketRainExample example);

    int deleteByExample(RedPacketRainExample example);

    int deleteByPrimaryKey(Integer rainId);

    int insert(RedPacketRain record);

    int insertSelective(RedPacketRain record);

    List<RedPacketRain> selectByExampleWithRowbounds(RedPacketRainExample example, RowBounds rowBounds);

    List<RedPacketRain> selectByExample(RedPacketRainExample example);

    RedPacketRain selectByPrimaryKey(Integer rainId);

    int updateByExampleSelective(@Param("record") RedPacketRain record, @Param("example") RedPacketRainExample example);

    int updateByExample(@Param("record") RedPacketRain record, @Param("example") RedPacketRainExample example);

    int updateByPrimaryKeySelective(RedPacketRain record);

    int updateByPrimaryKey(RedPacketRain record);
}