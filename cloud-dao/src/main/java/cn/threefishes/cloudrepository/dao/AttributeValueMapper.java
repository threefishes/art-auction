package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AttributeValue;
import cn.threefishes.cloudrepository.entity.AttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AttributeValueMapper {
    long countByExample(AttributeValueExample example);

    int deleteByExample(AttributeValueExample example);

    int deleteByPrimaryKey(Integer attributeValueId);

    int insert(AttributeValue record);

    int insertSelective(AttributeValue record);

    List<AttributeValue> selectByExampleWithRowbounds(AttributeValueExample example, RowBounds rowBounds);

    List<AttributeValue> selectByExample(AttributeValueExample example);

    AttributeValue selectByPrimaryKey(Integer attributeValueId);

    int updateByExampleSelective(@Param("record") AttributeValue record, @Param("example") AttributeValueExample example);

    int updateByExample(@Param("record") AttributeValue record, @Param("example") AttributeValueExample example);

    int updateByPrimaryKeySelective(AttributeValue record);

    int updateByPrimaryKey(AttributeValue record);
}