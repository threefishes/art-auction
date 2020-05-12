package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ArtificialMaterial;
import cn.threefishes.cloudrepository.entity.ArtificialMaterialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArtificialMaterialMapper {
    long countByExample(ArtificialMaterialExample example);

    int deleteByExample(ArtificialMaterialExample example);

    int deleteByPrimaryKey(Integer materialId);

    int insert(ArtificialMaterial record);

    int insertSelective(ArtificialMaterial record);

    List<ArtificialMaterial> selectByExampleWithBLOBsWithRowbounds(ArtificialMaterialExample example, RowBounds rowBounds);

    List<ArtificialMaterial> selectByExampleWithBLOBs(ArtificialMaterialExample example);

    List<ArtificialMaterial> selectByExampleWithRowbounds(ArtificialMaterialExample example, RowBounds rowBounds);

    List<ArtificialMaterial> selectByExample(ArtificialMaterialExample example);

    ArtificialMaterial selectByPrimaryKey(Integer materialId);

    int updateByExampleSelective(@Param("record") ArtificialMaterial record, @Param("example") ArtificialMaterialExample example);

    int updateByExampleWithBLOBs(@Param("record") ArtificialMaterial record, @Param("example") ArtificialMaterialExample example);

    int updateByExample(@Param("record") ArtificialMaterial record, @Param("example") ArtificialMaterialExample example);

    int updateByPrimaryKeySelective(ArtificialMaterial record);

    int updateByPrimaryKeyWithBLOBs(ArtificialMaterial record);

    int updateByPrimaryKey(ArtificialMaterial record);
}