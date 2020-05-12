package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.StoreMobile;
import cn.threefishes.cloudrepository.entity.StoreMobileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StoreMobileMapper {
    long countByExample(StoreMobileExample example);

    int deleteByExample(StoreMobileExample example);

    int deleteByPrimaryKey(Integer storeId);

    int insert(StoreMobile record);

    int insertSelective(StoreMobile record);

    List<StoreMobile> selectByExampleWithRowbounds(StoreMobileExample example, RowBounds rowBounds);

    List<StoreMobile> selectByExample(StoreMobileExample example);

    StoreMobile selectByPrimaryKey(Integer storeId);

    int updateByExampleSelective(@Param("record") StoreMobile record, @Param("example") StoreMobileExample example);

    int updateByExample(@Param("record") StoreMobile record, @Param("example") StoreMobileExample example);

    int updateByPrimaryKeySelective(StoreMobile record);

    int updateByPrimaryKey(StoreMobile record);
}