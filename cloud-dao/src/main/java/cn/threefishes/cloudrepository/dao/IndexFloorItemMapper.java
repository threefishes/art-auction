package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.IndexFloorItem;
import cn.threefishes.cloudrepository.entity.IndexFloorItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IndexFloorItemMapper {
    long countByExample(IndexFloorItemExample example);

    int deleteByExample(IndexFloorItemExample example);

    int deleteByPrimaryKey(Integer floorItemId);

    int insert(IndexFloorItem record);

    int insertSelective(IndexFloorItem record);

    List<IndexFloorItem> selectByExampleWithBLOBsWithRowbounds(IndexFloorItemExample example, RowBounds rowBounds);

    List<IndexFloorItem> selectByExampleWithBLOBs(IndexFloorItemExample example);

    List<IndexFloorItem> selectByExampleWithRowbounds(IndexFloorItemExample example, RowBounds rowBounds);

    List<IndexFloorItem> selectByExample(IndexFloorItemExample example);

    IndexFloorItem selectByPrimaryKey(Integer floorItemId);

    int updateByExampleSelective(@Param("record") IndexFloorItem record, @Param("example") IndexFloorItemExample example);

    int updateByExampleWithBLOBs(@Param("record") IndexFloorItem record, @Param("example") IndexFloorItemExample example);

    int updateByExample(@Param("record") IndexFloorItem record, @Param("example") IndexFloorItemExample example);

    int updateByPrimaryKeySelective(IndexFloorItem record);

    int updateByPrimaryKeyWithBLOBs(IndexFloorItem record);

    int updateByPrimaryKey(IndexFloorItem record);
}