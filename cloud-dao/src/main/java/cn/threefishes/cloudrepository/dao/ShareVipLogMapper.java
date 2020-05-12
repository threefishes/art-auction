package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShareVipLog;
import cn.threefishes.cloudrepository.entity.ShareVipLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShareVipLogMapper {
    long countByExample(ShareVipLogExample example);

    int deleteByExample(ShareVipLogExample example);

    int deleteByPrimaryKey(Integer vipLogId);

    int insert(ShareVipLog record);

    int insertSelective(ShareVipLog record);

    List<ShareVipLog> selectByExampleWithRowbounds(ShareVipLogExample example, RowBounds rowBounds);

    List<ShareVipLog> selectByExample(ShareVipLogExample example);

    ShareVipLog selectByPrimaryKey(Integer vipLogId);

    int updateByExampleSelective(@Param("record") ShareVipLog record, @Param("example") ShareVipLogExample example);

    int updateByExample(@Param("record") ShareVipLog record, @Param("example") ShareVipLogExample example);

    int updateByPrimaryKeySelective(ShareVipLog record);

    int updateByPrimaryKey(ShareVipLog record);
}