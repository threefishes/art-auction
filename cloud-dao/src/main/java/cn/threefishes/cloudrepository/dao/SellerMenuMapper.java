package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SellerMenu;
import cn.threefishes.cloudrepository.entity.SellerMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SellerMenuMapper {
    long countByExample(SellerMenuExample example);

    int deleteByExample(SellerMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellerMenu record);

    int insertSelective(SellerMenu record);

    List<SellerMenu> selectByExampleWithRowbounds(SellerMenuExample example, RowBounds rowBounds);

    List<SellerMenu> selectByExample(SellerMenuExample example);

    SellerMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellerMenu record, @Param("example") SellerMenuExample example);

    int updateByExample(@Param("record") SellerMenu record, @Param("example") SellerMenuExample example);

    int updateByPrimaryKeySelective(SellerMenu record);

    int updateByPrimaryKey(SellerMenu record);
}