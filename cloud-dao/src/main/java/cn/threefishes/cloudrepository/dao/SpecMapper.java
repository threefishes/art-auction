package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Spec;
import cn.threefishes.cloudrepository.entity.SpecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SpecMapper {
    long countByExample(SpecExample example);

    int deleteByExample(SpecExample example);

    int deleteByPrimaryKey(Integer specId);

    int insert(Spec record);

    int insertSelective(Spec record);

    List<Spec> selectByExampleWithRowbounds(SpecExample example, RowBounds rowBounds);

    List<Spec> selectByExample(SpecExample example);

    Spec selectByPrimaryKey(Integer specId);

    int updateByExampleSelective(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByExample(@Param("record") Spec record, @Param("example") SpecExample example);

    int updateByPrimaryKeySelective(Spec record);

    int updateByPrimaryKey(Spec record);
}