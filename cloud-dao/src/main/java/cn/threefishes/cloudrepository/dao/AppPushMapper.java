package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AppPush;
import cn.threefishes.cloudrepository.entity.AppPushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppPushMapper {
    long countByExample(AppPushExample example);

    int deleteByExample(AppPushExample example);

    int deleteByPrimaryKey(Integer pushId);

    int insert(AppPush record);

    int insertSelective(AppPush record);

    List<AppPush> selectByExampleWithRowbounds(AppPushExample example, RowBounds rowBounds);

    List<AppPush> selectByExample(AppPushExample example);

    AppPush selectByPrimaryKey(Integer pushId);

    int updateByExampleSelective(@Param("record") AppPush record, @Param("example") AppPushExample example);

    int updateByExample(@Param("record") AppPush record, @Param("example") AppPushExample example);

    int updateByPrimaryKeySelective(AppPush record);

    int updateByPrimaryKey(AppPush record);
}