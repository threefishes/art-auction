package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Seller;
import cn.threefishes.cloudrepository.entity.SellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SellerMapper {
    long countByExample(SellerExample example);

    int deleteByExample(SellerExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(Seller record);

    int insertSelective(Seller record);

    List<Seller> selectByExampleWithRowbounds(SellerExample example, RowBounds rowBounds);

    List<Seller> selectByExample(SellerExample example);

    Seller selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByExample(@Param("record") Seller record, @Param("example") SellerExample example);

    int updateByPrimaryKeySelective(Seller record);

    int updateByPrimaryKey(Seller record);
}