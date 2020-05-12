package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Complain;
import cn.threefishes.cloudrepository.entity.ComplainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer complainId);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExampleWithRowbounds(ComplainExample example, RowBounds rowBounds);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(Integer complainId);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKey(Complain record);
}