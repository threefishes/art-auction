package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EagleAwardLog;
import cn.threefishes.cloudrepository.entity.EagleAwardLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EagleAwardLogMapper {
    long countByExample(EagleAwardLogExample example);

    int deleteByExample(EagleAwardLogExample example);

    int deleteByPrimaryKey(Integer eagleAwardLogId);

    int insert(EagleAwardLog record);

    int insertSelective(EagleAwardLog record);

    List<EagleAwardLog> selectByExampleWithRowbounds(EagleAwardLogExample example, RowBounds rowBounds);

    List<EagleAwardLog> selectByExample(EagleAwardLogExample example);

    EagleAwardLog selectByPrimaryKey(Integer eagleAwardLogId);

    int updateByExampleSelective(@Param("record") EagleAwardLog record, @Param("example") EagleAwardLogExample example);

    int updateByExample(@Param("record") EagleAwardLog record, @Param("example") EagleAwardLogExample example);

    int updateByPrimaryKeySelective(EagleAwardLog record);

    int updateByPrimaryKey(EagleAwardLog record);
}