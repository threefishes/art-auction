package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CustomsRealTimeDataUp;
import cn.threefishes.cloudrepository.entity.CustomsRealTimeDataUpExample;
import cn.threefishes.cloudrepository.entity.CustomsRealTimeDataUpWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomsRealTimeDataUpMapper {
    long countByExample(CustomsRealTimeDataUpExample example);

    int deleteByExample(CustomsRealTimeDataUpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomsRealTimeDataUpWithBLOBs record);

    int insertSelective(CustomsRealTimeDataUpWithBLOBs record);

    List<CustomsRealTimeDataUpWithBLOBs> selectByExampleWithBLOBsWithRowbounds(CustomsRealTimeDataUpExample example, RowBounds rowBounds);

    List<CustomsRealTimeDataUpWithBLOBs> selectByExampleWithBLOBs(CustomsRealTimeDataUpExample example);

    List<CustomsRealTimeDataUp> selectByExampleWithRowbounds(CustomsRealTimeDataUpExample example, RowBounds rowBounds);

    List<CustomsRealTimeDataUp> selectByExample(CustomsRealTimeDataUpExample example);

    CustomsRealTimeDataUpWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomsRealTimeDataUpWithBLOBs record, @Param("example") CustomsRealTimeDataUpExample example);

    int updateByExampleWithBLOBs(@Param("record") CustomsRealTimeDataUpWithBLOBs record, @Param("example") CustomsRealTimeDataUpExample example);

    int updateByExample(@Param("record") CustomsRealTimeDataUp record, @Param("example") CustomsRealTimeDataUpExample example);

    int updateByPrimaryKeySelective(CustomsRealTimeDataUpWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CustomsRealTimeDataUpWithBLOBs record);

    int updateByPrimaryKey(CustomsRealTimeDataUp record);
}