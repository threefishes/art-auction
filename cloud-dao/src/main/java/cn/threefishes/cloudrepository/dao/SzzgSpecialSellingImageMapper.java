package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SzzgSpecialSellingImage;
import cn.threefishes.cloudrepository.entity.SzzgSpecialSellingImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SzzgSpecialSellingImageMapper {
    long countByExample(SzzgSpecialSellingImageExample example);

    int deleteByExample(SzzgSpecialSellingImageExample example);

    int deleteByPrimaryKey(Integer imageId);

    int insert(SzzgSpecialSellingImage record);

    int insertSelective(SzzgSpecialSellingImage record);

    List<SzzgSpecialSellingImage> selectByExampleWithRowbounds(SzzgSpecialSellingImageExample example, RowBounds rowBounds);

    List<SzzgSpecialSellingImage> selectByExample(SzzgSpecialSellingImageExample example);

    SzzgSpecialSellingImage selectByPrimaryKey(Integer imageId);

    int updateByExampleSelective(@Param("record") SzzgSpecialSellingImage record, @Param("example") SzzgSpecialSellingImageExample example);

    int updateByExample(@Param("record") SzzgSpecialSellingImage record, @Param("example") SzzgSpecialSellingImageExample example);

    int updateByPrimaryKeySelective(SzzgSpecialSellingImage record);

    int updateByPrimaryKey(SzzgSpecialSellingImage record);
}