package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfTvGoods;
import cn.threefishes.cloudrepository.entity.TfTvGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfTvGoodsMapper {
    long countByExample(TfTvGoodsExample example);

    int deleteByExample(TfTvGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TfTvGoods record);

    int insertSelective(TfTvGoods record);

    List<TfTvGoods> selectByExampleWithRowbounds(TfTvGoodsExample example, RowBounds rowBounds);

    List<TfTvGoods> selectByExample(TfTvGoodsExample example);

    TfTvGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TfTvGoods record, @Param("example") TfTvGoodsExample example);

    int updateByExample(@Param("record") TfTvGoods record, @Param("example") TfTvGoodsExample example);

    int updateByPrimaryKeySelective(TfTvGoods record);

    int updateByPrimaryKey(TfTvGoods record);
}