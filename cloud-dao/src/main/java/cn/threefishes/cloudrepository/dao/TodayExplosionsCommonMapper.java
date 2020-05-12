package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TodayExplosionsCommon;
import cn.threefishes.cloudrepository.entity.TodayExplosionsCommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TodayExplosionsCommonMapper {
    long countByExample(TodayExplosionsCommonExample example);

    int deleteByExample(TodayExplosionsCommonExample example);

    int deleteByPrimaryKey(Integer explosionsCommonId);

    int insert(TodayExplosionsCommon record);

    int insertSelective(TodayExplosionsCommon record);

    List<TodayExplosionsCommon> selectByExampleWithRowbounds(TodayExplosionsCommonExample example, RowBounds rowBounds);

    List<TodayExplosionsCommon> selectByExample(TodayExplosionsCommonExample example);

    TodayExplosionsCommon selectByPrimaryKey(Integer explosionsCommonId);

    int updateByExampleSelective(@Param("record") TodayExplosionsCommon record, @Param("example") TodayExplosionsCommonExample example);

    int updateByExample(@Param("record") TodayExplosionsCommon record, @Param("example") TodayExplosionsCommonExample example);

    int updateByPrimaryKeySelective(TodayExplosionsCommon record);

    int updateByPrimaryKey(TodayExplosionsCommon record);
}