package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ContractLog;
import cn.threefishes.cloudrepository.entity.ContractLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractLogMapper {
    long countByExample(ContractLogExample example);

    int deleteByExample(ContractLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(ContractLog record);

    int insertSelective(ContractLog record);

    List<ContractLog> selectByExampleWithRowbounds(ContractLogExample example, RowBounds rowBounds);

    List<ContractLog> selectByExample(ContractLogExample example);

    ContractLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") ContractLog record, @Param("example") ContractLogExample example);

    int updateByExample(@Param("record") ContractLog record, @Param("example") ContractLogExample example);

    int updateByPrimaryKeySelective(ContractLog record);

    int updateByPrimaryKey(ContractLog record);
}