package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShareGoodsLog;
import cn.threefishes.cloudrepository.entity.ShareGoodsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShareGoodsLogMapper {
    long countByExample(ShareGoodsLogExample example);

    int deleteByExample(ShareGoodsLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(ShareGoodsLog record);

    int insertSelective(ShareGoodsLog record);

    List<ShareGoodsLog> selectByExampleWithRowbounds(ShareGoodsLogExample example, RowBounds rowBounds);

    List<ShareGoodsLog> selectByExample(ShareGoodsLogExample example);

    ShareGoodsLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") ShareGoodsLog record, @Param("example") ShareGoodsLogExample example);

    int updateByExample(@Param("record") ShareGoodsLog record, @Param("example") ShareGoodsLogExample example);

    int updateByPrimaryKeySelective(ShareGoodsLog record);

    int updateByPrimaryKey(ShareGoodsLog record);
}