package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreNavigation;
import cn.threefishes.cloudrepository.entity.StoreNavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreNavigationMapper {
    long countByExample(StoreNavigationExample example);

    int deleteByExample(StoreNavigationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreNavigation record);

    int insertSelective(StoreNavigation record);

    List<StoreNavigation> selectByExampleWithBLOBsWithRowbounds(StoreNavigationExample example, RowBounds rowBounds);

    List<StoreNavigation> selectByExampleWithBLOBs(StoreNavigationExample example);

    List<StoreNavigation> selectByExampleWithRowbounds(StoreNavigationExample example, RowBounds rowBounds);

    List<StoreNavigation> selectByExample(StoreNavigationExample example);

    StoreNavigation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreNavigation record, @Param("example") StoreNavigationExample example);

    int updateByExampleWithBLOBs(@Param("record") StoreNavigation record, @Param("example") StoreNavigationExample example);

    int updateByExample(@Param("record") StoreNavigation record, @Param("example") StoreNavigationExample example);

    int updateByPrimaryKeySelective(StoreNavigation record);

    int updateByPrimaryKeyWithBLOBs(StoreNavigation record);

    int updateByPrimaryKey(StoreNavigation record);
}