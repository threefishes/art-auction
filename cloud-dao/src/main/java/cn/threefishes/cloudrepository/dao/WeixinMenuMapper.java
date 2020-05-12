package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMenu;
import cn.threefishes.cloudrepository.entity.WeixinMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMenuMapper {
    long countByExample(WeixinMenuExample example);

    int deleteByExample(WeixinMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(WeixinMenu record);

    int insertSelective(WeixinMenu record);

    List<WeixinMenu> selectByExampleWithBLOBsWithRowbounds(WeixinMenuExample example, RowBounds rowBounds);

    List<WeixinMenu> selectByExampleWithBLOBs(WeixinMenuExample example);

    List<WeixinMenu> selectByExampleWithRowbounds(WeixinMenuExample example, RowBounds rowBounds);

    List<WeixinMenu> selectByExample(WeixinMenuExample example);

    WeixinMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") WeixinMenu record, @Param("example") WeixinMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMenu record, @Param("example") WeixinMenuExample example);

    int updateByExample(@Param("record") WeixinMenu record, @Param("example") WeixinMenuExample example);

    int updateByPrimaryKeySelective(WeixinMenu record);

    int updateByPrimaryKeyWithBLOBs(WeixinMenu record);

    int updateByPrimaryKey(WeixinMenu record);
}