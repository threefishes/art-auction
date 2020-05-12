package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TaxClassItem;
import cn.threefishes.cloudrepository.entity.TaxClassItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TaxClassItemMapper {
    long countByExample(TaxClassItemExample example);

    int deleteByExample(TaxClassItemExample example);

    int deleteByPrimaryKey(Integer commonId);

    int insert(TaxClassItem record);

    int insertSelective(TaxClassItem record);

    List<TaxClassItem> selectByExampleWithRowbounds(TaxClassItemExample example, RowBounds rowBounds);

    List<TaxClassItem> selectByExample(TaxClassItemExample example);

    TaxClassItem selectByPrimaryKey(Integer commonId);

    int updateByExampleSelective(@Param("record") TaxClassItem record, @Param("example") TaxClassItemExample example);

    int updateByExample(@Param("record") TaxClassItem record, @Param("example") TaxClassItemExample example);

    int updateByPrimaryKeySelective(TaxClassItem record);

    int updateByPrimaryKey(TaxClassItem record);
}