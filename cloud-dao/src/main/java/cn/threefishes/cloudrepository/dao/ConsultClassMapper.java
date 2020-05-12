package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ConsultClass;
import cn.threefishes.cloudrepository.entity.ConsultClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ConsultClassMapper {
    long countByExample(ConsultClassExample example);

    int deleteByExample(ConsultClassExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ConsultClass record);

    int insertSelective(ConsultClass record);

    List<ConsultClass> selectByExampleWithRowbounds(ConsultClassExample example, RowBounds rowBounds);

    List<ConsultClass> selectByExample(ConsultClassExample example);

    ConsultClass selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ConsultClass record, @Param("example") ConsultClassExample example);

    int updateByExample(@Param("record") ConsultClass record, @Param("example") ConsultClassExample example);

    int updateByPrimaryKeySelective(ConsultClass record);

    int updateByPrimaryKey(ConsultClass record);
}