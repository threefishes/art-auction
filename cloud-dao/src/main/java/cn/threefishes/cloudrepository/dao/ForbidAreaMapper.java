package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ForbidArea;
import cn.threefishes.cloudrepository.entity.ForbidAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ForbidAreaMapper {
    long countByExample(ForbidAreaExample example);

    int deleteByExample(ForbidAreaExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ForbidArea record);

    int insertSelective(ForbidArea record);

    List<ForbidArea> selectByExampleWithRowbounds(ForbidAreaExample example, RowBounds rowBounds);

    List<ForbidArea> selectByExample(ForbidAreaExample example);

    ForbidArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForbidArea record, @Param("example") ForbidAreaExample example);

    int updateByExample(@Param("record") ForbidArea record, @Param("example") ForbidAreaExample example);

    int updateByPrimaryKeySelective(ForbidArea record);

    int updateByPrimaryKey(ForbidArea record);
}