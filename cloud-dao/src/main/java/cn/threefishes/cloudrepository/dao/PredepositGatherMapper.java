package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PredepositGather;
import cn.threefishes.cloudrepository.entity.PredepositGatherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PredepositGatherMapper {
    long countByExample(PredepositGatherExample example);

    int deleteByExample(PredepositGatherExample example);

    int deleteByPrimaryKey(Integer gatherId);

    int insert(PredepositGather record);

    int insertSelective(PredepositGather record);

    List<PredepositGather> selectByExampleWithRowbounds(PredepositGatherExample example, RowBounds rowBounds);

    List<PredepositGather> selectByExample(PredepositGatherExample example);

    PredepositGather selectByPrimaryKey(Integer gatherId);

    int updateByExampleSelective(@Param("record") PredepositGather record, @Param("example") PredepositGatherExample example);

    int updateByExample(@Param("record") PredepositGather record, @Param("example") PredepositGatherExample example);

    int updateByPrimaryKeySelective(PredepositGather record);

    int updateByPrimaryKey(PredepositGather record);
}