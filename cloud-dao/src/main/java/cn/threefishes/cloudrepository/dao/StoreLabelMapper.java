package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreLabel;
import cn.threefishes.cloudrepository.entity.StoreLabelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreLabelMapper {
    long countByExample(StoreLabelExample example);

    int deleteByExample(StoreLabelExample example);

    int deleteByPrimaryKey(Integer storeLabelId);

    int insert(StoreLabel record);

    int insertSelective(StoreLabel record);

    List<StoreLabel> selectByExampleWithRowbounds(StoreLabelExample example, RowBounds rowBounds);

    List<StoreLabel> selectByExample(StoreLabelExample example);

    StoreLabel selectByPrimaryKey(Integer storeLabelId);

    int updateByExampleSelective(@Param("record") StoreLabel record, @Param("example") StoreLabelExample example);

    int updateByExample(@Param("record") StoreLabel record, @Param("example") StoreLabelExample example);

    int updateByPrimaryKeySelective(StoreLabel record);

    int updateByPrimaryKey(StoreLabel record);
}