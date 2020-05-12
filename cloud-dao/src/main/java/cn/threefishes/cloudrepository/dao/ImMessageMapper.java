package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ImMessage;
import cn.threefishes.cloudrepository.entity.ImMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ImMessageMapper {
    long countByExample(ImMessageExample example);

    int deleteByExample(ImMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(ImMessage record);

    int insertSelective(ImMessage record);

    List<ImMessage> selectByExampleWithRowbounds(ImMessageExample example, RowBounds rowBounds);

    List<ImMessage> selectByExample(ImMessageExample example);

    ImMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") ImMessage record, @Param("example") ImMessageExample example);

    int updateByExample(@Param("record") ImMessage record, @Param("example") ImMessageExample example);

    int updateByPrimaryKeySelective(ImMessage record);

    int updateByPrimaryKey(ImMessage record);
}