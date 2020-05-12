package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SmsCodeLog;
import cn.threefishes.cloudrepository.entity.SmsCodeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SmsCodeLogMapper {
    long countByExample(SmsCodeLogExample example);

    int deleteByExample(SmsCodeLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SmsCodeLog record);

    int insertSelective(SmsCodeLog record);

    List<SmsCodeLog> selectByExampleWithRowbounds(SmsCodeLogExample example, RowBounds rowBounds);

    List<SmsCodeLog> selectByExample(SmsCodeLogExample example);

    SmsCodeLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SmsCodeLog record, @Param("example") SmsCodeLogExample example);

    int updateByExample(@Param("record") SmsCodeLog record, @Param("example") SmsCodeLogExample example);

    int updateByPrimaryKeySelective(SmsCodeLog record);

    int updateByPrimaryKey(SmsCodeLog record);
}