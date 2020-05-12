package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Album;
import cn.threefishes.cloudrepository.entity.AlbumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AlbumMapper {
    long countByExample(AlbumExample example);

    int deleteByExample(AlbumExample example);

    int deleteByPrimaryKey(Integer albumId);

    int insert(Album record);

    int insertSelective(Album record);

    List<Album> selectByExampleWithRowbounds(AlbumExample example, RowBounds rowBounds);

    List<Album> selectByExample(AlbumExample example);

    Album selectByPrimaryKey(Integer albumId);

    int updateByExampleSelective(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByExample(@Param("record") Album record, @Param("example") AlbumExample example);

    int updateByPrimaryKeySelective(Album record);

    int updateByPrimaryKey(Album record);
}