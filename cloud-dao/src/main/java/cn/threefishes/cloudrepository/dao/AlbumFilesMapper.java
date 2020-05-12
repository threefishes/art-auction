package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AlbumFiles;
import cn.threefishes.cloudrepository.entity.AlbumFilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AlbumFilesMapper {
    long countByExample(AlbumFilesExample example);

    int deleteByExample(AlbumFilesExample example);

    int deleteByPrimaryKey(Integer filesId);

    int insert(AlbumFiles record);

    int insertSelective(AlbumFiles record);

    List<AlbumFiles> selectByExampleWithRowbounds(AlbumFilesExample example, RowBounds rowBounds);

    List<AlbumFiles> selectByExample(AlbumFilesExample example);

    AlbumFiles selectByPrimaryKey(Integer filesId);

    int updateByExampleSelective(@Param("record") AlbumFiles record, @Param("example") AlbumFilesExample example);

    int updateByExample(@Param("record") AlbumFiles record, @Param("example") AlbumFilesExample example);

    int updateByPrimaryKeySelective(AlbumFiles record);

    int updateByPrimaryKey(AlbumFiles record);
}