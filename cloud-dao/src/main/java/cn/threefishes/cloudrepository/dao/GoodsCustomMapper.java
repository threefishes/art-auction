package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsCustom;
import cn.threefishes.cloudrepository.entity.GoodsCustomExample;
import cn.threefishes.cloudrepository.entity.GoodsCustomKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsCustomMapper {
    long countByExample(GoodsCustomExample example);

    int deleteByExample(GoodsCustomExample example);

    int deleteByPrimaryKey(GoodsCustomKey key);

    int insert(GoodsCustom record);

    int insertSelective(GoodsCustom record);

    List<GoodsCustom> selectByExampleWithRowbounds(GoodsCustomExample example, RowBounds rowBounds);

    List<GoodsCustom> selectByExample(GoodsCustomExample example);

    GoodsCustom selectByPrimaryKey(GoodsCustomKey key);

    int updateByExampleSelective(@Param("record") GoodsCustom record, @Param("example") GoodsCustomExample example);

    int updateByExample(@Param("record") GoodsCustom record, @Param("example") GoodsCustomExample example);

    int updateByPrimaryKeySelective(GoodsCustom record);

    int updateByPrimaryKey(GoodsCustom record);
}