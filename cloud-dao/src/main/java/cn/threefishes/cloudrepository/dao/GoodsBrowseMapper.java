package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsBrowse;
import cn.threefishes.cloudrepository.entity.GoodsBrowseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsBrowseMapper {
    long countByExample(GoodsBrowseExample example);

    int deleteByExample(GoodsBrowseExample example);

    int deleteByPrimaryKey(Integer browseId);

    int insert(GoodsBrowse record);

    int insertSelective(GoodsBrowse record);

    List<GoodsBrowse> selectByExampleWithRowbounds(GoodsBrowseExample example, RowBounds rowBounds);

    List<GoodsBrowse> selectByExample(GoodsBrowseExample example);

    GoodsBrowse selectByPrimaryKey(Integer browseId);

    int updateByExampleSelective(@Param("record") GoodsBrowse record, @Param("example") GoodsBrowseExample example);

    int updateByExample(@Param("record") GoodsBrowse record, @Param("example") GoodsBrowseExample example);

    int updateByPrimaryKeySelective(GoodsBrowse record);

    int updateByPrimaryKey(GoodsBrowse record);
}