package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Consult;
import cn.threefishes.cloudrepository.entity.ConsultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ConsultMapper {
    long countByExample(ConsultExample example);

    int deleteByExample(ConsultExample example);

    int deleteByPrimaryKey(Integer consultId);

    int insert(Consult record);

    int insertSelective(Consult record);

    List<Consult> selectByExampleWithRowbounds(ConsultExample example, RowBounds rowBounds);

    List<Consult> selectByExample(ConsultExample example);

    Consult selectByPrimaryKey(Integer consultId);

    int updateByExampleSelective(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByExample(@Param("record") Consult record, @Param("example") ConsultExample example);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}