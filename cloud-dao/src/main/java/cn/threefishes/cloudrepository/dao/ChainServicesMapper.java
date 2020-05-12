package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ChainServices;
import cn.threefishes.cloudrepository.entity.ChainServicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ChainServicesMapper {
    long countByExample(ChainServicesExample example);

    int deleteByExample(ChainServicesExample example);

    int deleteByPrimaryKey(Integer servicesId);

    int insert(ChainServices record);

    int insertSelective(ChainServices record);

    List<ChainServices> selectByExampleWithRowbounds(ChainServicesExample example, RowBounds rowBounds);

    List<ChainServices> selectByExample(ChainServicesExample example);

    ChainServices selectByPrimaryKey(Integer servicesId);

    int updateByExampleSelective(@Param("record") ChainServices record, @Param("example") ChainServicesExample example);

    int updateByExample(@Param("record") ChainServices record, @Param("example") ChainServicesExample example);

    int updateByPrimaryKeySelective(ChainServices record);

    int updateByPrimaryKey(ChainServices record);
}