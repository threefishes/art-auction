package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinPendsend;
import cn.threefishes.cloudrepository.entity.WeixinPendsendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinPendsendMapper {
    long countByExample(WeixinPendsendExample example);

    int deleteByExample(WeixinPendsendExample example);

    int deleteByPrimaryKey(Integer sendId);

    int insert(WeixinPendsend record);

    int insertSelective(WeixinPendsend record);

    List<WeixinPendsend> selectByExampleWithRowbounds(WeixinPendsendExample example, RowBounds rowBounds);

    List<WeixinPendsend> selectByExample(WeixinPendsendExample example);

    WeixinPendsend selectByPrimaryKey(Integer sendId);

    int updateByExampleSelective(@Param("record") WeixinPendsend record, @Param("example") WeixinPendsendExample example);

    int updateByExample(@Param("record") WeixinPendsend record, @Param("example") WeixinPendsendExample example);

    int updateByPrimaryKeySelective(WeixinPendsend record);

    int updateByPrimaryKey(WeixinPendsend record);
}