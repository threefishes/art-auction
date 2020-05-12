package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatStorePriceRange;
import cn.threefishes.cloudrepository.entity.StatStorePriceRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatStorePriceRangeMapper {
    long countByExample(StatStorePriceRangeExample example);

    int deleteByExample(StatStorePriceRangeExample example);

    int deleteByPrimaryKey(Integer rangeId);

    int insert(StatStorePriceRange record);

    int insertSelective(StatStorePriceRange record);

    List<StatStorePriceRange> selectByExampleWithRowbounds(StatStorePriceRangeExample example, RowBounds rowBounds);

    List<StatStorePriceRange> selectByExample(StatStorePriceRangeExample example);

    StatStorePriceRange selectByPrimaryKey(Integer rangeId);

    int updateByExampleSelective(@Param("record") StatStorePriceRange record, @Param("example") StatStorePriceRangeExample example);

    int updateByExample(@Param("record") StatStorePriceRange record, @Param("example") StatStorePriceRangeExample example);

    int updateByPrimaryKeySelective(StatStorePriceRange record);

    int updateByPrimaryKey(StatStorePriceRange record);
}