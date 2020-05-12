package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShareShortUrlOld;
import cn.threefishes.cloudrepository.entity.ShareShortUrlOldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShareShortUrlOldMapper {
    long countByExample(ShareShortUrlOldExample example);

    int deleteByExample(ShareShortUrlOldExample example);

    int deleteByPrimaryKey(Long shareId);

    int insert(ShareShortUrlOld record);

    int insertSelective(ShareShortUrlOld record);

    List<ShareShortUrlOld> selectByExampleWithRowbounds(ShareShortUrlOldExample example, RowBounds rowBounds);

    List<ShareShortUrlOld> selectByExample(ShareShortUrlOldExample example);

    ShareShortUrlOld selectByPrimaryKey(Long shareId);

    int updateByExampleSelective(@Param("record") ShareShortUrlOld record, @Param("example") ShareShortUrlOldExample example);

    int updateByExample(@Param("record") ShareShortUrlOld record, @Param("example") ShareShortUrlOldExample example);

    int updateByPrimaryKeySelective(ShareShortUrlOld record);

    int updateByPrimaryKey(ShareShortUrlOld record);
}