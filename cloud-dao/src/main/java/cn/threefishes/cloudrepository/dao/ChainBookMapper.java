package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainBook;
import cn.threefishes.cloudrepository.entity.ChainBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainBookMapper {
    long countByExample(ChainBookExample example);

    int deleteByExample(ChainBookExample example);

    int deleteByPrimaryKey(Integer chainBookId);

    int insert(ChainBook record);

    int insertSelective(ChainBook record);

    List<ChainBook> selectByExampleWithRowbounds(ChainBookExample example, RowBounds rowBounds);

    List<ChainBook> selectByExample(ChainBookExample example);

    ChainBook selectByPrimaryKey(Integer chainBookId);

    int updateByExampleSelective(@Param("record") ChainBook record, @Param("example") ChainBookExample example);

    int updateByExample(@Param("record") ChainBook record, @Param("example") ChainBookExample example);

    int updateByPrimaryKeySelective(ChainBook record);

    int updateByPrimaryKey(ChainBook record);
}