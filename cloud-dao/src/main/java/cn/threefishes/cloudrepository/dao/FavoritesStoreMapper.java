package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.FavoritesStore;
import cn.threefishes.cloudrepository.entity.FavoritesStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FavoritesStoreMapper {
    long countByExample(FavoritesStoreExample example);

    int deleteByExample(FavoritesStoreExample example);

    int deleteByPrimaryKey(Integer favoritesId);

    int insert(FavoritesStore record);

    int insertSelective(FavoritesStore record);

    List<FavoritesStore> selectByExampleWithRowbounds(FavoritesStoreExample example, RowBounds rowBounds);

    List<FavoritesStore> selectByExample(FavoritesStoreExample example);

    FavoritesStore selectByPrimaryKey(Integer favoritesId);

    int updateByExampleSelective(@Param("record") FavoritesStore record, @Param("example") FavoritesStoreExample example);

    int updateByExample(@Param("record") FavoritesStore record, @Param("example") FavoritesStoreExample example);

    int updateByPrimaryKeySelective(FavoritesStore record);

    int updateByPrimaryKey(FavoritesStore record);
}