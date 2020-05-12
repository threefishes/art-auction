package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinNoticeLog;
import cn.threefishes.cloudrepository.entity.WeixinNoticeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinNoticeLogMapper {
    long countByExample(WeixinNoticeLogExample example);

    int deleteByExample(WeixinNoticeLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(WeixinNoticeLog record);

    int insertSelective(WeixinNoticeLog record);

    List<WeixinNoticeLog> selectByExampleWithRowbounds(WeixinNoticeLogExample example, RowBounds rowBounds);

    List<WeixinNoticeLog> selectByExample(WeixinNoticeLogExample example);

    WeixinNoticeLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") WeixinNoticeLog record, @Param("example") WeixinNoticeLogExample example);

    int updateByExample(@Param("record") WeixinNoticeLog record, @Param("example") WeixinNoticeLogExample example);

    int updateByPrimaryKeySelective(WeixinNoticeLog record);

    int updateByPrimaryKey(WeixinNoticeLog record);
}