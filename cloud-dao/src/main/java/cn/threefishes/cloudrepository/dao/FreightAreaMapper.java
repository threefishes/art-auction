package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.FreightArea;
import cn.threefishes.cloudrepository.entity.FreightAreaExample;
import cn.threefishes.cloudrepository.entity.FreightAreaWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface FreightAreaMapper {
    long countByExample(FreightAreaExample example);

    int deleteByExample(FreightAreaExample example);

    int deleteByPrimaryKey(Integer freightAreaId);

    int insert(FreightAreaWithBLOBs record);

    int insertSelective(FreightAreaWithBLOBs record);

    List<FreightAreaWithBLOBs> selectByExampleWithBLOBsWithRowbounds(FreightAreaExample example, RowBounds rowBounds);

    List<FreightAreaWithBLOBs> selectByExampleWithBLOBs(FreightAreaExample example);

    List<FreightArea> selectByExampleWithRowbounds(FreightAreaExample example, RowBounds rowBounds);

    List<FreightArea> selectByExample(FreightAreaExample example);

    FreightAreaWithBLOBs selectByPrimaryKey(Integer freightAreaId);

    int updateByExampleSelective(@Param("record") FreightAreaWithBLOBs record, @Param("example") FreightAreaExample example);

    int updateByExampleWithBLOBs(@Param("record") FreightAreaWithBLOBs record, @Param("example") FreightAreaExample example);

    int updateByExample(@Param("record") FreightArea record, @Param("example") FreightAreaExample example);

    int updateByPrimaryKeySelective(FreightAreaWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(FreightAreaWithBLOBs record);

    int updateByPrimaryKey(FreightArea record);
}