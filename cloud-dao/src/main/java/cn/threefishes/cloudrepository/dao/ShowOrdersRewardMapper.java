package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersReward;
import cn.threefishes.cloudrepository.entity.ShowOrdersRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersRewardMapper {
    long countByExample(ShowOrdersRewardExample example);

    int deleteByExample(ShowOrdersRewardExample example);

    int deleteByPrimaryKey(Integer rewardId);

    int insert(ShowOrdersReward record);

    int insertSelective(ShowOrdersReward record);

    List<ShowOrdersReward> selectByExampleWithRowbounds(ShowOrdersRewardExample example, RowBounds rowBounds);

    List<ShowOrdersReward> selectByExample(ShowOrdersRewardExample example);

    ShowOrdersReward selectByPrimaryKey(Integer rewardId);

    int updateByExampleSelective(@Param("record") ShowOrdersReward record, @Param("example") ShowOrdersRewardExample example);

    int updateByExample(@Param("record") ShowOrdersReward record, @Param("example") ShowOrdersRewardExample example);

    int updateByPrimaryKeySelective(ShowOrdersReward record);

    int updateByPrimaryKey(ShowOrdersReward record);
}