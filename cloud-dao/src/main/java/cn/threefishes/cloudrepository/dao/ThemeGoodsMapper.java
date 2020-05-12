package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ThemeGoods;
import cn.threefishes.cloudrepository.entity.ThemeGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ThemeGoodsMapper {
    long countByExample(ThemeGoodsExample example);

    int deleteByExample(ThemeGoodsExample example);

    int deleteByPrimaryKey(Integer themeGoodsId);

    int insert(ThemeGoods record);

    int insertSelective(ThemeGoods record);

    List<ThemeGoods> selectByExampleWithRowbounds(ThemeGoodsExample example, RowBounds rowBounds);

    List<ThemeGoods> selectByExample(ThemeGoodsExample example);

    ThemeGoods selectByPrimaryKey(Integer themeGoodsId);

    int updateByExampleSelective(@Param("record") ThemeGoods record, @Param("example") ThemeGoodsExample example);

    int updateByExample(@Param("record") ThemeGoods record, @Param("example") ThemeGoodsExample example);

    int updateByPrimaryKeySelective(ThemeGoods record);

    int updateByPrimaryKey(ThemeGoods record);
}