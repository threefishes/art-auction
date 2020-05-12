package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WxadminMenu;
import cn.threefishes.cloudrepository.entity.WxadminMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxadminMenuMapper {
    long countByExample(WxadminMenuExample example);

    int deleteByExample(WxadminMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WxadminMenu record);

    int insertSelective(WxadminMenu record);

    List<WxadminMenu> selectByExampleWithRowbounds(WxadminMenuExample example, RowBounds rowBounds);

    List<WxadminMenu> selectByExample(WxadminMenuExample example);

    WxadminMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WxadminMenu record, @Param("example") WxadminMenuExample example);

    int updateByExample(@Param("record") WxadminMenu record, @Param("example") WxadminMenuExample example);

    int updateByPrimaryKeySelective(WxadminMenu record);

    int updateByPrimaryKey(WxadminMenu record);
}