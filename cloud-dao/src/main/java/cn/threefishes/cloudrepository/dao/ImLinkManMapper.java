package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ImLinkMan;
import cn.threefishes.cloudrepository.entity.ImLinkManExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ImLinkManMapper {
    long countByExample(ImLinkManExample example);

    int deleteByExample(ImLinkManExample example);

    int deleteByPrimaryKey(Integer linkId);

    int insert(ImLinkMan record);

    int insertSelective(ImLinkMan record);

    List<ImLinkMan> selectByExampleWithRowbounds(ImLinkManExample example, RowBounds rowBounds);

    List<ImLinkMan> selectByExample(ImLinkManExample example);

    ImLinkMan selectByPrimaryKey(Integer linkId);

    int updateByExampleSelective(@Param("record") ImLinkMan record, @Param("example") ImLinkManExample example);

    int updateByExample(@Param("record") ImLinkMan record, @Param("example") ImLinkManExample example);

    int updateByPrimaryKeySelective(ImLinkMan record);

    int updateByPrimaryKey(ImLinkMan record);
}