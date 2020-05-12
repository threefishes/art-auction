package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Navigation;
import cn.threefishes.cloudrepository.entity.NavigationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface NavigationMapper {
    long countByExample(NavigationExample example);

    int deleteByExample(NavigationExample example);

    int deleteByPrimaryKey(Integer navId);

    int insert(Navigation record);

    int insertSelective(Navigation record);

    List<Navigation> selectByExampleWithRowbounds(NavigationExample example, RowBounds rowBounds);

    List<Navigation> selectByExample(NavigationExample example);

    Navigation selectByPrimaryKey(Integer navId);

    int updateByExampleSelective(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByExample(@Param("record") Navigation record, @Param("example") NavigationExample example);

    int updateByPrimaryKeySelective(Navigation record);

    int updateByPrimaryKey(Navigation record);
}