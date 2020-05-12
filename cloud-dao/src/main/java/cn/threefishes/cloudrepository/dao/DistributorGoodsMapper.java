package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorGoods;
import cn.threefishes.cloudrepository.entity.DistributorGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorGoodsMapper {
    long countByExample(DistributorGoodsExample example);

    int deleteByExample(DistributorGoodsExample example);

    int deleteByPrimaryKey(Integer distributorGoodsId);

    int insert(DistributorGoods record);

    int insertSelective(DistributorGoods record);

    List<DistributorGoods> selectByExampleWithRowbounds(DistributorGoodsExample example, RowBounds rowBounds);

    List<DistributorGoods> selectByExample(DistributorGoodsExample example);

    DistributorGoods selectByPrimaryKey(Integer distributorGoodsId);

    int updateByExampleSelective(@Param("record") DistributorGoods record, @Param("example") DistributorGoodsExample example);

    int updateByExample(@Param("record") DistributorGoods record, @Param("example") DistributorGoodsExample example);

    int updateByPrimaryKeySelective(DistributorGoods record);

    int updateByPrimaryKey(DistributorGoods record);
}