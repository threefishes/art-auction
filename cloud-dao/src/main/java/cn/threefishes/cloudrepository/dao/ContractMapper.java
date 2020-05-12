package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Contract;
import cn.threefishes.cloudrepository.entity.ContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractMapper {
    long countByExample(ContractExample example);

    int deleteByExample(ContractExample example);

    int deleteByPrimaryKey(Integer ctId);

    int insert(Contract record);

    int insertSelective(Contract record);

    List<Contract> selectByExampleWithRowbounds(ContractExample example, RowBounds rowBounds);

    List<Contract> selectByExample(ContractExample example);

    Contract selectByPrimaryKey(Integer ctId);

    int updateByExampleSelective(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByExample(@Param("record") Contract record, @Param("example") ContractExample example);

    int updateByPrimaryKeySelective(Contract record);

    int updateByPrimaryKey(Contract record);
}