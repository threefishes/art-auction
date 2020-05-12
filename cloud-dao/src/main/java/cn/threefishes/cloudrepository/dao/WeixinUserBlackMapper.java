package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.WeixinUserBlack;
import cn.threefishes.cloudrepository.entity.WeixinUserBlackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WeixinUserBlackMapper {
    long countByExample(WeixinUserBlackExample example);

    int deleteByExample(WeixinUserBlackExample example);

    int deleteByPrimaryKey(Integer blackId);

    int insert(WeixinUserBlack record);

    int insertSelective(WeixinUserBlack record);

    List<WeixinUserBlack> selectByExampleWithRowbounds(WeixinUserBlackExample example, RowBounds rowBounds);

    List<WeixinUserBlack> selectByExample(WeixinUserBlackExample example);

    WeixinUserBlack selectByPrimaryKey(Integer blackId);

    int updateByExampleSelective(@Param("record") WeixinUserBlack record, @Param("example") WeixinUserBlackExample example);

    int updateByExample(@Param("record") WeixinUserBlack record, @Param("example") WeixinUserBlackExample example);

    int updateByPrimaryKeySelective(WeixinUserBlack record);

    int updateByPrimaryKey(WeixinUserBlack record);
}