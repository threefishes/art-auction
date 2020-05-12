package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SellerLog;
import cn.threefishes.cloudrepository.entity.SellerLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SellerLogMapper {
    long countByExample(SellerLogExample example);

    int deleteByExample(SellerLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(SellerLog record);

    int insertSelective(SellerLog record);

    List<SellerLog> selectByExampleWithRowbounds(SellerLogExample example, RowBounds rowBounds);

    List<SellerLog> selectByExample(SellerLogExample example);

    SellerLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") SellerLog record, @Param("example") SellerLogExample example);

    int updateByExample(@Param("record") SellerLog record, @Param("example") SellerLogExample example);

    int updateByPrimaryKeySelective(SellerLog record);

    int updateByPrimaryKey(SellerLog record);
}