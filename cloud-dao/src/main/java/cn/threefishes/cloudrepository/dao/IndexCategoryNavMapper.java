package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.IndexCategoryNav;
import cn.threefishes.cloudrepository.entity.IndexCategoryNavExample;
import cn.threefishes.cloudrepository.entity.IndexCategoryNavWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IndexCategoryNavMapper {
    long countByExample(IndexCategoryNavExample example);

    int deleteByExample(IndexCategoryNavExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(IndexCategoryNavWithBLOBs record);

    int insertSelective(IndexCategoryNavWithBLOBs record);

    List<IndexCategoryNavWithBLOBs> selectByExampleWithBLOBsWithRowbounds(IndexCategoryNavExample example, RowBounds rowBounds);

    List<IndexCategoryNavWithBLOBs> selectByExampleWithBLOBs(IndexCategoryNavExample example);

    List<IndexCategoryNav> selectByExampleWithRowbounds(IndexCategoryNavExample example, RowBounds rowBounds);

    List<IndexCategoryNav> selectByExample(IndexCategoryNavExample example);

    IndexCategoryNavWithBLOBs selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") IndexCategoryNavWithBLOBs record, @Param("example") IndexCategoryNavExample example);

    int updateByExampleWithBLOBs(@Param("record") IndexCategoryNavWithBLOBs record, @Param("example") IndexCategoryNavExample example);

    int updateByExample(@Param("record") IndexCategoryNav record, @Param("example") IndexCategoryNavExample example);

    int updateByPrimaryKeySelective(IndexCategoryNavWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(IndexCategoryNavWithBLOBs record);

    int updateByPrimaryKey(IndexCategoryNav record);
}