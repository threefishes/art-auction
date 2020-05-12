package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Special;
import cn.threefishes.cloudrepository.entity.SpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecialMapper {
    long countByExample(SpecialExample example);

    int deleteByExample(SpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(Special record);

    int insertSelective(Special record);

    List<Special> selectByExampleWithRowbounds(SpecialExample example, RowBounds rowBounds);

    List<Special> selectByExample(SpecialExample example);

    Special selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByExample(@Param("record") Special record, @Param("example") SpecialExample example);

    int updateByPrimaryKeySelective(Special record);

    int updateByPrimaryKey(Special record);
}