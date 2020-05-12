package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainOrdersGoods;
import cn.threefishes.cloudrepository.entity.ChainOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainOrdersGoodsMapper {
    long countByExample(ChainOrdersGoodsExample example);

    int deleteByExample(ChainOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(ChainOrdersGoods record);

    int insertSelective(ChainOrdersGoods record);

    List<ChainOrdersGoods> selectByExampleWithRowbounds(ChainOrdersGoodsExample example, RowBounds rowBounds);

    List<ChainOrdersGoods> selectByExample(ChainOrdersGoodsExample example);

    ChainOrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") ChainOrdersGoods record, @Param("example") ChainOrdersGoodsExample example);

    int updateByExample(@Param("record") ChainOrdersGoods record, @Param("example") ChainOrdersGoodsExample example);

    int updateByPrimaryKeySelective(ChainOrdersGoods record);

    int updateByPrimaryKey(ChainOrdersGoods record);
}