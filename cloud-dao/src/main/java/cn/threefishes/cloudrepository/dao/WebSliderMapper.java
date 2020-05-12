package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WebSlider;
import cn.threefishes.cloudrepository.entity.WebSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WebSliderMapper {
    long countByExample(WebSliderExample example);

    int deleteByExample(WebSliderExample example);

    int deleteByPrimaryKey(Integer webSliderId);

    int insert(WebSlider record);

    int insertSelective(WebSlider record);

    List<WebSlider> selectByExampleWithBLOBsWithRowbounds(WebSliderExample example, RowBounds rowBounds);

    List<WebSlider> selectByExampleWithBLOBs(WebSliderExample example);

    List<WebSlider> selectByExampleWithRowbounds(WebSliderExample example, RowBounds rowBounds);

    List<WebSlider> selectByExample(WebSliderExample example);

    WebSlider selectByPrimaryKey(Integer webSliderId);

    int updateByExampleSelective(@Param("record") WebSlider record, @Param("example") WebSliderExample example);

    int updateByExampleWithBLOBs(@Param("record") WebSlider record, @Param("example") WebSliderExample example);

    int updateByExample(@Param("record") WebSlider record, @Param("example") WebSliderExample example);

    int updateByPrimaryKeySelective(WebSlider record);

    int updateByPrimaryKeyWithBLOBs(WebSlider record);

    int updateByPrimaryKey(WebSlider record);
}