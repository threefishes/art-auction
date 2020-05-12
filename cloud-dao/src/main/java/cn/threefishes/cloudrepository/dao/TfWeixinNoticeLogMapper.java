package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfWeixinNoticeLog;
import cn.threefishes.cloudrepository.entity.TfWeixinNoticeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfWeixinNoticeLogMapper {
    long countByExample(TfWeixinNoticeLogExample example);

    int deleteByExample(TfWeixinNoticeLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(TfWeixinNoticeLog record);

    int insertSelective(TfWeixinNoticeLog record);

    List<TfWeixinNoticeLog> selectByExampleWithRowbounds(TfWeixinNoticeLogExample example, RowBounds rowBounds);

    List<TfWeixinNoticeLog> selectByExample(TfWeixinNoticeLogExample example);

    TfWeixinNoticeLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") TfWeixinNoticeLog record, @Param("example") TfWeixinNoticeLogExample example);

    int updateByExample(@Param("record") TfWeixinNoticeLog record, @Param("example") TfWeixinNoticeLogExample example);

    int updateByPrimaryKeySelective(TfWeixinNoticeLog record);

    int updateByPrimaryKey(TfWeixinNoticeLog record);
}