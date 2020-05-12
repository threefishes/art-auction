package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinSubscribeQrcode;
import cn.threefishes.cloudrepository.entity.WeixinSubscribeQrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinSubscribeQrcodeMapper {
    long countByExample(WeixinSubscribeQrcodeExample example);

    int deleteByExample(WeixinSubscribeQrcodeExample example);

    int deleteByPrimaryKey(Integer dataId);

    int insert(WeixinSubscribeQrcode record);

    int insertSelective(WeixinSubscribeQrcode record);

    List<WeixinSubscribeQrcode> selectByExampleWithRowbounds(WeixinSubscribeQrcodeExample example, RowBounds rowBounds);

    List<WeixinSubscribeQrcode> selectByExample(WeixinSubscribeQrcodeExample example);

    WeixinSubscribeQrcode selectByPrimaryKey(Integer dataId);

    int updateByExampleSelective(@Param("record") WeixinSubscribeQrcode record, @Param("example") WeixinSubscribeQrcodeExample example);

    int updateByExample(@Param("record") WeixinSubscribeQrcode record, @Param("example") WeixinSubscribeQrcodeExample example);

    int updateByPrimaryKeySelective(WeixinSubscribeQrcode record);

    int updateByPrimaryKey(WeixinSubscribeQrcode record);
}