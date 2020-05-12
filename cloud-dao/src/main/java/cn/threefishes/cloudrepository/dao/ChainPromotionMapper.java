package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainPromotion;
import cn.threefishes.cloudrepository.entity.ChainPromotionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainPromotionMapper {
    long countByExample(ChainPromotionExample example);

    int deleteByExample(ChainPromotionExample example);

    int deleteByPrimaryKey(Integer promotionId);

    int insert(ChainPromotion record);

    int insertSelective(ChainPromotion record);

    List<ChainPromotion> selectByExampleWithRowbounds(ChainPromotionExample example, RowBounds rowBounds);

    List<ChainPromotion> selectByExample(ChainPromotionExample example);

    ChainPromotion selectByPrimaryKey(Integer promotionId);

    int updateByExampleSelective(@Param("record") ChainPromotion record, @Param("example") ChainPromotionExample example);

    int updateByExample(@Param("record") ChainPromotion record, @Param("example") ChainPromotionExample example);

    int updateByPrimaryKeySelective(ChainPromotion record);

    int updateByPrimaryKey(ChainPromotion record);
}