package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Sensitives;
import cn.threefishes.cloudrepository.entity.SensitivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SensitivesMapper {
    long countByExample(SensitivesExample example);

    int deleteByExample(SensitivesExample example);

    int deleteByPrimaryKey(Integer sensitiveId);

    int insert(Sensitives record);

    int insertSelective(Sensitives record);

    List<Sensitives> selectByExampleWithRowbounds(SensitivesExample example, RowBounds rowBounds);

    List<Sensitives> selectByExample(SensitivesExample example);

    Sensitives selectByPrimaryKey(Integer sensitiveId);

    int updateByExampleSelective(@Param("record") Sensitives record, @Param("example") SensitivesExample example);

    int updateByExample(@Param("record") Sensitives record, @Param("example") SensitivesExample example);

    int updateByPrimaryKeySelective(Sensitives record);

    int updateByPrimaryKey(Sensitives record);
}