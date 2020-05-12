package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreSpecial;
import cn.threefishes.cloudrepository.entity.StoreSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreSpecialMapper {
    long countByExample(StoreSpecialExample example);

    int deleteByExample(StoreSpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(StoreSpecial record);

    int insertSelective(StoreSpecial record);

    List<StoreSpecial> selectByExampleWithRowbounds(StoreSpecialExample example, RowBounds rowBounds);

    List<StoreSpecial> selectByExample(StoreSpecialExample example);

    StoreSpecial selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") StoreSpecial record, @Param("example") StoreSpecialExample example);

    int updateByExample(@Param("record") StoreSpecial record, @Param("example") StoreSpecialExample example);

    int updateByPrimaryKeySelective(StoreSpecial record);

    int updateByPrimaryKey(StoreSpecial record);
}