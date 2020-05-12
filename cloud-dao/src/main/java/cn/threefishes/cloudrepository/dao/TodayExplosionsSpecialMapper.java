package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TodayExplosionsSpecial;
import cn.threefishes.cloudrepository.entity.TodayExplosionsSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TodayExplosionsSpecialMapper {
    long countByExample(TodayExplosionsSpecialExample example);

    int deleteByExample(TodayExplosionsSpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(TodayExplosionsSpecial record);

    int insertSelective(TodayExplosionsSpecial record);

    List<TodayExplosionsSpecial> selectByExampleWithRowbounds(TodayExplosionsSpecialExample example, RowBounds rowBounds);

    List<TodayExplosionsSpecial> selectByExample(TodayExplosionsSpecialExample example);

    TodayExplosionsSpecial selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") TodayExplosionsSpecial record, @Param("example") TodayExplosionsSpecialExample example);

    int updateByExample(@Param("record") TodayExplosionsSpecial record, @Param("example") TodayExplosionsSpecialExample example);

    int updateByPrimaryKeySelective(TodayExplosionsSpecial record);

    int updateByPrimaryKey(TodayExplosionsSpecial record);
}