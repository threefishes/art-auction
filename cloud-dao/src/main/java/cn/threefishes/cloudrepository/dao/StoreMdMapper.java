package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMd;
import cn.threefishes.cloudrepository.entity.StoreMdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMdMapper {
    long countByExample(StoreMdExample example);

    int deleteByExample(StoreMdExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreMd record);

    int insertSelective(StoreMd record);

    List<StoreMd> selectByExampleWithRowbounds(StoreMdExample example, RowBounds rowBounds);

    List<StoreMd> selectByExample(StoreMdExample example);

    StoreMd selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") StoreMd record, @Param("example") StoreMdExample example);

    int updateByExample(@Param("record") StoreMd record, @Param("example") StoreMdExample example);

    int updateByPrimaryKeySelective(StoreMd record);

    int updateByPrimaryKey(StoreMd record);
}