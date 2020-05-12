package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatOrdersGoods;
import cn.threefishes.cloudrepository.entity.StatOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatOrdersGoodsMapper {
    long countByExample(StatOrdersGoodsExample example);

    int deleteByExample(StatOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(StatOrdersGoods record);

    int insertSelective(StatOrdersGoods record);

    List<StatOrdersGoods> selectByExampleWithRowbounds(StatOrdersGoodsExample example, RowBounds rowBounds);

    List<StatOrdersGoods> selectByExample(StatOrdersGoodsExample example);

    StatOrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") StatOrdersGoods record, @Param("example") StatOrdersGoodsExample example);

    int updateByExample(@Param("record") StatOrdersGoods record, @Param("example") StatOrdersGoodsExample example);

    int updateByPrimaryKeySelective(StatOrdersGoods record);

    int updateByPrimaryKey(StatOrdersGoods record);
}