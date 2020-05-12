package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AppStat;
import cn.threefishes.cloudrepository.entity.AppStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AppStatMapper {
    long countByExample(AppStatExample example);

    int deleteByExample(AppStatExample example);

    int deleteByPrimaryKey(Integer statId);

    int insert(AppStat record);

    int insertSelective(AppStat record);

    List<AppStat> selectByExampleWithRowbounds(AppStatExample example, RowBounds rowBounds);

    List<AppStat> selectByExample(AppStatExample example);

    AppStat selectByPrimaryKey(Integer statId);

    int updateByExampleSelective(@Param("record") AppStat record, @Param("example") AppStatExample example);

    int updateByExample(@Param("record") AppStat record, @Param("example") AppStatExample example);

    int updateByPrimaryKeySelective(AppStat record);

    int updateByPrimaryKey(AppStat record);
}