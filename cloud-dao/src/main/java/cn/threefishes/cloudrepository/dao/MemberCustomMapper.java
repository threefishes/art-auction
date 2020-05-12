package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberCustom;
import cn.threefishes.cloudrepository.entity.MemberCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberCustomMapper {
    long countByExample(MemberCustomExample example);

    int deleteByExample(MemberCustomExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberCustom record);

    int insertSelective(MemberCustom record);

    List<MemberCustom> selectByExampleWithRowbounds(MemberCustomExample example, RowBounds rowBounds);

    List<MemberCustom> selectByExample(MemberCustomExample example);

    MemberCustom selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MemberCustom record, @Param("example") MemberCustomExample example);

    int updateByExample(@Param("record") MemberCustom record, @Param("example") MemberCustomExample example);

    int updateByPrimaryKeySelective(MemberCustom record);

    int updateByPrimaryKey(MemberCustom record);
}