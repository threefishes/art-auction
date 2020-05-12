package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.PurchaseQuotedprice;
import cn.threefishes.cloudrepository.entity.PurchaseQuotedpriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PurchaseQuotedpriceMapper {
    long countByExample(PurchaseQuotedpriceExample example);

    int deleteByExample(PurchaseQuotedpriceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PurchaseQuotedprice record);

    int insertSelective(PurchaseQuotedprice record);

    List<PurchaseQuotedprice> selectByExampleWithRowbounds(PurchaseQuotedpriceExample example, RowBounds rowBounds);

    List<PurchaseQuotedprice> selectByExample(PurchaseQuotedpriceExample example);

    PurchaseQuotedprice selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PurchaseQuotedprice record, @Param("example") PurchaseQuotedpriceExample example);

    int updateByExample(@Param("record") PurchaseQuotedprice record, @Param("example") PurchaseQuotedpriceExample example);

    int updateByPrimaryKeySelective(PurchaseQuotedprice record);

    int updateByPrimaryKey(PurchaseQuotedprice record);
}