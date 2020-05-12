package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PurchaseChat;
import cn.threefishes.cloudrepository.entity.PurchaseChatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PurchaseChatMapper {
    long countByExample(PurchaseChatExample example);

    int deleteByExample(PurchaseChatExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseChat record);

    int insertSelective(PurchaseChat record);

    List<PurchaseChat> selectByExampleWithRowbounds(PurchaseChatExample example, RowBounds rowBounds);

    List<PurchaseChat> selectByExample(PurchaseChatExample example);

    PurchaseChat selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseChat record, @Param("example") PurchaseChatExample example);

    int updateByExample(@Param("record") PurchaseChat record, @Param("example") PurchaseChatExample example);

    int updateByPrimaryKeySelective(PurchaseChat record);

    int updateByPrimaryKey(PurchaseChat record);
}