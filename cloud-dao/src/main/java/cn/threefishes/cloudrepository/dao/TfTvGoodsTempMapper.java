package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfTvGoodsTemp;
import cn.threefishes.cloudrepository.entity.TfTvGoodsTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfTvGoodsTempMapper {
    long countByExample(TfTvGoodsTempExample example);

    int deleteByExample(TfTvGoodsTempExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TfTvGoodsTemp record);

    int insertSelective(TfTvGoodsTemp record);

    List<TfTvGoodsTemp> selectByExampleWithRowbounds(TfTvGoodsTempExample example, RowBounds rowBounds);

    List<TfTvGoodsTemp> selectByExample(TfTvGoodsTempExample example);

    TfTvGoodsTemp selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TfTvGoodsTemp record, @Param("example") TfTvGoodsTempExample example);

    int updateByExample(@Param("record") TfTvGoodsTemp record, @Param("example") TfTvGoodsTempExample example);

    int updateByPrimaryKeySelective(TfTvGoodsTemp record);

    int updateByPrimaryKey(TfTvGoodsTemp record);
}