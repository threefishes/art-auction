package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WagesBill;
import cn.threefishes.cloudrepository.entity.WagesBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WagesBillMapper {
    long countByExample(WagesBillExample example);

    int deleteByExample(WagesBillExample example);

    int deleteByPrimaryKey(Integer wagesBillId);

    int insert(WagesBill record);

    int insertSelective(WagesBill record);

    List<WagesBill> selectByExampleWithRowbounds(WagesBillExample example, RowBounds rowBounds);

    List<WagesBill> selectByExample(WagesBillExample example);

    WagesBill selectByPrimaryKey(Integer wagesBillId);

    int updateByExampleSelective(@Param("record") WagesBill record, @Param("example") WagesBillExample example);

    int updateByExample(@Param("record") WagesBill record, @Param("example") WagesBillExample example);

    int updateByPrimaryKeySelective(WagesBill record);

    int updateByPrimaryKey(WagesBill record);
}