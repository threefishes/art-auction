package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DistributorJoin;
import cn.threefishes.cloudrepository.entity.DistributorJoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DistributorJoinMapper {
    long countByExample(DistributorJoinExample example);

    int deleteByExample(DistributorJoinExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(DistributorJoin record);

    int insertSelective(DistributorJoin record);

    List<DistributorJoin> selectByExampleWithRowbounds(DistributorJoinExample example, RowBounds rowBounds);

    List<DistributorJoin> selectByExample(DistributorJoinExample example);

    DistributorJoin selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") DistributorJoin record, @Param("example") DistributorJoinExample example);

    int updateByExample(@Param("record") DistributorJoin record, @Param("example") DistributorJoinExample example);

    int updateByPrimaryKeySelective(DistributorJoin record);

    int updateByPrimaryKey(DistributorJoin record);
}