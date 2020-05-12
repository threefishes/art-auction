package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreJoinin;
import cn.threefishes.cloudrepository.entity.StoreJoininExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreJoininMapper {
    long countByExample(StoreJoininExample example);

    int deleteByExample(StoreJoininExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(StoreJoinin record);

    int insertSelective(StoreJoinin record);

    List<StoreJoinin> selectByExampleWithRowbounds(StoreJoininExample example, RowBounds rowBounds);

    List<StoreJoinin> selectByExample(StoreJoininExample example);

    StoreJoinin selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") StoreJoinin record, @Param("example") StoreJoininExample example);

    int updateByExample(@Param("record") StoreJoinin record, @Param("example") StoreJoininExample example);

    int updateByPrimaryKeySelective(StoreJoinin record);

    int updateByPrimaryKey(StoreJoinin record);
}