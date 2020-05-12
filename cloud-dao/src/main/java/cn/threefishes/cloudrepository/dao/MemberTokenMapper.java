package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberToken;
import cn.threefishes.cloudrepository.entity.MemberTokenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberTokenMapper {
    long countByExample(MemberTokenExample example);

    int deleteByExample(MemberTokenExample example);

    int deleteByPrimaryKey(Integer tokenId);

    int insert(MemberToken record);

    int insertSelective(MemberToken record);

    List<MemberToken> selectByExampleWithRowbounds(MemberTokenExample example, RowBounds rowBounds);

    List<MemberToken> selectByExample(MemberTokenExample example);

    MemberToken selectByPrimaryKey(Integer tokenId);

    int updateByExampleSelective(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    int updateByExample(@Param("record") MemberToken record, @Param("example") MemberTokenExample example);

    int updateByPrimaryKeySelective(MemberToken record);

    int updateByPrimaryKey(MemberToken record);
}