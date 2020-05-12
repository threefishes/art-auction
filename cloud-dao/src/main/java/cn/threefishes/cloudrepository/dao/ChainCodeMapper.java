package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainCode;
import cn.threefishes.cloudrepository.entity.ChainCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainCodeMapper {
    long countByExample(ChainCodeExample example);

    int deleteByExample(ChainCodeExample example);

    int deleteByPrimaryKey(Integer chainCodeId);

    int insert(ChainCode record);

    int insertSelective(ChainCode record);

    List<ChainCode> selectByExampleWithRowbounds(ChainCodeExample example, RowBounds rowBounds);

    List<ChainCode> selectByExample(ChainCodeExample example);

    ChainCode selectByPrimaryKey(Integer chainCodeId);

    int updateByExampleSelective(@Param("record") ChainCode record, @Param("example") ChainCodeExample example);

    int updateByExample(@Param("record") ChainCode record, @Param("example") ChainCodeExample example);

    int updateByPrimaryKeySelective(ChainCode record);

    int updateByPrimaryKey(ChainCode record);
}