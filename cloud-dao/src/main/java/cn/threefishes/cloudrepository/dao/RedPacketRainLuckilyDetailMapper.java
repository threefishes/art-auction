package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RedPacketRainLuckilyDetail;
import cn.threefishes.cloudrepository.entity.RedPacketRainLuckilyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RedPacketRainLuckilyDetailMapper {
    long countByExample(RedPacketRainLuckilyDetailExample example);

    int deleteByExample(RedPacketRainLuckilyDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedPacketRainLuckilyDetail record);

    int insertSelective(RedPacketRainLuckilyDetail record);

    List<RedPacketRainLuckilyDetail> selectByExampleWithRowbounds(RedPacketRainLuckilyDetailExample example, RowBounds rowBounds);

    List<RedPacketRainLuckilyDetail> selectByExample(RedPacketRainLuckilyDetailExample example);

    RedPacketRainLuckilyDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedPacketRainLuckilyDetail record, @Param("example") RedPacketRainLuckilyDetailExample example);

    int updateByExample(@Param("record") RedPacketRainLuckilyDetail record, @Param("example") RedPacketRainLuckilyDetailExample example);

    int updateByPrimaryKeySelective(RedPacketRainLuckilyDetail record);

    int updateByPrimaryKey(RedPacketRainLuckilyDetail record);
}