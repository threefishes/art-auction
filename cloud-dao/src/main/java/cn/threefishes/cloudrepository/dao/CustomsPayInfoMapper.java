package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CustomsPayInfo;
import cn.threefishes.cloudrepository.entity.CustomsPayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CustomsPayInfoMapper {
    long countByExample(CustomsPayInfoExample example);

    int deleteByExample(CustomsPayInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomsPayInfo record);

    int insertSelective(CustomsPayInfo record);

    List<CustomsPayInfo> selectByExampleWithRowbounds(CustomsPayInfoExample example, RowBounds rowBounds);

    List<CustomsPayInfo> selectByExample(CustomsPayInfoExample example);

    CustomsPayInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomsPayInfo record, @Param("example") CustomsPayInfoExample example);

    int updateByExample(@Param("record") CustomsPayInfo record, @Param("example") CustomsPayInfoExample example);

    int updateByPrimaryKeySelective(CustomsPayInfo record);

    int updateByPrimaryKey(CustomsPayInfo record);
}