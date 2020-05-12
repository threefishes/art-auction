package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainMenu;
import cn.threefishes.cloudrepository.entity.ChainMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainMenuMapper {
    long countByExample(ChainMenuExample example);

    int deleteByExample(ChainMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChainMenu record);

    int insertSelective(ChainMenu record);

    List<ChainMenu> selectByExampleWithRowbounds(ChainMenuExample example, RowBounds rowBounds);

    List<ChainMenu> selectByExample(ChainMenuExample example);

    ChainMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChainMenu record, @Param("example") ChainMenuExample example);

    int updateByExample(@Param("record") ChainMenu record, @Param("example") ChainMenuExample example);

    int updateByPrimaryKeySelective(ChainMenu record);

    int updateByPrimaryKey(ChainMenu record);
}