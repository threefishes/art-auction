package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMaterialNews;
import cn.threefishes.cloudrepository.entity.WeixinMaterialNewsExample;
import cn.threefishes.cloudrepository.entity.WeixinMaterialNewsWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMaterialNewsMapper {
    long countByExample(WeixinMaterialNewsExample example);

    int deleteByExample(WeixinMaterialNewsExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(WeixinMaterialNewsWithBLOBs record);

    int insertSelective(WeixinMaterialNewsWithBLOBs record);

    List<WeixinMaterialNewsWithBLOBs> selectByExampleWithBLOBsWithRowbounds(WeixinMaterialNewsExample example, RowBounds rowBounds);

    List<WeixinMaterialNewsWithBLOBs> selectByExampleWithBLOBs(WeixinMaterialNewsExample example);

    List<WeixinMaterialNews> selectByExampleWithRowbounds(WeixinMaterialNewsExample example, RowBounds rowBounds);

    List<WeixinMaterialNews> selectByExample(WeixinMaterialNewsExample example);

    WeixinMaterialNewsWithBLOBs selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") WeixinMaterialNewsWithBLOBs record, @Param("example") WeixinMaterialNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMaterialNewsWithBLOBs record, @Param("example") WeixinMaterialNewsExample example);

    int updateByExample(@Param("record") WeixinMaterialNews record, @Param("example") WeixinMaterialNewsExample example);

    int updateByPrimaryKeySelective(WeixinMaterialNewsWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WeixinMaterialNewsWithBLOBs record);

    int updateByPrimaryKey(WeixinMaterialNews record);
}