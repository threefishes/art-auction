package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMpTmpl;
import cn.threefishes.cloudrepository.entity.WeixinMpTmplExample;
import cn.threefishes.cloudrepository.entity.WeixinMpTmplWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMpTmplMapper {
    long countByExample(WeixinMpTmplExample example);

    int deleteByExample(WeixinMpTmplExample example);

    int deleteByPrimaryKey(Integer tmplId);

    int insert(WeixinMpTmplWithBLOBs record);

    int insertSelective(WeixinMpTmplWithBLOBs record);

    List<WeixinMpTmplWithBLOBs> selectByExampleWithBLOBsWithRowbounds(WeixinMpTmplExample example, RowBounds rowBounds);

    List<WeixinMpTmplWithBLOBs> selectByExampleWithBLOBs(WeixinMpTmplExample example);

    List<WeixinMpTmpl> selectByExampleWithRowbounds(WeixinMpTmplExample example, RowBounds rowBounds);

    List<WeixinMpTmpl> selectByExample(WeixinMpTmplExample example);

    WeixinMpTmplWithBLOBs selectByPrimaryKey(Integer tmplId);

    int updateByExampleSelective(@Param("record") WeixinMpTmplWithBLOBs record, @Param("example") WeixinMpTmplExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMpTmplWithBLOBs record, @Param("example") WeixinMpTmplExample example);

    int updateByExample(@Param("record") WeixinMpTmpl record, @Param("example") WeixinMpTmplExample example);

    int updateByPrimaryKeySelective(WeixinMpTmplWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WeixinMpTmplWithBLOBs record);

    int updateByPrimaryKey(WeixinMpTmpl record);
}