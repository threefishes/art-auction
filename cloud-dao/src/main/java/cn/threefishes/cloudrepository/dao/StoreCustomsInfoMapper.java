package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreCustomsInfo;
import cn.threefishes.cloudrepository.entity.StoreCustomsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreCustomsInfoMapper {
    long countByExample(StoreCustomsInfoExample example);

    int deleteByExample(StoreCustomsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreCustomsInfo record);

    int insertSelective(StoreCustomsInfo record);

    List<StoreCustomsInfo> selectByExampleWithRowbounds(StoreCustomsInfoExample example, RowBounds rowBounds);

    List<StoreCustomsInfo> selectByExample(StoreCustomsInfoExample example);

    StoreCustomsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreCustomsInfo record, @Param("example") StoreCustomsInfoExample example);

    int updateByExample(@Param("record") StoreCustomsInfo record, @Param("example") StoreCustomsInfoExample example);

    int updateByPrimaryKeySelective(StoreCustomsInfo record);

    int updateByPrimaryKey(StoreCustomsInfo record);
}