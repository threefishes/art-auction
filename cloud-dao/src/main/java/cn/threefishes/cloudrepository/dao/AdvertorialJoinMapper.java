package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialJoin;
import cn.threefishes.cloudrepository.entity.AdvertorialJoinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialJoinMapper {
    long countByExample(AdvertorialJoinExample example);

    int deleteByExample(AdvertorialJoinExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(AdvertorialJoin record);

    int insertSelective(AdvertorialJoin record);

    List<AdvertorialJoin> selectByExampleWithRowbounds(AdvertorialJoinExample example, RowBounds rowBounds);

    List<AdvertorialJoin> selectByExample(AdvertorialJoinExample example);

    AdvertorialJoin selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") AdvertorialJoin record, @Param("example") AdvertorialJoinExample example);

    int updateByExample(@Param("record") AdvertorialJoin record, @Param("example") AdvertorialJoinExample example);

    int updateByPrimaryKeySelective(AdvertorialJoin record);

    int updateByPrimaryKey(AdvertorialJoin record);
}