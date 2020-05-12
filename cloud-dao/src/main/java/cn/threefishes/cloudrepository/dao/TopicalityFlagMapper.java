package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TopicalityFlag;
import cn.threefishes.cloudrepository.entity.TopicalityFlagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TopicalityFlagMapper {
    long countByExample(TopicalityFlagExample example);

    int deleteByExample(TopicalityFlagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TopicalityFlag record);

    int insertSelective(TopicalityFlag record);

    List<TopicalityFlag> selectByExampleWithRowbounds(TopicalityFlagExample example, RowBounds rowBounds);

    List<TopicalityFlag> selectByExample(TopicalityFlagExample example);

    TopicalityFlag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TopicalityFlag record, @Param("example") TopicalityFlagExample example);

    int updateByExample(@Param("record") TopicalityFlag record, @Param("example") TopicalityFlagExample example);

    int updateByPrimaryKeySelective(TopicalityFlag record);

    int updateByPrimaryKey(TopicalityFlag record);
}