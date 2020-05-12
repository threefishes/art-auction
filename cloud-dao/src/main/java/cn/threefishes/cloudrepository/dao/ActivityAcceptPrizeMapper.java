package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ActivityAcceptPrize;
import cn.threefishes.cloudrepository.entity.ActivityAcceptPrizeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ActivityAcceptPrizeMapper {
    long countByExample(ActivityAcceptPrizeExample example);

    int deleteByExample(ActivityAcceptPrizeExample example);

    int deleteByPrimaryKey(Integer acceptPrizeId);

    int insert(ActivityAcceptPrize record);

    int insertSelective(ActivityAcceptPrize record);

    List<ActivityAcceptPrize> selectByExampleWithBLOBsWithRowbounds(ActivityAcceptPrizeExample example, RowBounds rowBounds);

    List<ActivityAcceptPrize> selectByExampleWithBLOBs(ActivityAcceptPrizeExample example);

    List<ActivityAcceptPrize> selectByExampleWithRowbounds(ActivityAcceptPrizeExample example, RowBounds rowBounds);

    List<ActivityAcceptPrize> selectByExample(ActivityAcceptPrizeExample example);

    ActivityAcceptPrize selectByPrimaryKey(Integer acceptPrizeId);

    int updateByExampleSelective(@Param("record") ActivityAcceptPrize record, @Param("example") ActivityAcceptPrizeExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityAcceptPrize record, @Param("example") ActivityAcceptPrizeExample example);

    int updateByExample(@Param("record") ActivityAcceptPrize record, @Param("example") ActivityAcceptPrizeExample example);

    int updateByPrimaryKeySelective(ActivityAcceptPrize record);

    int updateByPrimaryKeyWithBLOBs(ActivityAcceptPrize record);

    int updateByPrimaryKey(ActivityAcceptPrize record);
}