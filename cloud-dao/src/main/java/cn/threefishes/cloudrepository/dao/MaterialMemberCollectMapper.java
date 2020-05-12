package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MaterialMemberCollect;
import cn.threefishes.cloudrepository.entity.MaterialMemberCollectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialMemberCollectMapper {
    long countByExample(MaterialMemberCollectExample example);

    int deleteByExample(MaterialMemberCollectExample example);

    int deleteByPrimaryKey(Long collectId);

    int insert(MaterialMemberCollect record);

    int insertSelective(MaterialMemberCollect record);

    List<MaterialMemberCollect> selectByExampleWithRowbounds(MaterialMemberCollectExample example, RowBounds rowBounds);

    List<MaterialMemberCollect> selectByExample(MaterialMemberCollectExample example);

    MaterialMemberCollect selectByPrimaryKey(Long collectId);

    int updateByExampleSelective(@Param("record") MaterialMemberCollect record, @Param("example") MaterialMemberCollectExample example);

    int updateByExample(@Param("record") MaterialMemberCollect record, @Param("example") MaterialMemberCollectExample example);

    int updateByPrimaryKeySelective(MaterialMemberCollect record);

    int updateByPrimaryKey(MaterialMemberCollect record);
}