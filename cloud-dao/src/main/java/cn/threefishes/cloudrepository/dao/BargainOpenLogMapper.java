package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BargainOpenLog;
import cn.threefishes.cloudrepository.entity.BargainOpenLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BargainOpenLogMapper {
    long countByExample(BargainOpenLogExample example);

    int deleteByExample(BargainOpenLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(BargainOpenLog record);

    int insertSelective(BargainOpenLog record);

    List<BargainOpenLog> selectByExampleWithRowbounds(BargainOpenLogExample example, RowBounds rowBounds);

    List<BargainOpenLog> selectByExample(BargainOpenLogExample example);

    BargainOpenLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") BargainOpenLog record, @Param("example") BargainOpenLogExample example);

    int updateByExample(@Param("record") BargainOpenLog record, @Param("example") BargainOpenLogExample example);

    int updateByPrimaryKeySelective(BargainOpenLog record);

    int updateByPrimaryKey(BargainOpenLog record);
}