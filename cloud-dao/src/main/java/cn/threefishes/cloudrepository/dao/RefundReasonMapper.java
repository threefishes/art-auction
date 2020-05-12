package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundReason;
import cn.threefishes.cloudrepository.entity.RefundReasonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundReasonMapper {
    long countByExample(RefundReasonExample example);

    int deleteByExample(RefundReasonExample example);

    int deleteByPrimaryKey(Integer reasonId);

    int insert(RefundReason record);

    int insertSelective(RefundReason record);

    List<RefundReason> selectByExampleWithRowbounds(RefundReasonExample example, RowBounds rowBounds);

    List<RefundReason> selectByExample(RefundReasonExample example);

    RefundReason selectByPrimaryKey(Integer reasonId);

    int updateByExampleSelective(@Param("record") RefundReason record, @Param("example") RefundReasonExample example);

    int updateByExample(@Param("record") RefundReason record, @Param("example") RefundReasonExample example);

    int updateByPrimaryKeySelective(RefundReason record);

    int updateByPrimaryKey(RefundReason record);
}