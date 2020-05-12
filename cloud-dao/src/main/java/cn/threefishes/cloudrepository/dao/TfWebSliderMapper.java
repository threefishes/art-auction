package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfWebSlider;
import cn.threefishes.cloudrepository.entity.TfWebSliderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfWebSliderMapper {
    long countByExample(TfWebSliderExample example);

    int deleteByExample(TfWebSliderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TfWebSlider record);

    int insertSelective(TfWebSlider record);

    List<TfWebSlider> selectByExampleWithRowbounds(TfWebSliderExample example, RowBounds rowBounds);

    List<TfWebSlider> selectByExample(TfWebSliderExample example);

    TfWebSlider selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TfWebSlider record, @Param("example") TfWebSliderExample example);

    int updateByExample(@Param("record") TfWebSlider record, @Param("example") TfWebSliderExample example);

    int updateByPrimaryKeySelective(TfWebSlider record);

    int updateByPrimaryKey(TfWebSlider record);
}