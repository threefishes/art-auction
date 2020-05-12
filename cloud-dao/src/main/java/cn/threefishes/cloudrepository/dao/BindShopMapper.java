package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BindShop;
import cn.threefishes.cloudrepository.entity.BindShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BindShopMapper {
    long countByExample(BindShopExample example);

    int deleteByExample(BindShopExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(BindShop record);

    int insertSelective(BindShop record);

    List<BindShop> selectByExampleWithRowbounds(BindShopExample example, RowBounds rowBounds);

    List<BindShop> selectByExample(BindShopExample example);

    BindShop selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") BindShop record, @Param("example") BindShopExample example);

    int updateByExample(@Param("record") BindShop record, @Param("example") BindShopExample example);

    int updateByPrimaryKeySelective(BindShop record);

    int updateByPrimaryKey(BindShop record);
}