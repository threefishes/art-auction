package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Trys;
import cn.threefishes.cloudrepository.entity.TrysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrysMapper {
    long countByExample(TrysExample example);

    int deleteByExample(TrysExample example);

    int deleteByPrimaryKey(Integer trysId);

    int insert(Trys record);

    int insertSelective(Trys record);

    List<Trys> selectByExampleWithBLOBsWithRowbounds(TrysExample example, RowBounds rowBounds);

    List<Trys> selectByExampleWithBLOBs(TrysExample example);

    List<Trys> selectByExampleWithRowbounds(TrysExample example, RowBounds rowBounds);

    List<Trys> selectByExample(TrysExample example);

    Trys selectByPrimaryKey(Integer trysId);

    int updateByExampleSelective(@Param("record") Trys record, @Param("example") TrysExample example);

    int updateByExampleWithBLOBs(@Param("record") Trys record, @Param("example") TrysExample example);

    int updateByExample(@Param("record") Trys record, @Param("example") TrysExample example);

    int updateByPrimaryKeySelective(Trys record);

    int updateByPrimaryKeyWithBLOBs(Trys record);

    int updateByPrimaryKey(Trys record);
}