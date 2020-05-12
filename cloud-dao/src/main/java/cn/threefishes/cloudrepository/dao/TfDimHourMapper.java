package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfDimHour;
import cn.threefishes.cloudrepository.entity.TfDimHourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfDimHourMapper {
    long countByExample(TfDimHourExample example);

    int deleteByExample(TfDimHourExample example);

    int deleteByPrimaryKey(Integer hourId);

    int insert(TfDimHour record);

    int insertSelective(TfDimHour record);

    List<TfDimHour> selectByExampleWithRowbounds(TfDimHourExample example, RowBounds rowBounds);

    List<TfDimHour> selectByExample(TfDimHourExample example);

    TfDimHour selectByPrimaryKey(Integer hourId);

    int updateByExampleSelective(@Param("record") TfDimHour record, @Param("example") TfDimHourExample example);

    int updateByExample(@Param("record") TfDimHour record, @Param("example") TfDimHourExample example);

    int updateByPrimaryKeySelective(TfDimHour record);

    int updateByPrimaryKey(TfDimHour record);
}