package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMaterialImage;
import cn.threefishes.cloudrepository.entity.WeixinMaterialImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMaterialImageMapper {
    long countByExample(WeixinMaterialImageExample example);

    int deleteByExample(WeixinMaterialImageExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(WeixinMaterialImage record);

    int insertSelective(WeixinMaterialImage record);

    List<WeixinMaterialImage> selectByExampleWithRowbounds(WeixinMaterialImageExample example, RowBounds rowBounds);

    List<WeixinMaterialImage> selectByExample(WeixinMaterialImageExample example);

    WeixinMaterialImage selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") WeixinMaterialImage record, @Param("example") WeixinMaterialImageExample example);

    int updateByExample(@Param("record") WeixinMaterialImage record, @Param("example") WeixinMaterialImageExample example);

    int updateByPrimaryKeySelective(WeixinMaterialImage record);

    int updateByPrimaryKey(WeixinMaterialImage record);
}