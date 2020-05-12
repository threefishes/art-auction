package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShopConfig;
import cn.threefishes.cloudrepository.entity.ShopConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShopConfigMapper {
    long countByExample(ShopConfigExample example);

    int deleteByExample(ShopConfigExample example);

    int deleteByPrimaryKey(Integer kdtId);

    int insert(ShopConfig record);

    int insertSelective(ShopConfig record);

    List<ShopConfig> selectByExampleWithRowbounds(ShopConfigExample example, RowBounds rowBounds);

    List<ShopConfig> selectByExample(ShopConfigExample example);

    ShopConfig selectByPrimaryKey(Integer kdtId);

    int updateByExampleSelective(@Param("record") ShopConfig record, @Param("example") ShopConfigExample example);

    int updateByExample(@Param("record") ShopConfig record, @Param("example") ShopConfigExample example);

    int updateByPrimaryKeySelective(ShopConfig record);

    int updateByPrimaryKey(ShopConfig record);
}