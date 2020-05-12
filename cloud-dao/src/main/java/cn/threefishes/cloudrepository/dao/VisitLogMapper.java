package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VisitLog;
import cn.threefishes.cloudrepository.entity.VisitLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VisitLogMapper {
    long countByExample(VisitLogExample example);

    int deleteByExample(VisitLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(VisitLog record);

    int insertSelective(VisitLog record);

    List<VisitLog> selectByExampleWithRowbounds(VisitLogExample example, RowBounds rowBounds);

    List<VisitLog> selectByExample(VisitLogExample example);

    VisitLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByExample(@Param("record") VisitLog record, @Param("example") VisitLogExample example);

    int updateByPrimaryKeySelective(VisitLog record);

    int updateByPrimaryKey(VisitLog record);
}