package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreCertificateInvoice;
import cn.threefishes.cloudrepository.entity.StoreCertificateInvoiceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreCertificateInvoiceMapper {
    long countByExample(StoreCertificateInvoiceExample example);

    int deleteByExample(StoreCertificateInvoiceExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(StoreCertificateInvoice record);

    int insertSelective(StoreCertificateInvoice record);

    List<StoreCertificateInvoice> selectByExampleWithRowbounds(StoreCertificateInvoiceExample example, RowBounds rowBounds);

    List<StoreCertificateInvoice> selectByExample(StoreCertificateInvoiceExample example);

    StoreCertificateInvoice selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") StoreCertificateInvoice record, @Param("example") StoreCertificateInvoiceExample example);

    int updateByExample(@Param("record") StoreCertificateInvoice record, @Param("example") StoreCertificateInvoiceExample example);

    int updateByPrimaryKeySelective(StoreCertificateInvoice record);

    int updateByPrimaryKey(StoreCertificateInvoice record);
}