package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RedPacketRainLuckilyMember;
import cn.threefishes.cloudrepository.entity.RedPacketRainLuckilyMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RedPacketRainLuckilyMemberMapper {
    long countByExample(RedPacketRainLuckilyMemberExample example);

    int deleteByExample(RedPacketRainLuckilyMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RedPacketRainLuckilyMember record);

    int insertSelective(RedPacketRainLuckilyMember record);

    List<RedPacketRainLuckilyMember> selectByExampleWithRowbounds(RedPacketRainLuckilyMemberExample example, RowBounds rowBounds);

    List<RedPacketRainLuckilyMember> selectByExample(RedPacketRainLuckilyMemberExample example);

    RedPacketRainLuckilyMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RedPacketRainLuckilyMember record, @Param("example") RedPacketRainLuckilyMemberExample example);

    int updateByExample(@Param("record") RedPacketRainLuckilyMember record, @Param("example") RedPacketRainLuckilyMemberExample example);

    int updateByPrimaryKeySelective(RedPacketRainLuckilyMember record);

    int updateByPrimaryKey(RedPacketRainLuckilyMember record);
}