package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinPushstockLog;
import cn.threefishes.cloudrepository.entity.WeixinPushstockLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinPushstockLogMapper {
    long countByExample(WeixinPushstockLogExample example);

    int deleteByExample(WeixinPushstockLogExample example);

    int deleteByPrimaryKey(Integer autoid);

    int insert(WeixinPushstockLog record);

    int insertSelective(WeixinPushstockLog record);

    List<WeixinPushstockLog> selectByExampleWithRowbounds(WeixinPushstockLogExample example, RowBounds rowBounds);

    List<WeixinPushstockLog> selectByExample(WeixinPushstockLogExample example);

    WeixinPushstockLog selectByPrimaryKey(Integer autoid);

    int updateByExampleSelective(@Param("record") WeixinPushstockLog record, @Param("example") WeixinPushstockLogExample example);

    int updateByExample(@Param("record") WeixinPushstockLog record, @Param("example") WeixinPushstockLogExample example);

    int updateByPrimaryKeySelective(WeixinPushstockLog record);

    int updateByPrimaryKey(WeixinPushstockLog record);
}