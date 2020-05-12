package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Bundling;
import cn.threefishes.cloudrepository.entity.BundlingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BundlingMapper {
    long countByExample(BundlingExample example);

    int deleteByExample(BundlingExample example);

    int deleteByPrimaryKey(Integer bundlingId);

    int insert(Bundling record);

    int insertSelective(Bundling record);

    List<Bundling> selectByExampleWithRowbounds(BundlingExample example, RowBounds rowBounds);

    List<Bundling> selectByExample(BundlingExample example);

    Bundling selectByPrimaryKey(Integer bundlingId);

    int updateByExampleSelective(@Param("record") Bundling record, @Param("example") BundlingExample example);

    int updateByExample(@Param("record") Bundling record, @Param("example") BundlingExample example);

    int updateByPrimaryKeySelective(Bundling record);

    int updateByPrimaryKey(Bundling record);
}