package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DwRunBook;
import cn.threefishes.cloudrepository.entity.DwRunBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DwRunBookMapper {
    long countByExample(DwRunBookExample example);

    int deleteByExample(DwRunBookExample example);

    int deleteByPrimaryKey(Integer runBookId);

    int insert(DwRunBook record);

    int insertSelective(DwRunBook record);

    List<DwRunBook> selectByExampleWithRowbounds(DwRunBookExample example, RowBounds rowBounds);

    List<DwRunBook> selectByExample(DwRunBookExample example);

    DwRunBook selectByPrimaryKey(Integer runBookId);

    int updateByExampleSelective(@Param("record") DwRunBook record, @Param("example") DwRunBookExample example);

    int updateByExample(@Param("record") DwRunBook record, @Param("example") DwRunBookExample example);

    int updateByPrimaryKeySelective(DwRunBook record);

    int updateByPrimaryKey(DwRunBook record);
}