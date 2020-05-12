package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TurntableCollocation;
import cn.threefishes.cloudrepository.entity.TurntableCollocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TurntableCollocationMapper {
    long countByExample(TurntableCollocationExample example);

    int deleteByExample(TurntableCollocationExample example);

    int deleteByPrimaryKey(Integer collocationId);

    int insert(TurntableCollocation record);

    int insertSelective(TurntableCollocation record);

    List<TurntableCollocation> selectByExampleWithRowbounds(TurntableCollocationExample example, RowBounds rowBounds);

    List<TurntableCollocation> selectByExample(TurntableCollocationExample example);

    TurntableCollocation selectByPrimaryKey(Integer collocationId);

    int updateByExampleSelective(@Param("record") TurntableCollocation record, @Param("example") TurntableCollocationExample example);

    int updateByExample(@Param("record") TurntableCollocation record, @Param("example") TurntableCollocationExample example);

    int updateByPrimaryKeySelective(TurntableCollocation record);

    int updateByPrimaryKey(TurntableCollocation record);
}