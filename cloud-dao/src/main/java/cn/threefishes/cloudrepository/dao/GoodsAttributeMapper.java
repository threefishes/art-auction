package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsAttributeExample;
import cn.threefishes.cloudrepository.entity.GoodsAttributeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsAttributeMapper {
    long countByExample(GoodsAttributeExample example);

    int deleteByExample(GoodsAttributeExample example);

    int deleteByPrimaryKey(GoodsAttributeKey key);

    int insert(GoodsAttributeKey record);

    int insertSelective(GoodsAttributeKey record);

    List<GoodsAttributeKey> selectByExampleWithRowbounds(GoodsAttributeExample example, RowBounds rowBounds);

    List<GoodsAttributeKey> selectByExample(GoodsAttributeExample example);

    int updateByExampleSelective(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeExample example);

    int updateByExample(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeExample example);
}