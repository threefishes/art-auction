package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Chain;
import cn.threefishes.cloudrepository.entity.ChainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainMapper {
    long countByExample(ChainExample example);

    int deleteByExample(ChainExample example);

    int deleteByPrimaryKey(Integer chainId);

    int insert(Chain record);

    int insertSelective(Chain record);

    List<Chain> selectByExampleWithRowbounds(ChainExample example, RowBounds rowBounds);

    List<Chain> selectByExample(ChainExample example);

    Chain selectByPrimaryKey(Integer chainId);

    int updateByExampleSelective(@Param("record") Chain record, @Param("example") ChainExample example);

    int updateByExample(@Param("record") Chain record, @Param("example") ChainExample example);

    int updateByPrimaryKeySelective(Chain record);

    int updateByPrimaryKey(Chain record);
}