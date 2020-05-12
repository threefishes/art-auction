package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsSpecImage;
import cn.threefishes.cloudrepository.entity.GoodsSpecImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsSpecImageMapper {
    long countByExample(GoodsSpecImageExample example);

    int deleteByExample(GoodsSpecImageExample example);

    int deleteByPrimaryKey(Integer specImageId);

    int insert(GoodsSpecImage record);

    int insertSelective(GoodsSpecImage record);

    List<GoodsSpecImage> selectByExampleWithRowbounds(GoodsSpecImageExample example, RowBounds rowBounds);

    List<GoodsSpecImage> selectByExample(GoodsSpecImageExample example);

    GoodsSpecImage selectByPrimaryKey(Integer specImageId);

    int updateByExampleSelective(@Param("record") GoodsSpecImage record, @Param("example") GoodsSpecImageExample example);

    int updateByExample(@Param("record") GoodsSpecImage record, @Param("example") GoodsSpecImageExample example);

    int updateByPrimaryKeySelective(GoodsSpecImage record);

    int updateByPrimaryKey(GoodsSpecImage record);
}