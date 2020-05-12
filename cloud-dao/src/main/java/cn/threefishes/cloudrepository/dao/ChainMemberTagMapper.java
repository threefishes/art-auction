package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainMemberTag;
import cn.threefishes.cloudrepository.entity.ChainMemberTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainMemberTagMapper {
    long countByExample(ChainMemberTagExample example);

    int deleteByExample(ChainMemberTagExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(ChainMemberTag record);

    int insertSelective(ChainMemberTag record);

    List<ChainMemberTag> selectByExampleWithRowbounds(ChainMemberTagExample example, RowBounds rowBounds);

    List<ChainMemberTag> selectByExample(ChainMemberTagExample example);

    ChainMemberTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") ChainMemberTag record, @Param("example") ChainMemberTagExample example);

    int updateByExample(@Param("record") ChainMemberTag record, @Param("example") ChainMemberTagExample example);

    int updateByPrimaryKeySelective(ChainMemberTag record);

    int updateByPrimaryKey(ChainMemberTag record);
}