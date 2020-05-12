package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Turntable;
import cn.threefishes.cloudrepository.entity.TurntableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TurntableMapper {
    long countByExample(TurntableExample example);

    int deleteByExample(TurntableExample example);

    int deleteByPrimaryKey(Integer turntableId);

    int insert(Turntable record);

    int insertSelective(Turntable record);

    List<Turntable> selectByExampleWithRowbounds(TurntableExample example, RowBounds rowBounds);

    List<Turntable> selectByExample(TurntableExample example);

    Turntable selectByPrimaryKey(Integer turntableId);

    int updateByExampleSelective(@Param("record") Turntable record, @Param("example") TurntableExample example);

    int updateByExample(@Param("record") Turntable record, @Param("example") TurntableExample example);

    int updateByPrimaryKeySelective(Turntable record);

    int updateByPrimaryKey(Turntable record);
}