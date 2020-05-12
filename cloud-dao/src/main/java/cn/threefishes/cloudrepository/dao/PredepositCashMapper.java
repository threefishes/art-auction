package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PredepositCash;
import cn.threefishes.cloudrepository.entity.PredepositCashExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PredepositCashMapper {
    long countByExample(PredepositCashExample example);

    int deleteByExample(PredepositCashExample example);

    int deleteByPrimaryKey(Integer cashId);

    int insert(PredepositCash record);

    int insertSelective(PredepositCash record);

    List<PredepositCash> selectByExampleWithRowbounds(PredepositCashExample example, RowBounds rowBounds);

    List<PredepositCash> selectByExample(PredepositCashExample example);

    PredepositCash selectByPrimaryKey(Integer cashId);

    int updateByExampleSelective(@Param("record") PredepositCash record, @Param("example") PredepositCashExample example);

    int updateByExample(@Param("record") PredepositCash record, @Param("example") PredepositCashExample example);

    int updateByPrimaryKeySelective(PredepositCash record);

    int updateByPrimaryKey(PredepositCash record);
}