package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SeckillBeginNotice;
import cn.threefishes.cloudrepository.entity.SeckillBeginNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SeckillBeginNoticeMapper {
    long countByExample(SeckillBeginNoticeExample example);

    int deleteByExample(SeckillBeginNoticeExample example);

    int deleteByPrimaryKey(Integer arrivalId);

    int insert(SeckillBeginNotice record);

    int insertSelective(SeckillBeginNotice record);

    List<SeckillBeginNotice> selectByExampleWithRowbounds(SeckillBeginNoticeExample example, RowBounds rowBounds);

    List<SeckillBeginNotice> selectByExample(SeckillBeginNoticeExample example);

    SeckillBeginNotice selectByPrimaryKey(Integer arrivalId);

    int updateByExampleSelective(@Param("record") SeckillBeginNotice record, @Param("example") SeckillBeginNoticeExample example);

    int updateByExample(@Param("record") SeckillBeginNotice record, @Param("example") SeckillBeginNoticeExample example);

    int updateByPrimaryKeySelective(SeckillBeginNotice record);

    int updateByPrimaryKey(SeckillBeginNotice record);
}