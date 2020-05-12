package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ContractQuitapply;
import cn.threefishes.cloudrepository.entity.ContractQuitapplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractQuitapplyMapper {
    long countByExample(ContractQuitapplyExample example);

    int deleteByExample(ContractQuitapplyExample example);

    int deleteByPrimaryKey(Integer ctqId);

    int insert(ContractQuitapply record);

    int insertSelective(ContractQuitapply record);

    List<ContractQuitapply> selectByExampleWithRowbounds(ContractQuitapplyExample example, RowBounds rowBounds);

    List<ContractQuitapply> selectByExample(ContractQuitapplyExample example);

    ContractQuitapply selectByPrimaryKey(Integer ctqId);

    int updateByExampleSelective(@Param("record") ContractQuitapply record, @Param("example") ContractQuitapplyExample example);

    int updateByExample(@Param("record") ContractQuitapply record, @Param("example") ContractQuitapplyExample example);

    int updateByPrimaryKeySelective(ContractQuitapply record);

    int updateByPrimaryKey(ContractQuitapply record);
}