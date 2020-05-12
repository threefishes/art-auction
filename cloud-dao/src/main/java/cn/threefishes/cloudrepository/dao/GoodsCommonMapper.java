package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsCommon;
import cn.threefishes.cloudrepository.entity.GoodsCommonExample;
import cn.threefishes.cloudrepository.entity.GoodsCommonWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsCommonMapper {
    long countByExample(GoodsCommonExample example);

    int deleteByExample(GoodsCommonExample example);

    int deleteByPrimaryKey(Integer commonId);

    int insert(GoodsCommonWithBLOBs record);

    int insertSelective(GoodsCommonWithBLOBs record);

    List<GoodsCommonWithBLOBs> selectByExampleWithBLOBsWithRowbounds(GoodsCommonExample example, RowBounds rowBounds);

    List<GoodsCommonWithBLOBs> selectByExampleWithBLOBs(GoodsCommonExample example);

    List<GoodsCommon> selectByExampleWithRowbounds(GoodsCommonExample example, RowBounds rowBounds);

    List<GoodsCommon> selectByExample(GoodsCommonExample example);

    GoodsCommonWithBLOBs selectByPrimaryKey(Integer commonId);

    int updateByExampleSelective(@Param("record") GoodsCommonWithBLOBs record, @Param("example") GoodsCommonExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsCommonWithBLOBs record, @Param("example") GoodsCommonExample example);

    int updateByExample(@Param("record") GoodsCommon record, @Param("example") GoodsCommonExample example);

    int updateByPrimaryKeySelective(GoodsCommonWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsCommonWithBLOBs record);

    int updateByPrimaryKey(GoodsCommon record);
}