package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BrandLabel;
import cn.threefishes.cloudrepository.entity.BrandLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BrandLabelMapper {
    long countByExample(BrandLabelExample example);

    int deleteByExample(BrandLabelExample example);

    int deleteByPrimaryKey(Integer brandLabelId);

    int insert(BrandLabel record);

    int insertSelective(BrandLabel record);

    List<BrandLabel> selectByExampleWithRowbounds(BrandLabelExample example, RowBounds rowBounds);

    List<BrandLabel> selectByExample(BrandLabelExample example);

    BrandLabel selectByPrimaryKey(Integer brandLabelId);

    int updateByExampleSelective(@Param("record") BrandLabel record, @Param("example") BrandLabelExample example);

    int updateByExample(@Param("record") BrandLabel record, @Param("example") BrandLabelExample example);

    int updateByPrimaryKeySelective(BrandLabel record);

    int updateByPrimaryKey(BrandLabel record);
}