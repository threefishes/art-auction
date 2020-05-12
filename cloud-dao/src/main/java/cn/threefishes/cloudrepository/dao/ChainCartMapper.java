package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainCart;
import cn.threefishes.cloudrepository.entity.ChainCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainCartMapper {
    long countByExample(ChainCartExample example);

    int deleteByExample(ChainCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(ChainCart record);

    int insertSelective(ChainCart record);

    List<ChainCart> selectByExampleWithRowbounds(ChainCartExample example, RowBounds rowBounds);

    List<ChainCart> selectByExample(ChainCartExample example);

    ChainCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") ChainCart record, @Param("example") ChainCartExample example);

    int updateByExample(@Param("record") ChainCart record, @Param("example") ChainCartExample example);

    int updateByPrimaryKeySelective(ChainCart record);

    int updateByPrimaryKey(ChainCart record);
}