package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainMember;
import cn.threefishes.cloudrepository.entity.ChainMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainMemberMapper {
    long countByExample(ChainMemberExample example);

    int deleteByExample(ChainMemberExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChainMember record);

    int insertSelective(ChainMember record);

    List<ChainMember> selectByExampleWithRowbounds(ChainMemberExample example, RowBounds rowBounds);

    List<ChainMember> selectByExample(ChainMemberExample example);

    ChainMember selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChainMember record, @Param("example") ChainMemberExample example);

    int updateByExample(@Param("record") ChainMember record, @Param("example") ChainMemberExample example);

    int updateByPrimaryKeySelective(ChainMember record);

    int updateByPrimaryKey(ChainMember record);
}