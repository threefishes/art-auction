package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinAdmin;
import cn.threefishes.cloudrepository.entity.WeixinAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinAdminMapper {
    long countByExample(WeixinAdminExample example);

    int deleteByExample(WeixinAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(WeixinAdmin record);

    int insertSelective(WeixinAdmin record);

    List<WeixinAdmin> selectByExampleWithRowbounds(WeixinAdminExample example, RowBounds rowBounds);

    List<WeixinAdmin> selectByExample(WeixinAdminExample example);

    WeixinAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") WeixinAdmin record, @Param("example") WeixinAdminExample example);

    int updateByExample(@Param("record") WeixinAdmin record, @Param("example") WeixinAdminExample example);

    int updateByPrimaryKeySelective(WeixinAdmin record);

    int updateByPrimaryKey(WeixinAdmin record);
}