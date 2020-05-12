package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VideoAlbumFiles;
import cn.threefishes.cloudrepository.entity.VideoAlbumFilesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoAlbumFilesMapper {
    long countByExample(VideoAlbumFilesExample example);

    int deleteByExample(VideoAlbumFilesExample example);

    int deleteByPrimaryKey(Integer filesId);

    int insert(VideoAlbumFiles record);

    int insertSelective(VideoAlbumFiles record);

    List<VideoAlbumFiles> selectByExampleWithRowbounds(VideoAlbumFilesExample example, RowBounds rowBounds);

    List<VideoAlbumFiles> selectByExample(VideoAlbumFilesExample example);

    VideoAlbumFiles selectByPrimaryKey(Integer filesId);

    int updateByExampleSelective(@Param("record") VideoAlbumFiles record, @Param("example") VideoAlbumFilesExample example);

    int updateByExample(@Param("record") VideoAlbumFiles record, @Param("example") VideoAlbumFilesExample example);

    int updateByPrimaryKeySelective(VideoAlbumFiles record);

    int updateByPrimaryKey(VideoAlbumFiles record);
}