package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ContractApply;
import cn.threefishes.cloudrepository.entity.ContractApplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractApplyMapper {
    long countByExample(ContractApplyExample example);

    int deleteByExample(ContractApplyExample example);

    int deleteByPrimaryKey(Integer ctaId);

    int insert(ContractApply record);

    int insertSelective(ContractApply record);

    List<ContractApply> selectByExampleWithRowbounds(ContractApplyExample example, RowBounds rowBounds);

    List<ContractApply> selectByExample(ContractApplyExample example);

    ContractApply selectByPrimaryKey(Integer ctaId);

    int updateByExampleSelective(@Param("record") ContractApply record, @Param("example") ContractApplyExample example);

    int updateByExample(@Param("record") ContractApply record, @Param("example") ContractApplyExample example);

    int updateByPrimaryKeySelective(ContractApply record);

    int updateByPrimaryKey(ContractApply record);
}