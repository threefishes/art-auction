package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreCost;
import cn.threefishes.cloudrepository.entity.StoreCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreCostMapper {
    long countByExample(StoreCostExample example);

    int deleteByExample(StoreCostExample example);

    int deleteByPrimaryKey(Integer costId);

    int insert(StoreCost record);

    int insertSelective(StoreCost record);

    List<StoreCost> selectByExampleWithRowbounds(StoreCostExample example, RowBounds rowBounds);

    List<StoreCost> selectByExample(StoreCostExample example);

    StoreCost selectByPrimaryKey(Integer costId);

    int updateByExampleSelective(@Param("record") StoreCost record, @Param("example") StoreCostExample example);

    int updateByExample(@Param("record") StoreCost record, @Param("example") StoreCostExample example);

    int updateByPrimaryKeySelective(StoreCost record);

    int updateByPrimaryKey(StoreCost record);
}