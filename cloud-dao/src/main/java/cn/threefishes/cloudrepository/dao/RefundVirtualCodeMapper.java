package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundVirtualCode;
import cn.threefishes.cloudrepository.entity.RefundVirtualCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundVirtualCodeMapper {
    long countByExample(RefundVirtualCodeExample example);

    int deleteByExample(RefundVirtualCodeExample example);

    int deleteByPrimaryKey(Integer refundCodeId);

    int insert(RefundVirtualCode record);

    int insertSelective(RefundVirtualCode record);

    List<RefundVirtualCode> selectByExampleWithRowbounds(RefundVirtualCodeExample example, RowBounds rowBounds);

    List<RefundVirtualCode> selectByExample(RefundVirtualCodeExample example);

    RefundVirtualCode selectByPrimaryKey(Integer refundCodeId);

    int updateByExampleSelective(@Param("record") RefundVirtualCode record, @Param("example") RefundVirtualCodeExample example);

    int updateByExample(@Param("record") RefundVirtualCode record, @Param("example") RefundVirtualCodeExample example);

    int updateByPrimaryKeySelective(RefundVirtualCode record);

    int updateByPrimaryKey(RefundVirtualCode record);
}