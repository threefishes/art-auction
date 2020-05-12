package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundVirtual;
import cn.threefishes.cloudrepository.entity.RefundVirtualExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundVirtualMapper {
    long countByExample(RefundVirtualExample example);

    int deleteByExample(RefundVirtualExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(RefundVirtual record);

    int insertSelective(RefundVirtual record);

    List<RefundVirtual> selectByExampleWithRowbounds(RefundVirtualExample example, RowBounds rowBounds);

    List<RefundVirtual> selectByExample(RefundVirtualExample example);

    RefundVirtual selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") RefundVirtual record, @Param("example") RefundVirtualExample example);

    int updateByExample(@Param("record") RefundVirtual record, @Param("example") RefundVirtualExample example);

    int updateByPrimaryKeySelective(RefundVirtual record);

    int updateByPrimaryKey(RefundVirtual record);
}