package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMenuCopy;
import cn.threefishes.cloudrepository.entity.WeixinMenuCopyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMenuCopyMapper {
    long countByExample(WeixinMenuCopyExample example);

    int deleteByExample(WeixinMenuCopyExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(WeixinMenuCopy record);

    int insertSelective(WeixinMenuCopy record);

    List<WeixinMenuCopy> selectByExampleWithBLOBsWithRowbounds(WeixinMenuCopyExample example, RowBounds rowBounds);

    List<WeixinMenuCopy> selectByExampleWithBLOBs(WeixinMenuCopyExample example);

    List<WeixinMenuCopy> selectByExampleWithRowbounds(WeixinMenuCopyExample example, RowBounds rowBounds);

    List<WeixinMenuCopy> selectByExample(WeixinMenuCopyExample example);

    WeixinMenuCopy selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") WeixinMenuCopy record, @Param("example") WeixinMenuCopyExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMenuCopy record, @Param("example") WeixinMenuCopyExample example);

    int updateByExample(@Param("record") WeixinMenuCopy record, @Param("example") WeixinMenuCopyExample example);

    int updateByPrimaryKeySelective(WeixinMenuCopy record);

    int updateByPrimaryKeyWithBLOBs(WeixinMenuCopy record);

    int updateByPrimaryKey(WeixinMenuCopy record);
}