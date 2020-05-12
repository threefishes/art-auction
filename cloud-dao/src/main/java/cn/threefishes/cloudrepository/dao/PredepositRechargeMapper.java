package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PredepositRecharge;
import cn.threefishes.cloudrepository.entity.PredepositRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PredepositRechargeMapper {
    long countByExample(PredepositRechargeExample example);

    int deleteByExample(PredepositRechargeExample example);

    int deleteByPrimaryKey(Integer rechargeId);

    int insert(PredepositRecharge record);

    int insertSelective(PredepositRecharge record);

    List<PredepositRecharge> selectByExampleWithRowbounds(PredepositRechargeExample example, RowBounds rowBounds);

    List<PredepositRecharge> selectByExample(PredepositRechargeExample example);

    PredepositRecharge selectByPrimaryKey(Integer rechargeId);

    int updateByExampleSelective(@Param("record") PredepositRecharge record, @Param("example") PredepositRechargeExample example);

    int updateByExample(@Param("record") PredepositRecharge record, @Param("example") PredepositRechargeExample example);

    int updateByPrimaryKeySelective(PredepositRecharge record);

    int updateByPrimaryKey(PredepositRecharge record);
}