package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainClass;
import cn.threefishes.cloudrepository.entity.ChainClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainClassMapper {
    long countByExample(ChainClassExample example);

    int deleteByExample(ChainClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ChainClass record);

    int insertSelective(ChainClass record);

    List<ChainClass> selectByExampleWithRowbounds(ChainClassExample example, RowBounds rowBounds);

    List<ChainClass> selectByExample(ChainClassExample example);

    ChainClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ChainClass record, @Param("example") ChainClassExample example);

    int updateByExample(@Param("record") ChainClass record, @Param("example") ChainClassExample example);

    int updateByPrimaryKeySelective(ChainClass record);

    int updateByPrimaryKey(ChainClass record);
}