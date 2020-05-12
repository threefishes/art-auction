package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMaterialNewsItem;
import cn.threefishes.cloudrepository.entity.WeixinMaterialNewsItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMaterialNewsItemMapper {
    long countByExample(WeixinMaterialNewsItemExample example);

    int deleteByExample(WeixinMaterialNewsItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(WeixinMaterialNewsItem record);

    int insertSelective(WeixinMaterialNewsItem record);

    List<WeixinMaterialNewsItem> selectByExampleWithBLOBsWithRowbounds(WeixinMaterialNewsItemExample example, RowBounds rowBounds);

    List<WeixinMaterialNewsItem> selectByExampleWithBLOBs(WeixinMaterialNewsItemExample example);

    List<WeixinMaterialNewsItem> selectByExampleWithRowbounds(WeixinMaterialNewsItemExample example, RowBounds rowBounds);

    List<WeixinMaterialNewsItem> selectByExample(WeixinMaterialNewsItemExample example);

    WeixinMaterialNewsItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") WeixinMaterialNewsItem record, @Param("example") WeixinMaterialNewsItemExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMaterialNewsItem record, @Param("example") WeixinMaterialNewsItemExample example);

    int updateByExample(@Param("record") WeixinMaterialNewsItem record, @Param("example") WeixinMaterialNewsItemExample example);

    int updateByPrimaryKeySelective(WeixinMaterialNewsItem record);

    int updateByPrimaryKeyWithBLOBs(WeixinMaterialNewsItem record);

    int updateByPrimaryKey(WeixinMaterialNewsItem record);
}