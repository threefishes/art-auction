package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DwExpress;
import cn.threefishes.cloudrepository.entity.DwExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DwExpressMapper {
    long countByExample(DwExpressExample example);

    int deleteByExample(DwExpressExample example);

    int deleteByPrimaryKey(Integer dwExpressId);

    int insert(DwExpress record);

    int insertSelective(DwExpress record);

    List<DwExpress> selectByExampleWithRowbounds(DwExpressExample example, RowBounds rowBounds);

    List<DwExpress> selectByExample(DwExpressExample example);

    DwExpress selectByPrimaryKey(Integer dwExpressId);

    int updateByExampleSelective(@Param("record") DwExpress record, @Param("example") DwExpressExample example);

    int updateByExample(@Param("record") DwExpress record, @Param("example") DwExpressExample example);

    int updateByPrimaryKeySelective(DwExpress record);

    int updateByPrimaryKey(DwExpress record);
}