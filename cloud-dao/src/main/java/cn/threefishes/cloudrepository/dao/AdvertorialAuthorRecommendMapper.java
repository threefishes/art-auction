package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialAuthorRecommend;
import cn.threefishes.cloudrepository.entity.AdvertorialAuthorRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialAuthorRecommendMapper {
    long countByExample(AdvertorialAuthorRecommendExample example);

    int deleteByExample(AdvertorialAuthorRecommendExample example);

    int deleteByPrimaryKey(Integer recommendId);

    int insert(AdvertorialAuthorRecommend record);

    int insertSelective(AdvertorialAuthorRecommend record);

    List<AdvertorialAuthorRecommend> selectByExampleWithRowbounds(AdvertorialAuthorRecommendExample example, RowBounds rowBounds);

    List<AdvertorialAuthorRecommend> selectByExample(AdvertorialAuthorRecommendExample example);

    AdvertorialAuthorRecommend selectByPrimaryKey(Integer recommendId);

    int updateByExampleSelective(@Param("record") AdvertorialAuthorRecommend record, @Param("example") AdvertorialAuthorRecommendExample example);

    int updateByExample(@Param("record") AdvertorialAuthorRecommend record, @Param("example") AdvertorialAuthorRecommendExample example);

    int updateByPrimaryKeySelective(AdvertorialAuthorRecommend record);

    int updateByPrimaryKey(AdvertorialAuthorRecommend record);
}