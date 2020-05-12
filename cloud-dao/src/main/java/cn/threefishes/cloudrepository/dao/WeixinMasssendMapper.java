package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinMasssend;
import cn.threefishes.cloudrepository.entity.WeixinMasssendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinMasssendMapper {
    long countByExample(WeixinMasssendExample example);

    int deleteByExample(WeixinMasssendExample example);

    int deleteByPrimaryKey(Integer sendId);

    int insert(WeixinMasssend record);

    int insertSelective(WeixinMasssend record);

    List<WeixinMasssend> selectByExampleWithBLOBsWithRowbounds(WeixinMasssendExample example, RowBounds rowBounds);

    List<WeixinMasssend> selectByExampleWithBLOBs(WeixinMasssendExample example);

    List<WeixinMasssend> selectByExampleWithRowbounds(WeixinMasssendExample example, RowBounds rowBounds);

    List<WeixinMasssend> selectByExample(WeixinMasssendExample example);

    WeixinMasssend selectByPrimaryKey(Integer sendId);

    int updateByExampleSelective(@Param("record") WeixinMasssend record, @Param("example") WeixinMasssendExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinMasssend record, @Param("example") WeixinMasssendExample example);

    int updateByExample(@Param("record") WeixinMasssend record, @Param("example") WeixinMasssendExample example);

    int updateByPrimaryKeySelective(WeixinMasssend record);

    int updateByPrimaryKeyWithBLOBs(WeixinMasssend record);

    int updateByPrimaryKey(WeixinMasssend record);
}