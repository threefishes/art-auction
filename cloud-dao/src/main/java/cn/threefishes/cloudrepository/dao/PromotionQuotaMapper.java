package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PromotionQuota;
import cn.threefishes.cloudrepository.entity.PromotionQuotaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PromotionQuotaMapper {
    long countByExample(PromotionQuotaExample example);

    int deleteByExample(PromotionQuotaExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(PromotionQuota record);

    int insertSelective(PromotionQuota record);

    List<PromotionQuota> selectByExampleWithRowbounds(PromotionQuotaExample example, RowBounds rowBounds);

    List<PromotionQuota> selectByExample(PromotionQuotaExample example);

    PromotionQuota selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") PromotionQuota record, @Param("example") PromotionQuotaExample example);

    int updateByExample(@Param("record") PromotionQuota record, @Param("example") PromotionQuotaExample example);

    int updateByPrimaryKeySelective(PromotionQuota record);

    int updateByPrimaryKey(PromotionQuota record);
}