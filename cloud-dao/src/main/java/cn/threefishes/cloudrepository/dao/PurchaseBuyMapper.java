package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PurchaseBuy;
import cn.threefishes.cloudrepository.entity.PurchaseBuyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PurchaseBuyMapper {
    long countByExample(PurchaseBuyExample example);

    int deleteByExample(PurchaseBuyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseBuy record);

    int insertSelective(PurchaseBuy record);

    List<PurchaseBuy> selectByExampleWithRowbounds(PurchaseBuyExample example, RowBounds rowBounds);

    List<PurchaseBuy> selectByExample(PurchaseBuyExample example);

    PurchaseBuy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseBuy record, @Param("example") PurchaseBuyExample example);

    int updateByExample(@Param("record") PurchaseBuy record, @Param("example") PurchaseBuyExample example);

    int updateByPrimaryKeySelective(PurchaseBuy record);

    int updateByPrimaryKey(PurchaseBuy record);
}