package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreSlide;
import cn.threefishes.cloudrepository.entity.StoreSlideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreSlideMapper {
    long countByExample(StoreSlideExample example);

    int deleteByExample(StoreSlideExample example);

    int deleteByPrimaryKey(Integer slideId);

    int insert(StoreSlide record);

    int insertSelective(StoreSlide record);

    List<StoreSlide> selectByExampleWithRowbounds(StoreSlideExample example, RowBounds rowBounds);

    List<StoreSlide> selectByExample(StoreSlideExample example);

    StoreSlide selectByPrimaryKey(Integer slideId);

    int updateByExampleSelective(@Param("record") StoreSlide record, @Param("example") StoreSlideExample example);

    int updateByExample(@Param("record") StoreSlide record, @Param("example") StoreSlideExample example);

    int updateByPrimaryKeySelective(StoreSlide record);

    int updateByPrimaryKey(StoreSlide record);
}