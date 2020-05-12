package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Payment;
import cn.threefishes.cloudrepository.entity.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PaymentMapper {
    long countByExample(PaymentExample example);

    int deleteByExample(PaymentExample example);

    int deleteByPrimaryKey(Integer paymentId);

    int insert(Payment record);

    int insertSelective(Payment record);

    List<Payment> selectByExampleWithRowbounds(PaymentExample example, RowBounds rowBounds);

    List<Payment> selectByExample(PaymentExample example);

    Payment selectByPrimaryKey(Integer paymentId);

    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    int updateByPrimaryKeySelective(Payment record);

    int updateByPrimaryKey(Payment record);
}