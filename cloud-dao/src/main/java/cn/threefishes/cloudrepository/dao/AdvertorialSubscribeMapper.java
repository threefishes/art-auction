package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialSubscribe;
import cn.threefishes.cloudrepository.entity.AdvertorialSubscribeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialSubscribeMapper {
    long countByExample(AdvertorialSubscribeExample example);

    int deleteByExample(AdvertorialSubscribeExample example);

    int deleteByPrimaryKey(Integer subscribeId);

    int insert(AdvertorialSubscribe record);

    int insertSelective(AdvertorialSubscribe record);

    List<AdvertorialSubscribe> selectByExampleWithRowbounds(AdvertorialSubscribeExample example, RowBounds rowBounds);

    List<AdvertorialSubscribe> selectByExample(AdvertorialSubscribeExample example);

    AdvertorialSubscribe selectByPrimaryKey(Integer subscribeId);

    int updateByExampleSelective(@Param("record") AdvertorialSubscribe record, @Param("example") AdvertorialSubscribeExample example);

    int updateByExample(@Param("record") AdvertorialSubscribe record, @Param("example") AdvertorialSubscribeExample example);

    int updateByPrimaryKeySelective(AdvertorialSubscribe record);

    int updateByPrimaryKey(AdvertorialSubscribe record);
}