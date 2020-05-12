package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ArtificialMaterialCategory;
import cn.threefishes.cloudrepository.entity.ArtificialMaterialCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArtificialMaterialCategoryMapper {
    long countByExample(ArtificialMaterialCategoryExample example);

    int deleteByExample(ArtificialMaterialCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(ArtificialMaterialCategory record);

    int insertSelective(ArtificialMaterialCategory record);

    List<ArtificialMaterialCategory> selectByExampleWithRowbounds(ArtificialMaterialCategoryExample example, RowBounds rowBounds);

    List<ArtificialMaterialCategory> selectByExample(ArtificialMaterialCategoryExample example);

    ArtificialMaterialCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") ArtificialMaterialCategory record, @Param("example") ArtificialMaterialCategoryExample example);

    int updateByExample(@Param("record") ArtificialMaterialCategory record, @Param("example") ArtificialMaterialCategoryExample example);

    int updateByPrimaryKeySelective(ArtificialMaterialCategory record);

    int updateByPrimaryKey(ArtificialMaterialCategory record);
}