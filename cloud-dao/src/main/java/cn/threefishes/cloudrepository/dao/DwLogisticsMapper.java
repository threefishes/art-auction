package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.DwLogistics;
import cn.threefishes.cloudrepository.entity.DwLogisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DwLogisticsMapper {
    long countByExample(DwLogisticsExample example);

    int deleteByExample(DwLogisticsExample example);

    int deleteByPrimaryKey(String codeMgroup);

    int insert(DwLogistics record);

    int insertSelective(DwLogistics record);

    List<DwLogistics> selectByExampleWithRowbounds(DwLogisticsExample example, RowBounds rowBounds);

    List<DwLogistics> selectByExample(DwLogisticsExample example);

    DwLogistics selectByPrimaryKey(String codeMgroup);

    int updateByExampleSelective(@Param("record") DwLogistics record, @Param("example") DwLogisticsExample example);

    int updateByExample(@Param("record") DwLogistics record, @Param("example") DwLogisticsExample example);

    int updateByPrimaryKeySelective(DwLogistics record);

    int updateByPrimaryKey(DwLogistics record);
}