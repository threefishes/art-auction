package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RechargeOrdersGoods;
import cn.threefishes.cloudrepository.entity.RechargeOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RechargeOrdersGoodsMapper {
    long countByExample(RechargeOrdersGoodsExample example);

    int deleteByExample(RechargeOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(RechargeOrdersGoods record);

    int insertSelective(RechargeOrdersGoods record);

    List<RechargeOrdersGoods> selectByExampleWithRowbounds(RechargeOrdersGoodsExample example, RowBounds rowBounds);

    List<RechargeOrdersGoods> selectByExample(RechargeOrdersGoodsExample example);

    RechargeOrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") RechargeOrdersGoods record, @Param("example") RechargeOrdersGoodsExample example);

    int updateByExample(@Param("record") RechargeOrdersGoods record, @Param("example") RechargeOrdersGoodsExample example);

    int updateByPrimaryKeySelective(RechargeOrdersGoods record);

    int updateByPrimaryKey(RechargeOrdersGoods record);
}