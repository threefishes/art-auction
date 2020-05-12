package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ProgramUploadVideo;
import cn.threefishes.cloudrepository.entity.ProgramUploadVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ProgramUploadVideoMapper {
    long countByExample(ProgramUploadVideoExample example);

    int deleteByExample(ProgramUploadVideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(ProgramUploadVideo record);

    int insertSelective(ProgramUploadVideo record);

    List<ProgramUploadVideo> selectByExampleWithRowbounds(ProgramUploadVideoExample example, RowBounds rowBounds);

    List<ProgramUploadVideo> selectByExample(ProgramUploadVideoExample example);

    ProgramUploadVideo selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") ProgramUploadVideo record, @Param("example") ProgramUploadVideoExample example);

    int updateByExample(@Param("record") ProgramUploadVideo record, @Param("example") ProgramUploadVideoExample example);

    int updateByPrimaryKeySelective(ProgramUploadVideo record);

    int updateByPrimaryKey(ProgramUploadVideo record);
}