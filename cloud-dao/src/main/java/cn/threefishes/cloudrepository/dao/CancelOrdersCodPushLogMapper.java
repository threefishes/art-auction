package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CancelOrdersCodPushLog;
import cn.threefishes.cloudrepository.entity.CancelOrdersCodPushLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CancelOrdersCodPushLogMapper {
    long countByExample(CancelOrdersCodPushLogExample example);

    int deleteByExample(CancelOrdersCodPushLogExample example);

    int deleteByPrimaryKey(Integer pushOrdersId);

    int insert(CancelOrdersCodPushLog record);

    int insertSelective(CancelOrdersCodPushLog record);

    List<CancelOrdersCodPushLog> selectByExampleWithRowbounds(CancelOrdersCodPushLogExample example, RowBounds rowBounds);

    List<CancelOrdersCodPushLog> selectByExample(CancelOrdersCodPushLogExample example);

    CancelOrdersCodPushLog selectByPrimaryKey(Integer pushOrdersId);

    int updateByExampleSelective(@Param("record") CancelOrdersCodPushLog record, @Param("example") CancelOrdersCodPushLogExample example);

    int updateByExample(@Param("record") CancelOrdersCodPushLog record, @Param("example") CancelOrdersCodPushLogExample example);

    int updateByPrimaryKeySelective(CancelOrdersCodPushLog record);

    int updateByPrimaryKey(CancelOrdersCodPushLog record);
}