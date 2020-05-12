package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PointsGoods;
import cn.threefishes.cloudrepository.entity.PointsGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PointsGoodsMapper {
    long countByExample(PointsGoodsExample example);

    int deleteByExample(PointsGoodsExample example);

    int deleteByPrimaryKey(Integer pointsGoodsId);

    int insert(PointsGoods record);

    int insertSelective(PointsGoods record);

    List<PointsGoods> selectByExampleWithRowbounds(PointsGoodsExample example, RowBounds rowBounds);

    List<PointsGoods> selectByExample(PointsGoodsExample example);

    PointsGoods selectByPrimaryKey(Integer pointsGoodsId);

    int updateByExampleSelective(@Param("record") PointsGoods record, @Param("example") PointsGoodsExample example);

    int updateByExample(@Param("record") PointsGoods record, @Param("example") PointsGoodsExample example);

    int updateByPrimaryKeySelective(PointsGoods record);

    int updateByPrimaryKey(PointsGoods record);
}