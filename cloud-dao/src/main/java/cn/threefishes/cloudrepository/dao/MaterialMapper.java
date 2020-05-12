package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Material;
import cn.threefishes.cloudrepository.entity.MaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialMapper {
    long countByExample(MaterialExample example);

    int deleteByExample(MaterialExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(Material record);

    int insertSelective(Material record);

    List<Material> selectByExampleWithBLOBsWithRowbounds(MaterialExample example, RowBounds rowBounds);

    List<Material> selectByExampleWithBLOBs(MaterialExample example);

    List<Material> selectByExampleWithRowbounds(MaterialExample example, RowBounds rowBounds);

    List<Material> selectByExample(MaterialExample example);

    Material selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByExampleWithBLOBs(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByExample(@Param("record") Material record, @Param("example") MaterialExample example);

    int updateByPrimaryKeySelective(Material record);

    int updateByPrimaryKeyWithBLOBs(Material record);

    int updateByPrimaryKey(Material record);
}