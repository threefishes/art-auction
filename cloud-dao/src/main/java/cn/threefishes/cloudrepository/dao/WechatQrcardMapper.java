package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WechatQrcard;
import cn.threefishes.cloudrepository.entity.WechatQrcardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WechatQrcardMapper {
    long countByExample(WechatQrcardExample example);

    int deleteByExample(WechatQrcardExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(WechatQrcard record);

    int insertSelective(WechatQrcard record);

    List<WechatQrcard> selectByExampleWithRowbounds(WechatQrcardExample example, RowBounds rowBounds);

    List<WechatQrcard> selectByExample(WechatQrcardExample example);

    WechatQrcard selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") WechatQrcard record, @Param("example") WechatQrcardExample example);

    int updateByExample(@Param("record") WechatQrcard record, @Param("example") WechatQrcardExample example);

    int updateByPrimaryKeySelective(WechatQrcard record);

    int updateByPrimaryKey(WechatQrcard record);
}