package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SzzgSpecialSellingGoods;
import cn.threefishes.cloudrepository.entity.SzzgSpecialSellingGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SzzgSpecialSellingGoodsMapper {
    long countByExample(SzzgSpecialSellingGoodsExample example);

    int deleteByExample(SzzgSpecialSellingGoodsExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(SzzgSpecialSellingGoods record);

    int insertSelective(SzzgSpecialSellingGoods record);

    List<SzzgSpecialSellingGoods> selectByExampleWithRowbounds(SzzgSpecialSellingGoodsExample example, RowBounds rowBounds);

    List<SzzgSpecialSellingGoods> selectByExample(SzzgSpecialSellingGoodsExample example);

    SzzgSpecialSellingGoods selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") SzzgSpecialSellingGoods record, @Param("example") SzzgSpecialSellingGoodsExample example);

    int updateByExample(@Param("record") SzzgSpecialSellingGoods record, @Param("example") SzzgSpecialSellingGoodsExample example);

    int updateByPrimaryKeySelective(SzzgSpecialSellingGoods record);

    int updateByPrimaryKey(SzzgSpecialSellingGoods record);
}