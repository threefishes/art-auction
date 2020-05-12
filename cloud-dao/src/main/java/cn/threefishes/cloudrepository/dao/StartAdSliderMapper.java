package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StartAdSlider;
import cn.threefishes.cloudrepository.entity.StartAdSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StartAdSliderMapper {
    long countByExample(StartAdSliderExample example);

    int deleteByExample(StartAdSliderExample example);

    int deleteByPrimaryKey(Integer startAdSliderId);

    int insert(StartAdSlider record);

    int insertSelective(StartAdSlider record);

    List<StartAdSlider> selectByExampleWithBLOBsWithRowbounds(StartAdSliderExample example, RowBounds rowBounds);

    List<StartAdSlider> selectByExampleWithBLOBs(StartAdSliderExample example);

    List<StartAdSlider> selectByExampleWithRowbounds(StartAdSliderExample example, RowBounds rowBounds);

    List<StartAdSlider> selectByExample(StartAdSliderExample example);

    StartAdSlider selectByPrimaryKey(Integer startAdSliderId);

    int updateByExampleSelective(@Param("record") StartAdSlider record, @Param("example") StartAdSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") StartAdSlider record, @Param("example") StartAdSliderExample example);

    int updateByExample(@Param("record") StartAdSlider record, @Param("example") StartAdSliderExample example);

    int updateByPrimaryKeySelective(StartAdSlider record);

    int updateByPrimaryKeyWithBLOBs(StartAdSlider record);
}