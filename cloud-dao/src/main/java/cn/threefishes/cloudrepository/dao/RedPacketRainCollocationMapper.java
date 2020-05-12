package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RedPacketRainCollocation;
import cn.threefishes.cloudrepository.entity.RedPacketRainCollocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RedPacketRainCollocationMapper {
    long countByExample(RedPacketRainCollocationExample example);

    int deleteByExample(RedPacketRainCollocationExample example);

    int deleteByPrimaryKey(Integer collocationId);

    int insert(RedPacketRainCollocation record);

    int insertSelective(RedPacketRainCollocation record);

    List<RedPacketRainCollocation> selectByExampleWithRowbounds(RedPacketRainCollocationExample example, RowBounds rowBounds);

    List<RedPacketRainCollocation> selectByExample(RedPacketRainCollocationExample example);

    RedPacketRainCollocation selectByPrimaryKey(Integer collocationId);

    int updateByExampleSelective(@Param("record") RedPacketRainCollocation record, @Param("example") RedPacketRainCollocationExample example);

    int updateByExample(@Param("record") RedPacketRainCollocation record, @Param("example") RedPacketRainCollocationExample example);

    int updateByPrimaryKeySelective(RedPacketRainCollocation record);

    int updateByPrimaryKey(RedPacketRainCollocation record);
}