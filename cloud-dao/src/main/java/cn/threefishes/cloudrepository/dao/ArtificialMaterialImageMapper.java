package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ArtificialMaterialImage;
import cn.threefishes.cloudrepository.entity.ArtificialMaterialImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArtificialMaterialImageMapper {
    long countByExample(ArtificialMaterialImageExample example);

    int deleteByExample(ArtificialMaterialImageExample example);

    int deleteByPrimaryKey(Long materialImageId);

    int insert(ArtificialMaterialImage record);

    int insertSelective(ArtificialMaterialImage record);

    List<ArtificialMaterialImage> selectByExampleWithRowbounds(ArtificialMaterialImageExample example, RowBounds rowBounds);

    List<ArtificialMaterialImage> selectByExample(ArtificialMaterialImageExample example);

    ArtificialMaterialImage selectByPrimaryKey(Long materialImageId);

    int updateByExampleSelective(@Param("record") ArtificialMaterialImage record, @Param("example") ArtificialMaterialImageExample example);

    int updateByExample(@Param("record") ArtificialMaterialImage record, @Param("example") ArtificialMaterialImageExample example);

    int updateByPrimaryKeySelective(ArtificialMaterialImage record);

    int updateByPrimaryKey(ArtificialMaterialImage record);
}