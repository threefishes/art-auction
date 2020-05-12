package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VipNotice;
import cn.threefishes.cloudrepository.entity.VipNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VipNoticeMapper {
    long countByExample(VipNoticeExample example);

    int deleteByExample(VipNoticeExample example);

    int deleteByPrimaryKey(Integer noticeId);

    int insert(VipNotice record);

    int insertSelective(VipNotice record);

    List<VipNotice> selectByExampleWithBLOBsWithRowbounds(VipNoticeExample example, RowBounds rowBounds);

    List<VipNotice> selectByExampleWithBLOBs(VipNoticeExample example);

    List<VipNotice> selectByExampleWithRowbounds(VipNoticeExample example, RowBounds rowBounds);

    List<VipNotice> selectByExample(VipNoticeExample example);

    VipNotice selectByPrimaryKey(Integer noticeId);

    int updateByExampleSelective(@Param("record") VipNotice record, @Param("example") VipNoticeExample example);

    int updateByExampleWithBLOBs(@Param("record") VipNotice record, @Param("example") VipNoticeExample example);

    int updateByExample(@Param("record") VipNotice record, @Param("example") VipNoticeExample example);

    int updateByPrimaryKeySelective(VipNotice record);

    int updateByPrimaryKeyWithBLOBs(VipNotice record);

    int updateByPrimaryKey(VipNotice record);
}