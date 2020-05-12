package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreGrade;
import cn.threefishes.cloudrepository.entity.StoreGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreGradeMapper {
    long countByExample(StoreGradeExample example);

    int deleteByExample(StoreGradeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreGrade record);

    int insertSelective(StoreGrade record);

    List<StoreGrade> selectByExampleWithRowbounds(StoreGradeExample example, RowBounds rowBounds);

    List<StoreGrade> selectByExample(StoreGradeExample example);

    StoreGrade selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreGrade record, @Param("example") StoreGradeExample example);

    int updateByExample(@Param("record") StoreGrade record, @Param("example") StoreGradeExample example);

    int updateByPrimaryKeySelective(StoreGrade record);

    int updateByPrimaryKey(StoreGrade record);
}