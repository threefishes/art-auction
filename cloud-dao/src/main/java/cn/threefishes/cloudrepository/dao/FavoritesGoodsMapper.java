package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.FavoritesGoods;
import cn.threefishes.cloudrepository.entity.FavoritesGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FavoritesGoodsMapper {
    long countByExample(FavoritesGoodsExample example);

    int deleteByExample(FavoritesGoodsExample example);

    int deleteByPrimaryKey(Integer favoritesId);

    int insert(FavoritesGoods record);

    int insertSelective(FavoritesGoods record);

    List<FavoritesGoods> selectByExampleWithRowbounds(FavoritesGoodsExample example, RowBounds rowBounds);

    List<FavoritesGoods> selectByExample(FavoritesGoodsExample example);

    FavoritesGoods selectByPrimaryKey(Integer favoritesId);

    int updateByExampleSelective(@Param("record") FavoritesGoods record, @Param("example") FavoritesGoodsExample example);

    int updateByExample(@Param("record") FavoritesGoods record, @Param("example") FavoritesGoodsExample example);

    int updateByPrimaryKeySelective(FavoritesGoods record);

    int updateByPrimaryKey(FavoritesGoods record);
}