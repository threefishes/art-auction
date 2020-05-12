package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberMessage;
import cn.threefishes.cloudrepository.entity.MemberMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberMessageMapper {
    long countByExample(MemberMessageExample example);

    int deleteByExample(MemberMessageExample example);

    int deleteByPrimaryKey(Integer messageId);

    int insert(MemberMessage record);

    int insertSelective(MemberMessage record);

    List<MemberMessage> selectByExampleWithRowbounds(MemberMessageExample example, RowBounds rowBounds);

    List<MemberMessage> selectByExample(MemberMessageExample example);

    MemberMessage selectByPrimaryKey(Integer messageId);

    int updateByExampleSelective(@Param("record") MemberMessage record, @Param("example") MemberMessageExample example);

    int updateByExample(@Param("record") MemberMessage record, @Param("example") MemberMessageExample example);

    int updateByPrimaryKeySelective(MemberMessage record);

    int updateByPrimaryKey(MemberMessage record);
}