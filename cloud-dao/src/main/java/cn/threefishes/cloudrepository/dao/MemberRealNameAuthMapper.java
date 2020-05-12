package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberRealNameAuth;
import cn.threefishes.cloudrepository.entity.MemberRealNameAuthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberRealNameAuthMapper {
    long countByExample(MemberRealNameAuthExample example);

    int deleteByExample(MemberRealNameAuthExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberRealNameAuth record);

    int insertSelective(MemberRealNameAuth record);

    List<MemberRealNameAuth> selectByExampleWithRowbounds(MemberRealNameAuthExample example, RowBounds rowBounds);

    List<MemberRealNameAuth> selectByExample(MemberRealNameAuthExample example);

    MemberRealNameAuth selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MemberRealNameAuth record, @Param("example") MemberRealNameAuthExample example);

    int updateByExample(@Param("record") MemberRealNameAuth record, @Param("example") MemberRealNameAuthExample example);

    int updateByPrimaryKeySelective(MemberRealNameAuth record);

    int updateByPrimaryKey(MemberRealNameAuth record);
}