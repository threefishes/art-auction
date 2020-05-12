package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributionGoods;
import cn.threefishes.cloudrepository.entity.DistributionGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributionGoodsMapper {
    long countByExample(DistributionGoodsExample example);

    int deleteByExample(DistributionGoodsExample example);

    int deleteByPrimaryKey(Integer commonId);

    int insert(DistributionGoods record);

    int insertSelective(DistributionGoods record);

    List<DistributionGoods> selectByExampleWithRowbounds(DistributionGoodsExample example, RowBounds rowBounds);

    List<DistributionGoods> selectByExample(DistributionGoodsExample example);

    DistributionGoods selectByPrimaryKey(Integer commonId);

    int updateByExampleSelective(@Param("record") DistributionGoods record, @Param("example") DistributionGoodsExample example);

    int updateByExample(@Param("record") DistributionGoods record, @Param("example") DistributionGoodsExample example);

    int updateByPrimaryKeySelective(DistributionGoods record);

    int updateByPrimaryKey(DistributionGoods record);
}