package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiSpecialItemLog;
import cn.threefishes.cloudrepository.entity.ApiSpecialItemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiSpecialItemLogMapper {
    long countByExample(ApiSpecialItemLogExample example);

    int deleteByExample(ApiSpecialItemLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(ApiSpecialItemLog record);

    int insertSelective(ApiSpecialItemLog record);

    List<ApiSpecialItemLog> selectByExampleWithBLOBsWithRowbounds(ApiSpecialItemLogExample example, RowBounds rowBounds);

    List<ApiSpecialItemLog> selectByExampleWithBLOBs(ApiSpecialItemLogExample example);

    List<ApiSpecialItemLog> selectByExampleWithRowbounds(ApiSpecialItemLogExample example, RowBounds rowBounds);

    List<ApiSpecialItemLog> selectByExample(ApiSpecialItemLogExample example);

    ApiSpecialItemLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") ApiSpecialItemLog record, @Param("example") ApiSpecialItemLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiSpecialItemLog record, @Param("example") ApiSpecialItemLogExample example);

    int updateByExample(@Param("record") ApiSpecialItemLog record, @Param("example") ApiSpecialItemLogExample example);

    int updateByPrimaryKeySelective(ApiSpecialItemLog record);

    int updateByPrimaryKeyWithBLOBs(ApiSpecialItemLog record);

    int updateByPrimaryKey(ApiSpecialItemLog record);
}