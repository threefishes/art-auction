package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DwMemberUpdateLog;
import cn.threefishes.cloudrepository.entity.DwMemberUpdateLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DwMemberUpdateLogMapper {
    long countByExample(DwMemberUpdateLogExample example);

    int deleteByExample(DwMemberUpdateLogExample example);

    int deleteByPrimaryKey(Integer updateLogId);

    int insert(DwMemberUpdateLog record);

    int insertSelective(DwMemberUpdateLog record);

    List<DwMemberUpdateLog> selectByExampleWithRowbounds(DwMemberUpdateLogExample example, RowBounds rowBounds);

    List<DwMemberUpdateLog> selectByExample(DwMemberUpdateLogExample example);

    DwMemberUpdateLog selectByPrimaryKey(Integer updateLogId);

    int updateByExampleSelective(@Param("record") DwMemberUpdateLog record, @Param("example") DwMemberUpdateLogExample example);

    int updateByExample(@Param("record") DwMemberUpdateLog record, @Param("example") DwMemberUpdateLogExample example);

    int updateByPrimaryKeySelective(DwMemberUpdateLog record);

    int updateByPrimaryKey(DwMemberUpdateLog record);
}