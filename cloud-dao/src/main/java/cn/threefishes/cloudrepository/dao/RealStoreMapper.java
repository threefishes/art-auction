package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RealStore;
import cn.threefishes.cloudrepository.entity.RealStoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RealStoreMapper {
    long countByExample(RealStoreExample example);

    int deleteByExample(RealStoreExample example);

    int deleteByPrimaryKey(Integer realStoreId);

    int insert(RealStore record);

    int insertSelective(RealStore record);

    List<RealStore> selectByExampleWithRowbounds(RealStoreExample example, RowBounds rowBounds);

    List<RealStore> selectByExample(RealStoreExample example);

    RealStore selectByPrimaryKey(Integer realStoreId);

    int updateByExampleSelective(@Param("record") RealStore record, @Param("example") RealStoreExample example);

    int updateByExample(@Param("record") RealStore record, @Param("example") RealStoreExample example);

    int updateByPrimaryKeySelective(RealStore record);

    int updateByPrimaryKey(RealStore record);
}