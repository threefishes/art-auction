package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SellerGroupMenu;
import cn.threefishes.cloudrepository.entity.SellerGroupMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SellerGroupMenuMapper {
    long countByExample(SellerGroupMenuExample example);

    int deleteByExample(SellerGroupMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SellerGroupMenu record);

    int insertSelective(SellerGroupMenu record);

    List<SellerGroupMenu> selectByExampleWithRowbounds(SellerGroupMenuExample example, RowBounds rowBounds);

    List<SellerGroupMenu> selectByExample(SellerGroupMenuExample example);

    SellerGroupMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SellerGroupMenu record, @Param("example") SellerGroupMenuExample example);

    int updateByExample(@Param("record") SellerGroupMenu record, @Param("example") SellerGroupMenuExample example);

    int updateByPrimaryKeySelective(SellerGroupMenu record);

    int updateByPrimaryKey(SellerGroupMenu record);
}