package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatPriceRange;
import cn.threefishes.cloudrepository.entity.StatPriceRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatPriceRangeMapper {
    long countByExample(StatPriceRangeExample example);

    int deleteByExample(StatPriceRangeExample example);

    int deleteByPrimaryKey(Integer rangeId);

    int insert(StatPriceRange record);

    int insertSelective(StatPriceRange record);

    List<StatPriceRange> selectByExampleWithRowbounds(StatPriceRangeExample example, RowBounds rowBounds);

    List<StatPriceRange> selectByExample(StatPriceRangeExample example);

    StatPriceRange selectByPrimaryKey(Integer rangeId);

    int updateByExampleSelective(@Param("record") StatPriceRange record, @Param("example") StatPriceRangeExample example);

    int updateByExample(@Param("record") StatPriceRange record, @Param("example") StatPriceRangeExample example);

    int updateByPrimaryKeySelective(StatPriceRange record);

    int updateByPrimaryKey(StatPriceRange record);
}