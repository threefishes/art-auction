package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberInvoiceEmail;
import cn.threefishes.cloudrepository.entity.MemberInvoiceEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberInvoiceEmailMapper {
    long countByExample(MemberInvoiceEmailExample example);

    int deleteByExample(MemberInvoiceEmailExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberInvoiceEmail record);

    int insertSelective(MemberInvoiceEmail record);

    List<MemberInvoiceEmail> selectByExampleWithRowbounds(MemberInvoiceEmailExample example, RowBounds rowBounds);

    List<MemberInvoiceEmail> selectByExample(MemberInvoiceEmailExample example);

    MemberInvoiceEmail selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MemberInvoiceEmail record, @Param("example") MemberInvoiceEmailExample example);

    int updateByExample(@Param("record") MemberInvoiceEmail record, @Param("example") MemberInvoiceEmailExample example);

    int updateByPrimaryKeySelective(MemberInvoiceEmail record);

    int updateByPrimaryKey(MemberInvoiceEmail record);
}