package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PredepositLog;
import cn.threefishes.cloudrepository.entity.PredepositLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PredepositLogMapper {
    long countByExample(PredepositLogExample example);

    int deleteByExample(PredepositLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(PredepositLog record);

    int insertSelective(PredepositLog record);

    List<PredepositLog> selectByExampleWithRowbounds(PredepositLogExample example, RowBounds rowBounds);

    List<PredepositLog> selectByExample(PredepositLogExample example);

    PredepositLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") PredepositLog record, @Param("example") PredepositLogExample example);

    int updateByExample(@Param("record") PredepositLog record, @Param("example") PredepositLogExample example);

    int updateByPrimaryKeySelective(PredepositLog record);

    int updateByPrimaryKey(PredepositLog record);
}