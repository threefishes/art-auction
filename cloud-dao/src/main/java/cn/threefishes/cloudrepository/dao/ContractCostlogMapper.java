package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ContractCostlog;
import cn.threefishes.cloudrepository.entity.ContractCostlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractCostlogMapper {
    long countByExample(ContractCostlogExample example);

    int deleteByExample(ContractCostlogExample example);

    int deleteByPrimaryKey(Integer clogId);

    int insert(ContractCostlog record);

    int insertSelective(ContractCostlog record);

    List<ContractCostlog> selectByExampleWithRowbounds(ContractCostlogExample example, RowBounds rowBounds);

    List<ContractCostlog> selectByExample(ContractCostlogExample example);

    ContractCostlog selectByPrimaryKey(Integer clogId);

    int updateByExampleSelective(@Param("record") ContractCostlog record, @Param("example") ContractCostlogExample example);

    int updateByExample(@Param("record") ContractCostlog record, @Param("example") ContractCostlogExample example);

    int updateByPrimaryKeySelective(ContractCostlog record);

    int updateByPrimaryKey(ContractCostlog record);
}