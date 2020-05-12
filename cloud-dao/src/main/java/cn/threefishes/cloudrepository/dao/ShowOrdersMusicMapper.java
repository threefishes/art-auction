package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersMusic;
import cn.threefishes.cloudrepository.entity.ShowOrdersMusicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersMusicMapper {
    long countByExample(ShowOrdersMusicExample example);

    int deleteByExample(ShowOrdersMusicExample example);

    int deleteByPrimaryKey(Integer musicId);

    int insert(ShowOrdersMusic record);

    int insertSelective(ShowOrdersMusic record);

    List<ShowOrdersMusic> selectByExampleWithRowbounds(ShowOrdersMusicExample example, RowBounds rowBounds);

    List<ShowOrdersMusic> selectByExample(ShowOrdersMusicExample example);

    ShowOrdersMusic selectByPrimaryKey(Integer musicId);

    int updateByExampleSelective(@Param("record") ShowOrdersMusic record, @Param("example") ShowOrdersMusicExample example);

    int updateByExample(@Param("record") ShowOrdersMusic record, @Param("example") ShowOrdersMusicExample example);

    int updateByPrimaryKeySelective(ShowOrdersMusic record);

    int updateByPrimaryKey(ShowOrdersMusic record);
}