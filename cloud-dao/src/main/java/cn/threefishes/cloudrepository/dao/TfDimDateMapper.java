package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfDimDate;
import cn.threefishes.cloudrepository.entity.TfDimDateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfDimDateMapper {
    long countByExample(TfDimDateExample example);

    int deleteByExample(TfDimDateExample example);

    int insert(TfDimDate record);

    int insertSelective(TfDimDate record);

    List<TfDimDate> selectByExampleWithRowbounds(TfDimDateExample example, RowBounds rowBounds);

    List<TfDimDate> selectByExample(TfDimDateExample example);

    int updateByExampleSelective(@Param("record") TfDimDate record, @Param("example") TfDimDateExample example);

    int updateByExample(@Param("record") TfDimDate record, @Param("example") TfDimDateExample example);
}