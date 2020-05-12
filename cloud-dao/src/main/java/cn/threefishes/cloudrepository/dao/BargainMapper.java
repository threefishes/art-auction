package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Bargain;
import cn.threefishes.cloudrepository.entity.BargainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BargainMapper {
    long countByExample(BargainExample example);

    int deleteByExample(BargainExample example);

    int deleteByPrimaryKey(Integer bargainId);

    int insert(Bargain record);

    int insertSelective(Bargain record);

    List<Bargain> selectByExampleWithRowbounds(BargainExample example, RowBounds rowBounds);

    List<Bargain> selectByExample(BargainExample example);

    Bargain selectByPrimaryKey(Integer bargainId);

    int updateByExampleSelective(@Param("record") Bargain record, @Param("example") BargainExample example);

    int updateByExample(@Param("record") Bargain record, @Param("example") BargainExample example);

    int updateByPrimaryKeySelective(Bargain record);

    int updateByPrimaryKey(Bargain record);
}