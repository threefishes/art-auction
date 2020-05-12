package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialFollow;
import cn.threefishes.cloudrepository.entity.AdvertorialFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialFollowMapper {
    long countByExample(AdvertorialFollowExample example);

    int deleteByExample(AdvertorialFollowExample example);

    int deleteByPrimaryKey(Integer followId);

    int insert(AdvertorialFollow record);

    int insertSelective(AdvertorialFollow record);

    List<AdvertorialFollow> selectByExampleWithRowbounds(AdvertorialFollowExample example, RowBounds rowBounds);

    List<AdvertorialFollow> selectByExample(AdvertorialFollowExample example);

    AdvertorialFollow selectByPrimaryKey(Integer followId);

    int updateByExampleSelective(@Param("record") AdvertorialFollow record, @Param("example") AdvertorialFollowExample example);

    int updateByExample(@Param("record") AdvertorialFollow record, @Param("example") AdvertorialFollowExample example);

    int updateByPrimaryKeySelective(AdvertorialFollow record);

    int updateByPrimaryKey(AdvertorialFollow record);
}