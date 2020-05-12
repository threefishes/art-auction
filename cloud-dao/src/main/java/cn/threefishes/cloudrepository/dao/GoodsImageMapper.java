package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsImage;
import cn.threefishes.cloudrepository.entity.GoodsImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsImageMapper {
    long countByExample(GoodsImageExample example);

    int deleteByExample(GoodsImageExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(GoodsImage record);

    int insertSelective(GoodsImage record);

    List<GoodsImage> selectByExampleWithRowbounds(GoodsImageExample example, RowBounds rowBounds);

    List<GoodsImage> selectByExample(GoodsImageExample example);

    GoodsImage selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    int updateByExample(@Param("record") GoodsImage record, @Param("example") GoodsImageExample example);

    int updateByPrimaryKeySelective(GoodsImage record);

    int updateByPrimaryKey(GoodsImage record);
}