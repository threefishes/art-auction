package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberReal;
import cn.threefishes.cloudrepository.entity.MemberRealExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberRealMapper {
    long countByExample(MemberRealExample example);

    int deleteByExample(MemberRealExample example);

    int deleteByPrimaryKey(Integer realId);

    int insert(MemberReal record);

    int insertSelective(MemberReal record);

    List<MemberReal> selectByExampleWithRowbounds(MemberRealExample example, RowBounds rowBounds);

    List<MemberReal> selectByExample(MemberRealExample example);

    MemberReal selectByPrimaryKey(Integer realId);

    int updateByExampleSelective(@Param("record") MemberReal record, @Param("example") MemberRealExample example);

    int updateByExample(@Param("record") MemberReal record, @Param("example") MemberRealExample example);

    int updateByPrimaryKeySelective(MemberReal record);

    int updateByPrimaryKey(MemberReal record);
}