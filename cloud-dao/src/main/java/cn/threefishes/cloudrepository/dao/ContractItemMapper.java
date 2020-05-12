package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ContractItem;
import cn.threefishes.cloudrepository.entity.ContractItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ContractItemMapper {
    long countByExample(ContractItemExample example);

    int deleteByExample(ContractItemExample example);

    int deleteByPrimaryKey(Integer ctiId);

    int insert(ContractItem record);

    int insertSelective(ContractItem record);

    List<ContractItem> selectByExampleWithRowbounds(ContractItemExample example, RowBounds rowBounds);

    List<ContractItem> selectByExample(ContractItemExample example);

    ContractItem selectByPrimaryKey(Integer ctiId);

    int updateByExampleSelective(@Param("record") ContractItem record, @Param("example") ContractItemExample example);

    int updateByExample(@Param("record") ContractItem record, @Param("example") ContractItemExample example);

    int updateByPrimaryKeySelective(ContractItem record);

    int updateByPrimaryKey(ContractItem record);
}