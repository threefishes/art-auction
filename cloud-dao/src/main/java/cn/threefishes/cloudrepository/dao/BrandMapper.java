package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Brand;
import cn.threefishes.cloudrepository.entity.BrandExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandMapper {
    long countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExampleWithRowbounds(BrandExample example, RowBounds rowBounds);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}