package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsRate;
import cn.threefishes.cloudrepository.entity.GoodsRateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsRateMapper {
    long countByExample(GoodsRateExample example);

    int deleteByExample(GoodsRateExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsRate record);

    int insertSelective(GoodsRate record);

    List<GoodsRate> selectByExampleWithRowbounds(GoodsRateExample example, RowBounds rowBounds);

    List<GoodsRate> selectByExample(GoodsRateExample example);

    GoodsRate selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsRate record, @Param("example") GoodsRateExample example);

    int updateByExample(@Param("record") GoodsRate record, @Param("example") GoodsRateExample example);

    int updateByPrimaryKeySelective(GoodsRate record);

    int updateByPrimaryKey(GoodsRate record);
}