package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberDislike;
import cn.threefishes.cloudrepository.entity.MemberDislikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberDislikeMapper {
    long countByExample(MemberDislikeExample example);

    int deleteByExample(MemberDislikeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MemberDislike record);

    int insertSelective(MemberDislike record);

    List<MemberDislike> selectByExampleWithRowbounds(MemberDislikeExample example, RowBounds rowBounds);

    List<MemberDislike> selectByExample(MemberDislikeExample example);

    MemberDislike selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MemberDislike record, @Param("example") MemberDislikeExample example);

    int updateByExample(@Param("record") MemberDislike record, @Param("example") MemberDislikeExample example);

    int updateByPrimaryKeySelective(MemberDislike record);

    int updateByPrimaryKey(MemberDislike record);
}