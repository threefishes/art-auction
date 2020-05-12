package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainEvaluate;
import cn.threefishes.cloudrepository.entity.ChainEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainEvaluateMapper {
    long countByExample(ChainEvaluateExample example);

    int deleteByExample(ChainEvaluateExample example);

    int deleteByPrimaryKey(Integer evaluateId);

    int insert(ChainEvaluate record);

    int insertSelective(ChainEvaluate record);

    List<ChainEvaluate> selectByExampleWithRowbounds(ChainEvaluateExample example, RowBounds rowBounds);

    List<ChainEvaluate> selectByExample(ChainEvaluateExample example);

    ChainEvaluate selectByPrimaryKey(Integer evaluateId);

    int updateByExampleSelective(@Param("record") ChainEvaluate record, @Param("example") ChainEvaluateExample example);

    int updateByExample(@Param("record") ChainEvaluate record, @Param("example") ChainEvaluateExample example);

    int updateByPrimaryKeySelective(ChainEvaluate record);

    int updateByPrimaryKey(ChainEvaluate record);
}