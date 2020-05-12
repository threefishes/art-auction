package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsRecommond;
import cn.threefishes.cloudrepository.entity.GoodsRecommondExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsRecommondMapper {
    long countByExample(GoodsRecommondExample example);

    int deleteByExample(GoodsRecommondExample example);

    int deleteByPrimaryKey(Integer recommondId);

    int insert(GoodsRecommond record);

    int insertSelective(GoodsRecommond record);

    List<GoodsRecommond> selectByExampleWithRowbounds(GoodsRecommondExample example, RowBounds rowBounds);

    List<GoodsRecommond> selectByExample(GoodsRecommondExample example);

    GoodsRecommond selectByPrimaryKey(Integer recommondId);

    int updateByExampleSelective(@Param("record") GoodsRecommond record, @Param("example") GoodsRecommondExample example);

    int updateByExample(@Param("record") GoodsRecommond record, @Param("example") GoodsRecommondExample example);

    int updateByPrimaryKeySelective(GoodsRecommond record);

    int updateByPrimaryKey(GoodsRecommond record);
}