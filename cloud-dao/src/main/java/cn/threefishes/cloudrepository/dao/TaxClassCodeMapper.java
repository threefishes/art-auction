package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaxClassCode;
import cn.threefishes.cloudrepository.entity.TaxClassCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaxClassCodeMapper {
    long countByExample(TaxClassCodeExample example);

    int deleteByExample(TaxClassCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaxClassCode record);

    int insertSelective(TaxClassCode record);

    List<TaxClassCode> selectByExampleWithRowbounds(TaxClassCodeExample example, RowBounds rowBounds);

    List<TaxClassCode> selectByExample(TaxClassCodeExample example);

    TaxClassCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaxClassCode record, @Param("example") TaxClassCodeExample example);

    int updateByExample(@Param("record") TaxClassCode record, @Param("example") TaxClassCodeExample example);

    int updateByPrimaryKeySelective(TaxClassCode record);

    int updateByPrimaryKey(TaxClassCode record);
}