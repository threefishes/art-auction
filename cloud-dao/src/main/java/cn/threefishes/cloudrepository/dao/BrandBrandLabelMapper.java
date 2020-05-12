package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BrandBrandLabelExample;
import cn.threefishes.cloudrepository.entity.BrandBrandLabelKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandBrandLabelMapper {
    long countByExample(BrandBrandLabelExample example);

    int deleteByExample(BrandBrandLabelExample example);

    int deleteByPrimaryKey(BrandBrandLabelKey key);

    int insert(BrandBrandLabelKey record);

    int insertSelective(BrandBrandLabelKey record);

    List<BrandBrandLabelKey> selectByExampleWithRowbounds(BrandBrandLabelExample example, RowBounds rowBounds);

    List<BrandBrandLabelKey> selectByExample(BrandBrandLabelExample example);

    int updateByExampleSelective(@Param("record") BrandBrandLabelKey record, @Param("example") BrandBrandLabelExample example);

    int updateByExample(@Param("record") BrandBrandLabelKey record, @Param("example") BrandBrandLabelExample example);
}