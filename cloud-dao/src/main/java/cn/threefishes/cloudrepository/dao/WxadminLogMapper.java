package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WxadminLog;
import cn.threefishes.cloudrepository.entity.WxadminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxadminLogMapper {
    long countByExample(WxadminLogExample example);

    int deleteByExample(WxadminLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(WxadminLog record);

    int insertSelective(WxadminLog record);

    List<WxadminLog> selectByExampleWithRowbounds(WxadminLogExample example, RowBounds rowBounds);

    List<WxadminLog> selectByExample(WxadminLogExample example);

    WxadminLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") WxadminLog record, @Param("example") WxadminLogExample example);

    int updateByExample(@Param("record") WxadminLog record, @Param("example") WxadminLogExample example);

    int updateByPrimaryKeySelective(WxadminLog record);

    int updateByPrimaryKey(WxadminLog record);
}