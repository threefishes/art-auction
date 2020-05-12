package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShareShortUrl;
import cn.threefishes.cloudrepository.entity.ShareShortUrlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShareShortUrlMapper {
    long countByExample(ShareShortUrlExample example);

    int deleteByExample(ShareShortUrlExample example);

    int deleteByPrimaryKey(Long shareId);

    int insert(ShareShortUrl record);

    int insertSelective(ShareShortUrl record);

    List<ShareShortUrl> selectByExampleWithRowbounds(ShareShortUrlExample example, RowBounds rowBounds);

    List<ShareShortUrl> selectByExample(ShareShortUrlExample example);

    ShareShortUrl selectByPrimaryKey(Long shareId);

    int updateByExampleSelective(@Param("record") ShareShortUrl record, @Param("example") ShareShortUrlExample example);

    int updateByExample(@Param("record") ShareShortUrl record, @Param("example") ShareShortUrlExample example);

    int updateByPrimaryKeySelective(ShareShortUrl record);

    int updateByPrimaryKey(ShareShortUrl record);
}