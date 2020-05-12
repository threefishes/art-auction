package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMobileSpecialItem;
import cn.threefishes.cloudrepository.entity.StoreMobileSpecialItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMobileSpecialItemMapper {
    long countByExample(StoreMobileSpecialItemExample example);

    int deleteByExample(StoreMobileSpecialItemExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(StoreMobileSpecialItem record);

    int insertSelective(StoreMobileSpecialItem record);

    List<StoreMobileSpecialItem> selectByExampleWithRowbounds(StoreMobileSpecialItemExample example, RowBounds rowBounds);

    List<StoreMobileSpecialItem> selectByExample(StoreMobileSpecialItemExample example);

    StoreMobileSpecialItem selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") StoreMobileSpecialItem record, @Param("example") StoreMobileSpecialItemExample example);

    int updateByExample(@Param("record") StoreMobileSpecialItem record, @Param("example") StoreMobileSpecialItemExample example);

    int updateByPrimaryKeySelective(StoreMobileSpecialItem record);

    int updateByPrimaryKey(StoreMobileSpecialItem record);
}