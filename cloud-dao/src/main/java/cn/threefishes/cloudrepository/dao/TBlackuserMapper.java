package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TBlackuser;
import cn.threefishes.cloudrepository.entity.TBlackuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TBlackuserMapper {
    long countByExample(TBlackuserExample example);

    int deleteByExample(TBlackuserExample example);

    int deleteByPrimaryKey(Integer userautoid);

    int insert(TBlackuser record);

    int insertSelective(TBlackuser record);

    List<TBlackuser> selectByExampleWithRowbounds(TBlackuserExample example, RowBounds rowBounds);

    List<TBlackuser> selectByExample(TBlackuserExample example);

    TBlackuser selectByPrimaryKey(Integer userautoid);

    int updateByExampleSelective(@Param("record") TBlackuser record, @Param("example") TBlackuserExample example);

    int updateByExample(@Param("record") TBlackuser record, @Param("example") TBlackuserExample example);

    int updateByPrimaryKeySelective(TBlackuser record);

    int updateByPrimaryKey(TBlackuser record);
}