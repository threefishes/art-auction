package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RechargeLog;
import cn.threefishes.cloudrepository.entity.RechargeLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RechargeLogMapper {
    long countByExample(RechargeLogExample example);

    int deleteByExample(RechargeLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(RechargeLog record);

    int insertSelective(RechargeLog record);

    List<RechargeLog> selectByExampleWithRowbounds(RechargeLogExample example, RowBounds rowBounds);

    List<RechargeLog> selectByExample(RechargeLogExample example);

    RechargeLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") RechargeLog record, @Param("example") RechargeLogExample example);

    int updateByExample(@Param("record") RechargeLog record, @Param("example") RechargeLogExample example);

    int updateByPrimaryKeySelective(RechargeLog record);

    int updateByPrimaryKey(RechargeLog record);
}