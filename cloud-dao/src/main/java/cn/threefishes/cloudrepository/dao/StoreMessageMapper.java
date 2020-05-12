package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMessage;
import cn.threefishes.cloudrepository.entity.StoreMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMessageMapper {
    long countByExample(StoreMessageExample example);

    int deleteByExample(StoreMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(StoreMessage record);

    int insertSelective(StoreMessage record);

    List<StoreMessage> selectByExampleWithRowbounds(StoreMessageExample example, RowBounds rowBounds);

    List<StoreMessage> selectByExample(StoreMessageExample example);

    StoreMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") StoreMessage record, @Param("example") StoreMessageExample example);

    int updateByExample(@Param("record") StoreMessage record, @Param("example") StoreMessageExample example);

    int updateByPrimaryKeySelective(StoreMessage record);

    int updateByPrimaryKey(StoreMessage record);
}