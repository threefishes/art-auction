package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsGiftIntroduction;
import cn.threefishes.cloudrepository.entity.GoodsGiftIntroductionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsGiftIntroductionMapper {
    long countByExample(GoodsGiftIntroductionExample example);

    int deleteByExample(GoodsGiftIntroductionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsGiftIntroduction record);

    int insertSelective(GoodsGiftIntroduction record);

    List<GoodsGiftIntroduction> selectByExampleWithRowbounds(GoodsGiftIntroductionExample example, RowBounds rowBounds);

    List<GoodsGiftIntroduction> selectByExample(GoodsGiftIntroductionExample example);

    GoodsGiftIntroduction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsGiftIntroduction record, @Param("example") GoodsGiftIntroductionExample example);

    int updateByExample(@Param("record") GoodsGiftIntroduction record, @Param("example") GoodsGiftIntroductionExample example);

    int updateByPrimaryKeySelective(GoodsGiftIntroduction record);

    int updateByPrimaryKey(GoodsGiftIntroduction record);
}