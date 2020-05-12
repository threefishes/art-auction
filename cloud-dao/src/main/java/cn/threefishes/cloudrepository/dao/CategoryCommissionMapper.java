package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CategoryCommission;
import cn.threefishes.cloudrepository.entity.CategoryCommissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CategoryCommissionMapper {
    long countByExample(CategoryCommissionExample example);

    int deleteByExample(CategoryCommissionExample example);

    int deleteByPrimaryKey(Integer commissionId);

    int insert(CategoryCommission record);

    int insertSelective(CategoryCommission record);

    List<CategoryCommission> selectByExampleWithRowbounds(CategoryCommissionExample example, RowBounds rowBounds);

    List<CategoryCommission> selectByExample(CategoryCommissionExample example);

    CategoryCommission selectByPrimaryKey(Integer commissionId);

    int updateByExampleSelective(@Param("record") CategoryCommission record, @Param("example") CategoryCommissionExample example);

    int updateByExample(@Param("record") CategoryCommission record, @Param("example") CategoryCommissionExample example);

    int updateByPrimaryKeySelective(CategoryCommission record);

    int updateByPrimaryKey(CategoryCommission record);
}