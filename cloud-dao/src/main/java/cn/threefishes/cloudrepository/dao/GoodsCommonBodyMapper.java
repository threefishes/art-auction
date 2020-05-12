package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsCommonBody;
import cn.threefishes.cloudrepository.entity.GoodsCommonBodyExample;
import cn.threefishes.cloudrepository.entity.GoodsCommonBodyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsCommonBodyMapper {
    long countByExample(GoodsCommonBodyExample example);

    int deleteByExample(GoodsCommonBodyExample example);

    int deleteByPrimaryKey(Integer commonId);

    int insert(GoodsCommonBodyWithBLOBs record);

    int insertSelective(GoodsCommonBodyWithBLOBs record);

    List<GoodsCommonBodyWithBLOBs> selectByExampleWithBLOBsWithRowbounds(GoodsCommonBodyExample example, RowBounds rowBounds);

    List<GoodsCommonBodyWithBLOBs> selectByExampleWithBLOBs(GoodsCommonBodyExample example);

    List<GoodsCommonBody> selectByExampleWithRowbounds(GoodsCommonBodyExample example, RowBounds rowBounds);

    List<GoodsCommonBody> selectByExample(GoodsCommonBodyExample example);

    GoodsCommonBodyWithBLOBs selectByPrimaryKey(Integer commonId);

    int updateByExampleSelective(@Param("record") GoodsCommonBodyWithBLOBs record, @Param("example") GoodsCommonBodyExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsCommonBodyWithBLOBs record, @Param("example") GoodsCommonBodyExample example);

    int updateByExample(@Param("record") GoodsCommonBody record, @Param("example") GoodsCommonBodyExample example);

    int updateByPrimaryKeySelective(GoodsCommonBodyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsCommonBodyWithBLOBs record);

    int updateByPrimaryKey(GoodsCommonBody record);
}