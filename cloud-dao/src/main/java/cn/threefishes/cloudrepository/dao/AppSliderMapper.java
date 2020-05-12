package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AppSlider;
import cn.threefishes.cloudrepository.entity.AppSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppSliderMapper {
    long countByExample(AppSliderExample example);

    int deleteByExample(AppSliderExample example);

    int deleteByPrimaryKey(Integer appSliderId);

    int insert(AppSlider record);

    int insertSelective(AppSlider record);

    List<AppSlider> selectByExampleWithBLOBsWithRowbounds(AppSliderExample example, RowBounds rowBounds);

    List<AppSlider> selectByExampleWithBLOBs(AppSliderExample example);

    List<AppSlider> selectByExampleWithRowbounds(AppSliderExample example, RowBounds rowBounds);

    List<AppSlider> selectByExample(AppSliderExample example);

    AppSlider selectByPrimaryKey(Integer appSliderId);

    int updateByExampleSelective(@Param("record") AppSlider record, @Param("example") AppSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") AppSlider record, @Param("example") AppSliderExample example);

    int updateByExample(@Param("record") AppSlider record, @Param("example") AppSliderExample example);

    int updateByPrimaryKeySelective(AppSlider record);

    int updateByPrimaryKeyWithBLOBs(AppSlider record);

    int updateByPrimaryKey(AppSlider record);
}