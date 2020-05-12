package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EvaluateStore;
import cn.threefishes.cloudrepository.entity.EvaluateStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EvaluateStoreMapper {
    long countByExample(EvaluateStoreExample example);

    int deleteByExample(EvaluateStoreExample example);

    int deleteByPrimaryKey(Integer evaluateId);

    int insert(EvaluateStore record);

    int insertSelective(EvaluateStore record);

    List<EvaluateStore> selectByExampleWithRowbounds(EvaluateStoreExample example, RowBounds rowBounds);

    List<EvaluateStore> selectByExample(EvaluateStoreExample example);

    EvaluateStore selectByPrimaryKey(Integer evaluateId);

    int updateByExampleSelective(@Param("record") EvaluateStore record, @Param("example") EvaluateStoreExample example);

    int updateByExample(@Param("record") EvaluateStore record, @Param("example") EvaluateStoreExample example);

    int updateByPrimaryKeySelective(EvaluateStore record);

    int updateByPrimaryKey(EvaluateStore record);
}