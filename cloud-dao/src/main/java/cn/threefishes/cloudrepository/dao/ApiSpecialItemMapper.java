package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiSpecialItem;
import cn.threefishes.cloudrepository.entity.ApiSpecialItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiSpecialItemMapper {
    long countByExample(ApiSpecialItemExample example);

    int deleteByExample(ApiSpecialItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(ApiSpecialItem record);

    int insertSelective(ApiSpecialItem record);

    List<ApiSpecialItem> selectByExampleWithBLOBsWithRowbounds(ApiSpecialItemExample example, RowBounds rowBounds);

    List<ApiSpecialItem> selectByExampleWithBLOBs(ApiSpecialItemExample example);

    List<ApiSpecialItem> selectByExampleWithRowbounds(ApiSpecialItemExample example, RowBounds rowBounds);

    List<ApiSpecialItem> selectByExample(ApiSpecialItemExample example);

    ApiSpecialItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") ApiSpecialItem record, @Param("example") ApiSpecialItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiSpecialItem record, @Param("example") ApiSpecialItemExample example);

    int updateByExample(@Param("record") ApiSpecialItem record, @Param("example") ApiSpecialItemExample example);

    int updateByPrimaryKeySelective(ApiSpecialItem record);

    int updateByPrimaryKeyWithBLOBs(ApiSpecialItem record);

    int updateByPrimaryKey(ApiSpecialItem record);
}