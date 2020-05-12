package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VirtualOrdersGoods;
import cn.threefishes.cloudrepository.entity.VirtualOrdersGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VirtualOrdersGoodsMapper {
    long countByExample(VirtualOrdersGoodsExample example);

    int deleteByExample(VirtualOrdersGoodsExample example);

    int deleteByPrimaryKey(Integer ordersGoodsId);

    int insert(VirtualOrdersGoods record);

    int insertSelective(VirtualOrdersGoods record);

    List<VirtualOrdersGoods> selectByExampleWithRowbounds(VirtualOrdersGoodsExample example, RowBounds rowBounds);

    List<VirtualOrdersGoods> selectByExample(VirtualOrdersGoodsExample example);

    VirtualOrdersGoods selectByPrimaryKey(Integer ordersGoodsId);

    int updateByExampleSelective(@Param("record") VirtualOrdersGoods record, @Param("example") VirtualOrdersGoodsExample example);

    int updateByExample(@Param("record") VirtualOrdersGoods record, @Param("example") VirtualOrdersGoodsExample example);

    int updateByPrimaryKeySelective(VirtualOrdersGoods record);

    int updateByPrimaryKey(VirtualOrdersGoods record);
}