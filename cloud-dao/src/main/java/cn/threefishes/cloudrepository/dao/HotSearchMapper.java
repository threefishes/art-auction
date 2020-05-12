package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.HotSearch;
import cn.threefishes.cloudrepository.entity.HotSearchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface HotSearchMapper {
    long countByExample(HotSearchExample example);

    int deleteByExample(HotSearchExample example);

    int deleteByPrimaryKey(Integer hotId);

    int insert(HotSearch record);

    int insertSelective(HotSearch record);

    List<HotSearch> selectByExampleWithRowbounds(HotSearchExample example, RowBounds rowBounds);

    List<HotSearch> selectByExample(HotSearchExample example);

    HotSearch selectByPrimaryKey(Integer hotId);

    int updateByExampleSelective(@Param("record") HotSearch record, @Param("example") HotSearchExample example);

    int updateByExample(@Param("record") HotSearch record, @Param("example") HotSearchExample example);

    int updateByPrimaryKeySelective(HotSearch record);

    int updateByPrimaryKey(HotSearch record);
}