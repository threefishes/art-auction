package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatMember;
import cn.threefishes.cloudrepository.entity.StatMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatMemberMapper {
    long countByExample(StatMemberExample example);

    int deleteByExample(StatMemberExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(StatMember record);

    int insertSelective(StatMember record);

    List<StatMember> selectByExampleWithRowbounds(StatMemberExample example, RowBounds rowBounds);

    List<StatMember> selectByExample(StatMemberExample example);

    StatMember selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") StatMember record, @Param("example") StatMemberExample example);

    int updateByExample(@Param("record") StatMember record, @Param("example") StatMemberExample example);

    int updateByPrimaryKeySelective(StatMember record);

    int updateByPrimaryKey(StatMember record);
}