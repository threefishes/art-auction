package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ProgramUser;
import cn.threefishes.cloudrepository.entity.ProgramUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProgramUserMapper {
    long countByExample(ProgramUserExample example);

    int deleteByExample(ProgramUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(ProgramUser record);

    int insertSelective(ProgramUser record);

    List<ProgramUser> selectByExampleWithRowbounds(ProgramUserExample example, RowBounds rowBounds);

    List<ProgramUser> selectByExample(ProgramUserExample example);

    ProgramUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") ProgramUser record, @Param("example") ProgramUserExample example);

    int updateByExample(@Param("record") ProgramUser record, @Param("example") ProgramUserExample example);

    int updateByPrimaryKeySelective(ProgramUser record);

    int updateByPrimaryKey(ProgramUser record);
}