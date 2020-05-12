package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainGoods;
import cn.threefishes.cloudrepository.entity.ChainGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainGoodsMapper {
    long countByExample(ChainGoodsExample example);

    int deleteByExample(ChainGoodsExample example);

    int deleteByPrimaryKey(Integer chainGoodsId);

    int insert(ChainGoods record);

    int insertSelective(ChainGoods record);

    List<ChainGoods> selectByExampleWithRowbounds(ChainGoodsExample example, RowBounds rowBounds);

    List<ChainGoods> selectByExample(ChainGoodsExample example);

    ChainGoods selectByPrimaryKey(Integer chainGoodsId);

    int updateByExampleSelective(@Param("record") ChainGoods record, @Param("example") ChainGoodsExample example);

    int updateByExample(@Param("record") ChainGoods record, @Param("example") ChainGoodsExample example);

    int updateByPrimaryKeySelective(ChainGoods record);

    int updateByPrimaryKey(ChainGoods record);
}