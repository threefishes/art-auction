package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfDxhyInvoiceLog;
import cn.threefishes.cloudrepository.entity.TfDxhyInvoiceLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfDxhyInvoiceLogMapper {
    long countByExample(TfDxhyInvoiceLogExample example);

    int deleteByExample(TfDxhyInvoiceLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TfDxhyInvoiceLog record);

    int insertSelective(TfDxhyInvoiceLog record);

    List<TfDxhyInvoiceLog> selectByExampleWithRowbounds(TfDxhyInvoiceLogExample example, RowBounds rowBounds);

    List<TfDxhyInvoiceLog> selectByExample(TfDxhyInvoiceLogExample example);

    TfDxhyInvoiceLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TfDxhyInvoiceLog record, @Param("example") TfDxhyInvoiceLogExample example);

    int updateByExample(@Param("record") TfDxhyInvoiceLog record, @Param("example") TfDxhyInvoiceLogExample example);

    int updateByPrimaryKeySelective(TfDxhyInvoiceLog record);

    int updateByPrimaryKey(TfDxhyInvoiceLog record);
}