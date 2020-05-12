package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SellerGroup;
import cn.threefishes.cloudrepository.entity.SellerGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SellerGroupMapper {
    long countByExample(SellerGroupExample example);

    int deleteByExample(SellerGroupExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(SellerGroup record);

    int insertSelective(SellerGroup record);

    List<SellerGroup> selectByExampleWithRowbounds(SellerGroupExample example, RowBounds rowBounds);

    List<SellerGroup> selectByExample(SellerGroupExample example);

    SellerGroup selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") SellerGroup record, @Param("example") SellerGroupExample example);

    int updateByExample(@Param("record") SellerGroup record, @Param("example") SellerGroupExample example);

    int updateByPrimaryKeySelective(SellerGroup record);

    int updateByPrimaryKey(SellerGroup record);
}