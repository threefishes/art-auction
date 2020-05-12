package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EmailCodeLog;
import cn.threefishes.cloudrepository.entity.EmailCodeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmailCodeLogMapper {
    long countByExample(EmailCodeLogExample example);

    int deleteByExample(EmailCodeLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(EmailCodeLog record);

    int insertSelective(EmailCodeLog record);

    List<EmailCodeLog> selectByExampleWithRowbounds(EmailCodeLogExample example, RowBounds rowBounds);

    List<EmailCodeLog> selectByExample(EmailCodeLogExample example);

    EmailCodeLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") EmailCodeLog record, @Param("example") EmailCodeLogExample example);

    int updateByExample(@Param("record") EmailCodeLog record, @Param("example") EmailCodeLogExample example);

    int updateByPrimaryKeySelective(EmailCodeLog record);

    int updateByPrimaryKey(EmailCodeLog record);
}