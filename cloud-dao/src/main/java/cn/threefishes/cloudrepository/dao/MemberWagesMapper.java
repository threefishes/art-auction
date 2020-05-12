package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberWages;
import cn.threefishes.cloudrepository.entity.MemberWagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberWagesMapper {
    long countByExample(MemberWagesExample example);

    int deleteByExample(MemberWagesExample example);

    int deleteByPrimaryKey(Integer memberWagesId);

    int insert(MemberWages record);

    int insertSelective(MemberWages record);

    List<MemberWages> selectByExampleWithRowbounds(MemberWagesExample example, RowBounds rowBounds);

    List<MemberWages> selectByExample(MemberWagesExample example);

    MemberWages selectByPrimaryKey(Integer memberWagesId);

    int updateByExampleSelective(@Param("record") MemberWages record, @Param("example") MemberWagesExample example);

    int updateByExample(@Param("record") MemberWages record, @Param("example") MemberWagesExample example);

    int updateByPrimaryKeySelective(MemberWages record);

    int updateByPrimaryKey(MemberWages record);
}