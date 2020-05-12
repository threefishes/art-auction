package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Store;
import cn.threefishes.cloudrepository.entity.StoreExample;
import cn.threefishes.cloudrepository.entity.StoreWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMapper {
    long countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreWithBLOBs record);

    int insertSelective(StoreWithBLOBs record);

    List<StoreWithBLOBs> selectByExampleWithBLOBsWithRowbounds(StoreExample example, RowBounds rowBounds);

    List<StoreWithBLOBs> selectByExampleWithBLOBs(StoreExample example);

    List<Store> selectByExampleWithRowbounds(StoreExample example, RowBounds rowBounds);

    List<Store> selectByExample(StoreExample example);

    StoreWithBLOBs selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") StoreWithBLOBs record, @Param("example") StoreExample example);

    int updateByExampleWithBLOBs(@Param("record") StoreWithBLOBs record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(StoreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(StoreWithBLOBs record);

    int updateByPrimaryKey(Store record);
}