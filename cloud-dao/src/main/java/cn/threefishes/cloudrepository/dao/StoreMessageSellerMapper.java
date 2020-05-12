package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMessageSeller;
import cn.threefishes.cloudrepository.entity.StoreMessageSellerExample;
import cn.threefishes.cloudrepository.entity.StoreMessageSellerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMessageSellerMapper {
    long countByExample(StoreMessageSellerExample example);

    int deleteByExample(StoreMessageSellerExample example);

    int deleteByPrimaryKey(StoreMessageSellerKey key);

    int insert(StoreMessageSeller record);

    int insertSelective(StoreMessageSeller record);

    List<StoreMessageSeller> selectByExampleWithRowbounds(StoreMessageSellerExample example, RowBounds rowBounds);

    List<StoreMessageSeller> selectByExample(StoreMessageSellerExample example);

    StoreMessageSeller selectByPrimaryKey(StoreMessageSellerKey key);

    int updateByExampleSelective(@Param("record") StoreMessageSeller record, @Param("example") StoreMessageSellerExample example);

    int updateByExample(@Param("record") StoreMessageSeller record, @Param("example") StoreMessageSellerExample example);

    int updateByPrimaryKeySelective(StoreMessageSeller record);

    int updateByPrimaryKey(StoreMessageSeller record);
}