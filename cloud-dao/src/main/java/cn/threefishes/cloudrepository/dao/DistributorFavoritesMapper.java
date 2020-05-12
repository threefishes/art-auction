package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorFavorites;
import cn.threefishes.cloudrepository.entity.DistributorFavoritesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorFavoritesMapper {
    long countByExample(DistributorFavoritesExample example);

    int deleteByExample(DistributorFavoritesExample example);

    int deleteByPrimaryKey(Integer distributorFavoritesId);

    int insert(DistributorFavorites record);

    int insertSelective(DistributorFavorites record);

    List<DistributorFavorites> selectByExampleWithRowbounds(DistributorFavoritesExample example, RowBounds rowBounds);

    List<DistributorFavorites> selectByExample(DistributorFavoritesExample example);

    DistributorFavorites selectByPrimaryKey(Integer distributorFavoritesId);

    int updateByExampleSelective(@Param("record") DistributorFavorites record, @Param("example") DistributorFavoritesExample example);

    int updateByExample(@Param("record") DistributorFavorites record, @Param("example") DistributorFavoritesExample example);

    int updateByPrimaryKeySelective(DistributorFavorites record);

    int updateByPrimaryKey(DistributorFavorites record);
}