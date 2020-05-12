package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Conform;
import cn.threefishes.cloudrepository.entity.ConformExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ConformMapper {
    long countByExample(ConformExample example);

    int deleteByExample(ConformExample example);

    int deleteByPrimaryKey(Integer conformId);

    int insert(Conform record);

    int insertSelective(Conform record);

    List<Conform> selectByExampleWithRowbounds(ConformExample example, RowBounds rowBounds);

    List<Conform> selectByExample(ConformExample example);

    Conform selectByPrimaryKey(Integer conformId);

    int updateByExampleSelective(@Param("record") Conform record, @Param("example") ConformExample example);

    int updateByExample(@Param("record") Conform record, @Param("example") ConformExample example);

    int updateByPrimaryKeySelective(Conform record);

    int updateByPrimaryKey(Conform record);
}