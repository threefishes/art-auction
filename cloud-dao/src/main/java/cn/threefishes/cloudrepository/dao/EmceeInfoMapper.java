package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EmceeInfo;
import cn.threefishes.cloudrepository.entity.EmceeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EmceeInfoMapper {
    long countByExample(EmceeInfoExample example);

    int deleteByExample(EmceeInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmceeInfo record);

    int insertSelective(EmceeInfo record);

    List<EmceeInfo> selectByExampleWithRowbounds(EmceeInfoExample example, RowBounds rowBounds);

    List<EmceeInfo> selectByExample(EmceeInfoExample example);

    EmceeInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmceeInfo record, @Param("example") EmceeInfoExample example);

    int updateByExample(@Param("record") EmceeInfo record, @Param("example") EmceeInfoExample example);

    int updateByPrimaryKeySelective(EmceeInfo record);

    int updateByPrimaryKey(EmceeInfo record);
}