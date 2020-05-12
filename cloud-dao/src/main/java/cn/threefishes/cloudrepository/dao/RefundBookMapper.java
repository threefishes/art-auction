package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RefundBook;
import cn.threefishes.cloudrepository.entity.RefundBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RefundBookMapper {
    long countByExample(RefundBookExample example);

    int deleteByExample(RefundBookExample example);

    int deleteByPrimaryKey(Integer refundBookId);

    int insert(RefundBook record);

    int insertSelective(RefundBook record);

    List<RefundBook> selectByExampleWithRowbounds(RefundBookExample example, RowBounds rowBounds);

    List<RefundBook> selectByExample(RefundBookExample example);

    RefundBook selectByPrimaryKey(Integer refundBookId);

    int updateByExampleSelective(@Param("record") RefundBook record, @Param("example") RefundBookExample example);

    int updateByExample(@Param("record") RefundBook record, @Param("example") RefundBookExample example);

    int updateByPrimaryKeySelective(RefundBook record);

    int updateByPrimaryKey(RefundBook record);
}