package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfWeixinParamQrcode;
import cn.threefishes.cloudrepository.entity.TfWeixinParamQrcodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfWeixinParamQrcodeMapper {
    long countByExample(TfWeixinParamQrcodeExample example);

    int deleteByExample(TfWeixinParamQrcodeExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(TfWeixinParamQrcode record);

    int insertSelective(TfWeixinParamQrcode record);

    List<TfWeixinParamQrcode> selectByExampleWithRowbounds(TfWeixinParamQrcodeExample example, RowBounds rowBounds);

    List<TfWeixinParamQrcode> selectByExample(TfWeixinParamQrcodeExample example);

    TfWeixinParamQrcode selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") TfWeixinParamQrcode record, @Param("example") TfWeixinParamQrcodeExample example);

    int updateByExample(@Param("record") TfWeixinParamQrcode record, @Param("example") TfWeixinParamQrcodeExample example);

    int updateByPrimaryKeySelective(TfWeixinParamQrcode record);

    int updateByPrimaryKey(TfWeixinParamQrcode record);
}