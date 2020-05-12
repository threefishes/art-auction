package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfDxhyInvoice;
import cn.threefishes.cloudrepository.entity.TfDxhyInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfDxhyInvoiceMapper {
    long countByExample(TfDxhyInvoiceExample example);

    int deleteByExample(TfDxhyInvoiceExample example);

    int deleteByPrimaryKey(String serialNumber);

    int insert(TfDxhyInvoice record);

    int insertSelective(TfDxhyInvoice record);

    List<TfDxhyInvoice> selectByExampleWithRowbounds(TfDxhyInvoiceExample example, RowBounds rowBounds);

    List<TfDxhyInvoice> selectByExample(TfDxhyInvoiceExample example);

    TfDxhyInvoice selectByPrimaryKey(String serialNumber);

    int updateByExampleSelective(@Param("record") TfDxhyInvoice record, @Param("example") TfDxhyInvoiceExample example);

    int updateByExample(@Param("record") TfDxhyInvoice record, @Param("example") TfDxhyInvoiceExample example);

    int updateByPrimaryKeySelective(TfDxhyInvoice record);

    int updateByPrimaryKey(TfDxhyInvoice record);
}