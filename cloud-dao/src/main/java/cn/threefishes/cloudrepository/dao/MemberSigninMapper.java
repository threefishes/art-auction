package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberSignin;
import cn.threefishes.cloudrepository.entity.MemberSigninExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberSigninMapper {
    long countByExample(MemberSigninExample example);

    int deleteByExample(MemberSigninExample example);

    int deleteByPrimaryKey(Integer signinId);

    int insert(MemberSignin record);

    int insertSelective(MemberSignin record);

    List<MemberSignin> selectByExampleWithRowbounds(MemberSigninExample example, RowBounds rowBounds);

    List<MemberSignin> selectByExample(MemberSigninExample example);

    MemberSignin selectByPrimaryKey(Integer signinId);

    int updateByExampleSelective(@Param("record") MemberSignin record, @Param("example") MemberSigninExample example);

    int updateByExample(@Param("record") MemberSignin record, @Param("example") MemberSigninExample example);

    int updateByPrimaryKeySelective(MemberSignin record);

    int updateByPrimaryKey(MemberSignin record);
}