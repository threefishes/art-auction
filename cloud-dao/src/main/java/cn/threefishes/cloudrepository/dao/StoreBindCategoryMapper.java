package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreBindCategory;
import cn.threefishes.cloudrepository.entity.StoreBindCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreBindCategoryMapper {
    long countByExample(StoreBindCategoryExample example);

    int deleteByExample(StoreBindCategoryExample example);

    int deleteByPrimaryKey(Integer bindId);

    int insert(StoreBindCategory record);

    int insertSelective(StoreBindCategory record);

    List<StoreBindCategory> selectByExampleWithRowbounds(StoreBindCategoryExample example, RowBounds rowBounds);

    List<StoreBindCategory> selectByExample(StoreBindCategoryExample example);

    StoreBindCategory selectByPrimaryKey(Integer bindId);

    int updateByExampleSelective(@Param("record") StoreBindCategory record, @Param("example") StoreBindCategoryExample example);

    int updateByExample(@Param("record") StoreBindCategory record, @Param("example") StoreBindCategoryExample example);

    int updateByPrimaryKeySelective(StoreBindCategory record);

    int updateByPrimaryKey(StoreBindCategory record);
}