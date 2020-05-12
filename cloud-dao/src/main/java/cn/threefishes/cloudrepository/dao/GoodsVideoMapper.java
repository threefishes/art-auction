package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GoodsVideo;
import cn.threefishes.cloudrepository.entity.GoodsVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GoodsVideoMapper {
    long countByExample(GoodsVideoExample example);

    int deleteByExample(GoodsVideoExample example);

    int deleteByPrimaryKey(Integer videoId);

    int insert(GoodsVideo record);

    int insertSelective(GoodsVideo record);

    List<GoodsVideo> selectByExampleWithRowbounds(GoodsVideoExample example, RowBounds rowBounds);

    List<GoodsVideo> selectByExample(GoodsVideoExample example);

    GoodsVideo selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") GoodsVideo record, @Param("example") GoodsVideoExample example);

    int updateByExample(@Param("record") GoodsVideo record, @Param("example") GoodsVideoExample example);

    int updateByPrimaryKeySelective(GoodsVideo record);

    int updateByPrimaryKey(GoodsVideo record);
}