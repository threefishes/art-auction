package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VideoAlbum;
import cn.threefishes.cloudrepository.entity.VideoAlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VideoAlbumMapper {
    long countByExample(VideoAlbumExample example);

    int deleteByExample(VideoAlbumExample example);

    int deleteByPrimaryKey(Integer albumId);

    int insert(VideoAlbum record);

    int insertSelective(VideoAlbum record);

    List<VideoAlbum> selectByExampleWithRowbounds(VideoAlbumExample example, RowBounds rowBounds);

    List<VideoAlbum> selectByExample(VideoAlbumExample example);

    VideoAlbum selectByPrimaryKey(Integer albumId);

    int updateByExampleSelective(@Param("record") VideoAlbum record, @Param("example") VideoAlbumExample example);

    int updateByExample(@Param("record") VideoAlbum record, @Param("example") VideoAlbumExample example);

    int updateByPrimaryKeySelective(VideoAlbum record);

    int updateByPrimaryKey(VideoAlbum record);
}