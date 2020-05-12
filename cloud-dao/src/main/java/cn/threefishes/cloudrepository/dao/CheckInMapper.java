package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CheckIn;
import cn.threefishes.cloudrepository.entity.CheckInExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CheckInMapper {
    long countByExample(CheckInExample example);

    int deleteByExample(CheckInExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckIn record);

    int insertSelective(CheckIn record);

    List<CheckIn> selectByExampleWithRowbounds(CheckInExample example, RowBounds rowBounds);

    List<CheckIn> selectByExample(CheckInExample example);

    CheckIn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckIn record, @Param("example") CheckInExample example);

    int updateByExample(@Param("record") CheckIn record, @Param("example") CheckInExample example);

    int updateByPrimaryKeySelective(CheckIn record);

    int updateByPrimaryKey(CheckIn record);
}