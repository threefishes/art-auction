package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ArrivalNotice;
import cn.threefishes.cloudrepository.entity.ArrivalNoticeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArrivalNoticeMapper {
    long countByExample(ArrivalNoticeExample example);

    int deleteByExample(ArrivalNoticeExample example);

    int deleteByPrimaryKey(Integer arrivalId);

    int insert(ArrivalNotice record);

    int insertSelective(ArrivalNotice record);

    List<ArrivalNotice> selectByExampleWithRowbounds(ArrivalNoticeExample example, RowBounds rowBounds);

    List<ArrivalNotice> selectByExample(ArrivalNoticeExample example);

    ArrivalNotice selectByPrimaryKey(Integer arrivalId);

    int updateByExampleSelective(@Param("record") ArrivalNotice record, @Param("example") ArrivalNoticeExample example);

    int updateByExample(@Param("record") ArrivalNotice record, @Param("example") ArrivalNoticeExample example);

    int updateByPrimaryKeySelective(ArrivalNotice record);

    int updateByPrimaryKey(ArrivalNotice record);
}