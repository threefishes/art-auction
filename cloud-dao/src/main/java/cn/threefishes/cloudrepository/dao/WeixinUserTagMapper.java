package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinUserTag;
import cn.threefishes.cloudrepository.entity.WeixinUserTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinUserTagMapper {
    long countByExample(WeixinUserTagExample example);

    int deleteByExample(WeixinUserTagExample example);

    int deleteByPrimaryKey(Integer tagId);

    int insert(WeixinUserTag record);

    int insertSelective(WeixinUserTag record);

    List<WeixinUserTag> selectByExampleWithRowbounds(WeixinUserTagExample example, RowBounds rowBounds);

    List<WeixinUserTag> selectByExample(WeixinUserTagExample example);

    WeixinUserTag selectByPrimaryKey(Integer tagId);

    int updateByExampleSelective(@Param("record") WeixinUserTag record, @Param("example") WeixinUserTagExample example);

    int updateByExample(@Param("record") WeixinUserTag record, @Param("example") WeixinUserTagExample example);

    int updateByPrimaryKeySelective(WeixinUserTag record);

    int updateByPrimaryKey(WeixinUserTag record);
}