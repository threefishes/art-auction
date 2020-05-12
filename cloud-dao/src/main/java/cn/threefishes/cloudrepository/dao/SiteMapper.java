package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Site;
import cn.threefishes.cloudrepository.entity.SiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SiteMapper {
    long countByExample(SiteExample example);

    int deleteByExample(SiteExample example);

    int deleteByPrimaryKey(String title);

    int insert(Site record);

    int insertSelective(Site record);

    List<Site> selectByExampleWithRowbounds(SiteExample example, RowBounds rowBounds);

    List<Site> selectByExample(SiteExample example);

    Site selectByPrimaryKey(String title);

    int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteExample example);

    int updateByExample(@Param("record") Site record, @Param("example") SiteExample example);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
}