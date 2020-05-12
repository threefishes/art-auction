package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinQrcode;
import cn.threefishes.cloudrepository.entity.WeixinQrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinQrcodeMapper {
    long countByExample(WeixinQrcodeExample example);

    int deleteByExample(WeixinQrcodeExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(WeixinQrcode record);

    int insertSelective(WeixinQrcode record);

    List<WeixinQrcode> selectByExampleWithBLOBsWithRowbounds(WeixinQrcodeExample example, RowBounds rowBounds);

    List<WeixinQrcode> selectByExampleWithBLOBs(WeixinQrcodeExample example);

    List<WeixinQrcode> selectByExampleWithRowbounds(WeixinQrcodeExample example, RowBounds rowBounds);

    List<WeixinQrcode> selectByExample(WeixinQrcodeExample example);

    WeixinQrcode selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") WeixinQrcode record, @Param("example") WeixinQrcodeExample example);

    int updateByExampleWithBLOBs(@Param("record") WeixinQrcode record, @Param("example") WeixinQrcodeExample example);

    int updateByExample(@Param("record") WeixinQrcode record, @Param("example") WeixinQrcodeExample example);

    int updateByPrimaryKeySelective(WeixinQrcode record);

    int updateByPrimaryKeyWithBLOBs(WeixinQrcode record);

    int updateByPrimaryKey(WeixinQrcode record);
}