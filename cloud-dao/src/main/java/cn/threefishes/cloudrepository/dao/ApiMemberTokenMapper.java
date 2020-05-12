package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiMemberToken;
import cn.threefishes.cloudrepository.entity.ApiMemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiMemberTokenMapper {
    long countByExample(ApiMemberTokenExample example);

    int deleteByExample(ApiMemberTokenExample example);

    int deleteByPrimaryKey(Integer tokenId);

    int insert(ApiMemberToken record);

    int insertSelective(ApiMemberToken record);

    List<ApiMemberToken> selectByExampleWithRowbounds(ApiMemberTokenExample example, RowBounds rowBounds);

    List<ApiMemberToken> selectByExample(ApiMemberTokenExample example);

    ApiMemberToken selectByPrimaryKey(Integer tokenId);

    int updateByExampleSelective(@Param("record") ApiMemberToken record, @Param("example") ApiMemberTokenExample example);

    int updateByExample(@Param("record") ApiMemberToken record, @Param("example") ApiMemberTokenExample example);

    int updateByPrimaryKeySelective(ApiMemberToken record);

    int updateByPrimaryKey(ApiMemberToken record);
}