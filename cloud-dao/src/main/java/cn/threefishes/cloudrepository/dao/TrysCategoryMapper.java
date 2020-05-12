package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TrysCategory;
import cn.threefishes.cloudrepository.entity.TrysCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrysCategoryMapper {
    long countByExample(TrysCategoryExample example);

    int deleteByExample(TrysCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TrysCategory record);

    int insertSelective(TrysCategory record);

    List<TrysCategory> selectByExampleWithRowbounds(TrysCategoryExample example, RowBounds rowBounds);

    List<TrysCategory> selectByExample(TrysCategoryExample example);

    TrysCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TrysCategory record, @Param("example") TrysCategoryExample example);

    int updateByExample(@Param("record") TrysCategory record, @Param("example") TrysCategoryExample example);

    int updateByPrimaryKeySelective(TrysCategory record);

    int updateByPrimaryKey(TrysCategory record);
}