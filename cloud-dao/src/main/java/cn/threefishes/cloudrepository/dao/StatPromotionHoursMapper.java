package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StatPromotionHours;
import cn.threefishes.cloudrepository.entity.StatPromotionHoursExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StatPromotionHoursMapper {
    long countByExample(StatPromotionHoursExample example);

    int deleteByExample(StatPromotionHoursExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(StatPromotionHours record);

    int insertSelective(StatPromotionHours record);

    List<StatPromotionHours> selectByExampleWithRowbounds(StatPromotionHoursExample example, RowBounds rowBounds);

    List<StatPromotionHours> selectByExample(StatPromotionHoursExample example);

    StatPromotionHours selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") StatPromotionHours record, @Param("example") StatPromotionHoursExample example);

    int updateByExample(@Param("record") StatPromotionHours record, @Param("example") StatPromotionHoursExample example);

    int updateByPrimaryKeySelective(StatPromotionHours record);

    int updateByPrimaryKey(StatPromotionHours record);
}