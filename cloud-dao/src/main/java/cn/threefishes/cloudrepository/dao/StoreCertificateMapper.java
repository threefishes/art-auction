package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreCertificate;
import cn.threefishes.cloudrepository.entity.StoreCertificateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreCertificateMapper {
    long countByExample(StoreCertificateExample example);

    int deleteByExample(StoreCertificateExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(StoreCertificate record);

    int insertSelective(StoreCertificate record);

    List<StoreCertificate> selectByExampleWithBLOBsWithRowbounds(StoreCertificateExample example, RowBounds rowBounds);

    List<StoreCertificate> selectByExampleWithBLOBs(StoreCertificateExample example);

    List<StoreCertificate> selectByExampleWithRowbounds(StoreCertificateExample example, RowBounds rowBounds);

    List<StoreCertificate> selectByExample(StoreCertificateExample example);

    StoreCertificate selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") StoreCertificate record, @Param("example") StoreCertificateExample example);

    int updateByExampleWithBLOBs(@Param("record") StoreCertificate record, @Param("example") StoreCertificateExample example);

    int updateByExample(@Param("record") StoreCertificate record, @Param("example") StoreCertificateExample example);

    int updateByPrimaryKeySelective(StoreCertificate record);

    int updateByPrimaryKeyWithBLOBs(StoreCertificate record);

    int updateByPrimaryKey(StoreCertificate record);
}