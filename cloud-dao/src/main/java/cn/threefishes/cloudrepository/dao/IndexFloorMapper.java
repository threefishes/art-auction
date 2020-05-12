package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.IndexFloor;
import cn.threefishes.cloudrepository.entity.IndexFloorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IndexFloorMapper {
    long countByExample(IndexFloorExample example);

    int deleteByExample(IndexFloorExample example);

    int deleteByPrimaryKey(Integer floorId);

    int insert(IndexFloor record);

    int insertSelective(IndexFloor record);

    List<IndexFloor> selectByExampleWithRowbounds(IndexFloorExample example, RowBounds rowBounds);

    List<IndexFloor> selectByExample(IndexFloorExample example);

    IndexFloor selectByPrimaryKey(Integer floorId);

    int updateByExampleSelective(@Param("record") IndexFloor record, @Param("example") IndexFloorExample example);

    int updateByExample(@Param("record") IndexFloor record, @Param("example") IndexFloorExample example);

    int updateByPrimaryKeySelective(IndexFloor record);

    int updateByPrimaryKey(IndexFloor record);
}