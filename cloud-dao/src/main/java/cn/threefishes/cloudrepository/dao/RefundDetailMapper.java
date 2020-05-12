package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundDetail;
import cn.threefishes.cloudrepository.entity.RefundDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundDetailMapper {
    long countByExample(RefundDetailExample example);

    int deleteByExample(RefundDetailExample example);

    int deleteByPrimaryKey(Integer refundId);

    int insert(RefundDetail record);

    int insertSelective(RefundDetail record);

    List<RefundDetail> selectByExampleWithRowbounds(RefundDetailExample example, RowBounds rowBounds);

    List<RefundDetail> selectByExample(RefundDetailExample example);

    RefundDetail selectByPrimaryKey(Integer refundId);

    int updateByExampleSelective(@Param("record") RefundDetail record, @Param("example") RefundDetailExample example);

    int updateByExample(@Param("record") RefundDetail record, @Param("example") RefundDetailExample example);

    int updateByPrimaryKeySelective(RefundDetail record);

    int updateByPrimaryKey(RefundDetail record);
}