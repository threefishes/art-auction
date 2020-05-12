package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EmceeUserRelation;
import cn.threefishes.cloudrepository.entity.EmceeUserRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmceeUserRelationMapper {
    long countByExample(EmceeUserRelationExample example);

    int deleteByExample(EmceeUserRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmceeUserRelation record);

    int insertSelective(EmceeUserRelation record);

    List<EmceeUserRelation> selectByExampleWithRowbounds(EmceeUserRelationExample example, RowBounds rowBounds);

    List<EmceeUserRelation> selectByExample(EmceeUserRelationExample example);

    EmceeUserRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmceeUserRelation record, @Param("example") EmceeUserRelationExample example);

    int updateByExample(@Param("record") EmceeUserRelation record, @Param("example") EmceeUserRelationExample example);

    int updateByPrimaryKeySelective(EmceeUserRelation record);

    int updateByPrimaryKey(EmceeUserRelation record);
}