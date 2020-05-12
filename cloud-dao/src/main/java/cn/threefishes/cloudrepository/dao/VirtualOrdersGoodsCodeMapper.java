package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VirtualOrdersGoodsCode;
import cn.threefishes.cloudrepository.entity.VirtualOrdersGoodsCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VirtualOrdersGoodsCodeMapper {
    long countByExample(VirtualOrdersGoodsCodeExample example);

    int deleteByExample(VirtualOrdersGoodsCodeExample example);

    int deleteByPrimaryKey(Integer ordersCodeId);

    int insert(VirtualOrdersGoodsCode record);

    int insertSelective(VirtualOrdersGoodsCode record);

    List<VirtualOrdersGoodsCode> selectByExampleWithRowbounds(VirtualOrdersGoodsCodeExample example, RowBounds rowBounds);

    List<VirtualOrdersGoodsCode> selectByExample(VirtualOrdersGoodsCodeExample example);

    VirtualOrdersGoodsCode selectByPrimaryKey(Integer ordersCodeId);

    int updateByExampleSelective(@Param("record") VirtualOrdersGoodsCode record, @Param("example") VirtualOrdersGoodsCodeExample example);

    int updateByExample(@Param("record") VirtualOrdersGoodsCode record, @Param("example") VirtualOrdersGoodsCodeExample example);

    int updateByPrimaryKeySelective(VirtualOrdersGoodsCode record);

    int updateByPrimaryKey(VirtualOrdersGoodsCode record);
}