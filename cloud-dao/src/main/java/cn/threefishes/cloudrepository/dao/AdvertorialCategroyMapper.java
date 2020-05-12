package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialCategroy;
import cn.threefishes.cloudrepository.entity.AdvertorialCategroyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialCategroyMapper {
    long countByExample(AdvertorialCategroyExample example);

    int deleteByExample(AdvertorialCategroyExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(AdvertorialCategroy record);

    int insertSelective(AdvertorialCategroy record);

    List<AdvertorialCategroy> selectByExampleWithRowbounds(AdvertorialCategroyExample example, RowBounds rowBounds);

    List<AdvertorialCategroy> selectByExample(AdvertorialCategroyExample example);

    AdvertorialCategroy selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") AdvertorialCategroy record, @Param("example") AdvertorialCategroyExample example);

    int updateByExample(@Param("record") AdvertorialCategroy record, @Param("example") AdvertorialCategroyExample example);

    int updateByPrimaryKeySelective(AdvertorialCategroy record);

    int updateByPrimaryKey(AdvertorialCategroy record);
}