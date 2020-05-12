package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Attribute;
import cn.threefishes.cloudrepository.entity.AttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AttributeMapper {
    long countByExample(AttributeExample example);

    int deleteByExample(AttributeExample example);

    int deleteByPrimaryKey(Integer attributeId);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    List<Attribute> selectByExampleWithRowbounds(AttributeExample example, RowBounds rowBounds);

    List<Attribute> selectByExample(AttributeExample example);

    Attribute selectByPrimaryKey(Integer attributeId);

    int updateByExampleSelective(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByExample(@Param("record") Attribute record, @Param("example") AttributeExample example);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);
}