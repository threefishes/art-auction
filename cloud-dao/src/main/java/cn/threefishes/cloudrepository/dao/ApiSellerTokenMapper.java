package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiSellerToken;
import cn.threefishes.cloudrepository.entity.ApiSellerTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiSellerTokenMapper {
    long countByExample(ApiSellerTokenExample example);

    int deleteByExample(ApiSellerTokenExample example);

    int deleteByPrimaryKey(Integer tokenId);

    int insert(ApiSellerToken record);

    int insertSelective(ApiSellerToken record);

    List<ApiSellerToken> selectByExampleWithRowbounds(ApiSellerTokenExample example, RowBounds rowBounds);

    List<ApiSellerToken> selectByExample(ApiSellerTokenExample example);

    ApiSellerToken selectByPrimaryKey(Integer tokenId);

    int updateByExampleSelective(@Param("record") ApiSellerToken record, @Param("example") ApiSellerTokenExample example);

    int updateByExample(@Param("record") ApiSellerToken record, @Param("example") ApiSellerTokenExample example);

    int updateByPrimaryKeySelective(ApiSellerToken record);

    int updateByPrimaryKey(ApiSellerToken record);
}