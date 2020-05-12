package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainStatOrdersGoods;
import cn.threefishes.cloudrepository.entity.ChainStatOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainStatOrdersGoodsMapper {
    long countByExample(ChainStatOrdersGoodsExample example);

    int deleteByExample(ChainStatOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(ChainStatOrdersGoods record);

    int insertSelective(ChainStatOrdersGoods record);

    List<ChainStatOrdersGoods> selectByExampleWithRowbounds(ChainStatOrdersGoodsExample example, RowBounds rowBounds);

    List<ChainStatOrdersGoods> selectByExample(ChainStatOrdersGoodsExample example);

    ChainStatOrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") ChainStatOrdersGoods record, @Param("example") ChainStatOrdersGoodsExample example);

    int updateByExample(@Param("record") ChainStatOrdersGoods record, @Param("example") ChainStatOrdersGoodsExample example);

    int updateByPrimaryKeySelective(ChainStatOrdersGoods record);

    int updateByPrimaryKey(ChainStatOrdersGoods record);
}