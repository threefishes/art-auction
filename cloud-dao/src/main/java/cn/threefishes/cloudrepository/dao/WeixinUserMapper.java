package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinUser;
import cn.threefishes.cloudrepository.entity.WeixinUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinUserMapper {
    long countByExample(WeixinUserExample example);

    int deleteByExample(WeixinUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(WeixinUser record);

    int insertSelective(WeixinUser record);

    List<WeixinUser> selectByExampleWithRowbounds(WeixinUserExample example, RowBounds rowBounds);

    List<WeixinUser> selectByExample(WeixinUserExample example);

    WeixinUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") WeixinUser record, @Param("example") WeixinUserExample example);

    int updateByExample(@Param("record") WeixinUser record, @Param("example") WeixinUserExample example);

    int updateByPrimaryKeySelective(WeixinUser record);

    int updateByPrimaryKey(WeixinUser record);
}