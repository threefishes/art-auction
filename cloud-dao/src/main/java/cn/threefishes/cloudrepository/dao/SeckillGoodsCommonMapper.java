package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SeckillGoodsCommon;
import cn.threefishes.cloudrepository.entity.SeckillGoodsCommonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeckillGoodsCommonMapper {
    long countByExample(SeckillGoodsCommonExample example);

    int deleteByExample(SeckillGoodsCommonExample example);

    int deleteByPrimaryKey(Integer seckillCommonId);

    int insert(SeckillGoodsCommon record);

    int insertSelective(SeckillGoodsCommon record);

    List<SeckillGoodsCommon> selectByExampleWithRowbounds(SeckillGoodsCommonExample example, RowBounds rowBounds);

    List<SeckillGoodsCommon> selectByExample(SeckillGoodsCommonExample example);

    SeckillGoodsCommon selectByPrimaryKey(Integer seckillCommonId);

    int updateByExampleSelective(@Param("record") SeckillGoodsCommon record, @Param("example") SeckillGoodsCommonExample example);

    int updateByExample(@Param("record") SeckillGoodsCommon record, @Param("example") SeckillGoodsCommonExample example);

    int updateByPrimaryKeySelective(SeckillGoodsCommon record);

    int updateByPrimaryKey(SeckillGoodsCommon record);
}