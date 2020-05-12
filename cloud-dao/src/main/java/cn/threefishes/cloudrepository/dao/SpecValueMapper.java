package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SpecValue;
import cn.threefishes.cloudrepository.entity.SpecValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecValueMapper {
    long countByExample(SpecValueExample example);

    int deleteByExample(SpecValueExample example);

    int deleteByPrimaryKey(Integer specValueId);

    int insert(SpecValue record);

    int insertSelective(SpecValue record);

    List<SpecValue> selectByExampleWithRowbounds(SpecValueExample example, RowBounds rowBounds);

    List<SpecValue> selectByExample(SpecValueExample example);

    SpecValue selectByPrimaryKey(Integer specValueId);

    int updateByExampleSelective(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByExample(@Param("record") SpecValue record, @Param("example") SpecValueExample example);

    int updateByPrimaryKeySelective(SpecValue record);

    int updateByPrimaryKey(SpecValue record);
}