package cn.threefishes.cloudrepository.dao.activity;

import cn.threefishes.cloudrepository.entity.activity.Site;
import cn.threefishes.cloudrepository.entity.activity.SiteExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SiteMapper {
    long countByExample(SiteExample example);

    int deleteByExample(SiteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Site record);

    int insertSelective(Site record);

    List<Site> selectByExampleWithRowbounds(SiteExample example, RowBounds rowBounds);

    List<Site> selectByExample(SiteExample example);

    Site selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Site record, @Param("example") SiteExample example);

    int updateByExample(@Param("record") Site record, @Param("example") SiteExample example);

    int updateByPrimaryKeySelective(Site record);

    int updateByPrimaryKey(Site record);
}