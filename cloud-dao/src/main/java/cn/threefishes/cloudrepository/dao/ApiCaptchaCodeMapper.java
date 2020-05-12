package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiCaptchaCode;
import cn.threefishes.cloudrepository.entity.ApiCaptchaCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiCaptchaCodeMapper {
    long countByExample(ApiCaptchaCodeExample example);

    int deleteByExample(ApiCaptchaCodeExample example);

    int deleteByPrimaryKey(Integer codeId);

    int insert(ApiCaptchaCode record);

    int insertSelective(ApiCaptchaCode record);

    List<ApiCaptchaCode> selectByExampleWithRowbounds(ApiCaptchaCodeExample example, RowBounds rowBounds);

    List<ApiCaptchaCode> selectByExample(ApiCaptchaCodeExample example);

    ApiCaptchaCode selectByPrimaryKey(Integer codeId);

    int updateByExampleSelective(@Param("record") ApiCaptchaCode record, @Param("example") ApiCaptchaCodeExample example);

    int updateByExample(@Param("record") ApiCaptchaCode record, @Param("example") ApiCaptchaCodeExample example);

    int updateByPrimaryKeySelective(ApiCaptchaCode record);

    int updateByPrimaryKey(ApiCaptchaCode record);
}