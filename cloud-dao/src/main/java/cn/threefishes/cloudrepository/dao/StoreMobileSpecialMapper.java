package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMobileSpecial;
import cn.threefishes.cloudrepository.entity.StoreMobileSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMobileSpecialMapper {
    long countByExample(StoreMobileSpecialExample example);

    int deleteByExample(StoreMobileSpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(StoreMobileSpecial record);

    int insertSelective(StoreMobileSpecial record);

    List<StoreMobileSpecial> selectByExampleWithRowbounds(StoreMobileSpecialExample example, RowBounds rowBounds);

    List<StoreMobileSpecial> selectByExample(StoreMobileSpecialExample example);

    StoreMobileSpecial selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") StoreMobileSpecial record, @Param("example") StoreMobileSpecialExample example);

    int updateByExample(@Param("record") StoreMobileSpecial record, @Param("example") StoreMobileSpecialExample example);

    int updateByPrimaryKeySelective(StoreMobileSpecial record);

    int updateByPrimaryKey(StoreMobileSpecial record);
}