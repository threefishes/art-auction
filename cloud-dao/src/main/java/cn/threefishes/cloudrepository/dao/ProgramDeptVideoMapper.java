package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ProgramDeptVideo;
import cn.threefishes.cloudrepository.entity.ProgramDeptVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProgramDeptVideoMapper {
    long countByExample(ProgramDeptVideoExample example);

    int deleteByExample(ProgramDeptVideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(ProgramDeptVideo record);

    int insertSelective(ProgramDeptVideo record);

    List<ProgramDeptVideo> selectByExampleWithRowbounds(ProgramDeptVideoExample example, RowBounds rowBounds);

    List<ProgramDeptVideo> selectByExample(ProgramDeptVideoExample example);

    ProgramDeptVideo selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") ProgramDeptVideo record, @Param("example") ProgramDeptVideoExample example);

    int updateByExample(@Param("record") ProgramDeptVideo record, @Param("example") ProgramDeptVideoExample example);

    int updateByPrimaryKeySelective(ProgramDeptVideo record);

    int updateByPrimaryKey(ProgramDeptVideo record);
}