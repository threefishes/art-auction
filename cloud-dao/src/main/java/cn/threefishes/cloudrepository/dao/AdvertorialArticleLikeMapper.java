package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialArticleLike;
import cn.threefishes.cloudrepository.entity.AdvertorialArticleLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialArticleLikeMapper {
    long countByExample(AdvertorialArticleLikeExample example);

    int deleteByExample(AdvertorialArticleLikeExample example);

    int deleteByPrimaryKey(Integer likeId);

    int insert(AdvertorialArticleLike record);

    int insertSelective(AdvertorialArticleLike record);

    List<AdvertorialArticleLike> selectByExampleWithRowbounds(AdvertorialArticleLikeExample example, RowBounds rowBounds);

    List<AdvertorialArticleLike> selectByExample(AdvertorialArticleLikeExample example);

    AdvertorialArticleLike selectByPrimaryKey(Integer likeId);

    int updateByExampleSelective(@Param("record") AdvertorialArticleLike record, @Param("example") AdvertorialArticleLikeExample example);

    int updateByExample(@Param("record") AdvertorialArticleLike record, @Param("example") AdvertorialArticleLikeExample example);

    int updateByPrimaryKeySelective(AdvertorialArticleLike record);

    int updateByPrimaryKey(AdvertorialArticleLike record);
}