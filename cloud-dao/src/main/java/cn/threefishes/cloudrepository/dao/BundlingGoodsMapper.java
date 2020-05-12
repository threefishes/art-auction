package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BundlingGoods;
import cn.threefishes.cloudrepository.entity.BundlingGoodsExample;
import cn.threefishes.cloudrepository.entity.BundlingGoodsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BundlingGoodsMapper {
    long countByExample(BundlingGoodsExample example);

    int deleteByExample(BundlingGoodsExample example);

    int deleteByPrimaryKey(BundlingGoodsKey key);

    int insert(BundlingGoods record);

    int insertSelective(BundlingGoods record);

    List<BundlingGoods> selectByExampleWithRowbounds(BundlingGoodsExample example, RowBounds rowBounds);

    List<BundlingGoods> selectByExample(BundlingGoodsExample example);

    BundlingGoods selectByPrimaryKey(BundlingGoodsKey key);

    int updateByExampleSelective(@Param("record") BundlingGoods record, @Param("example") BundlingGoodsExample example);

    int updateByExample(@Param("record") BundlingGoods record, @Param("example") BundlingGoodsExample example);

    int updateByPrimaryKeySelective(BundlingGoods record);

    int updateByPrimaryKey(BundlingGoods record);
}