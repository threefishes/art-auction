package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BrandApply;
import cn.threefishes.cloudrepository.entity.BrandApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandApplyMapper {
    long countByExample(BrandApplyExample example);

    int deleteByExample(BrandApplyExample example);

    int deleteByPrimaryKey(Integer brandId);

    int insert(BrandApply record);

    int insertSelective(BrandApply record);

    List<BrandApply> selectByExampleWithRowbounds(BrandApplyExample example, RowBounds rowBounds);

    List<BrandApply> selectByExample(BrandApplyExample example);

    BrandApply selectByPrimaryKey(Integer brandId);

    int updateByExampleSelective(@Param("record") BrandApply record, @Param("example") BrandApplyExample example);

    int updateByExample(@Param("record") BrandApply record, @Param("example") BrandApplyExample example);

    int updateByPrimaryKeySelective(BrandApply record);

    int updateByPrimaryKey(BrandApply record);
}