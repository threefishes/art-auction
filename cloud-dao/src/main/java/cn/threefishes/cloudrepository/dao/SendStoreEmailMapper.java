package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SendStoreEmail;
import cn.threefishes.cloudrepository.entity.SendStoreEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SendStoreEmailMapper {
    long countByExample(SendStoreEmailExample example);

    int deleteByExample(SendStoreEmailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SendStoreEmail record);

    int insertSelective(SendStoreEmail record);

    List<SendStoreEmail> selectByExampleWithRowbounds(SendStoreEmailExample example, RowBounds rowBounds);

    List<SendStoreEmail> selectByExample(SendStoreEmailExample example);

    SendStoreEmail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SendStoreEmail record, @Param("example") SendStoreEmailExample example);

    int updateByExample(@Param("record") SendStoreEmail record, @Param("example") SendStoreEmailExample example);

    int updateByPrimaryKeySelective(SendStoreEmail record);

    int updateByPrimaryKey(SendStoreEmail record);
}