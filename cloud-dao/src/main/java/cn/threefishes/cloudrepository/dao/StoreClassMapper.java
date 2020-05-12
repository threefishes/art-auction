package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreClass;
import cn.threefishes.cloudrepository.entity.StoreClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreClassMapper {
    long countByExample(StoreClassExample example);

    int deleteByExample(StoreClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreClass record);

    int insertSelective(StoreClass record);

    List<StoreClass> selectByExampleWithRowbounds(StoreClassExample example, RowBounds rowBounds);

    List<StoreClass> selectByExample(StoreClassExample example);

    StoreClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreClass record, @Param("example") StoreClassExample example);

    int updateByExample(@Param("record") StoreClass record, @Param("example") StoreClassExample example);

    int updateByPrimaryKeySelective(StoreClass record);

    int updateByPrimaryKey(StoreClass record);
}