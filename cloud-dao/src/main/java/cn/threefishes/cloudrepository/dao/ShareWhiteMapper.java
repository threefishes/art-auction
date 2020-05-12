package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShareWhite;
import cn.threefishes.cloudrepository.entity.ShareWhiteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShareWhiteMapper {
    long countByExample(ShareWhiteExample example);

    int deleteByExample(ShareWhiteExample example);

    int deleteByPrimaryKey(Integer whiteId);

    int insert(ShareWhite record);

    int insertSelective(ShareWhite record);

    List<ShareWhite> selectByExampleWithRowbounds(ShareWhiteExample example, RowBounds rowBounds);

    List<ShareWhite> selectByExample(ShareWhiteExample example);

    ShareWhite selectByPrimaryKey(Integer whiteId);

    int updateByExampleSelective(@Param("record") ShareWhite record, @Param("example") ShareWhiteExample example);

    int updateByExample(@Param("record") ShareWhite record, @Param("example") ShareWhiteExample example);

    int updateByPrimaryKeySelective(ShareWhite record);

    int updateByPrimaryKey(ShareWhite record);
}