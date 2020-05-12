package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SmsCodeBlacklist;
import cn.threefishes.cloudrepository.entity.SmsCodeBlacklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SmsCodeBlacklistMapper {
    long countByExample(SmsCodeBlacklistExample example);

    int deleteByExample(SmsCodeBlacklistExample example);

    int deleteByPrimaryKey(Long mobile);

    int insert(SmsCodeBlacklist record);

    int insertSelective(SmsCodeBlacklist record);

    List<SmsCodeBlacklist> selectByExampleWithRowbounds(SmsCodeBlacklistExample example, RowBounds rowBounds);

    List<SmsCodeBlacklist> selectByExample(SmsCodeBlacklistExample example);

    SmsCodeBlacklist selectByPrimaryKey(Long mobile);

    int updateByExampleSelective(@Param("record") SmsCodeBlacklist record, @Param("example") SmsCodeBlacklistExample example);

    int updateByExample(@Param("record") SmsCodeBlacklist record, @Param("example") SmsCodeBlacklistExample example);

    int updateByPrimaryKeySelective(SmsCodeBlacklist record);

    int updateByPrimaryKey(SmsCodeBlacklist record);
}