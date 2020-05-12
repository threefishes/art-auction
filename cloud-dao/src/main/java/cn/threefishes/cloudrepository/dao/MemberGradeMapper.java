package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MemberGrade;
import cn.threefishes.cloudrepository.entity.MemberGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MemberGradeMapper {
    long countByExample(MemberGradeExample example);

    int deleteByExample(MemberGradeExample example);

    int deleteByPrimaryKey(Integer gradeId);

    int insert(MemberGrade record);

    int insertSelective(MemberGrade record);

    List<MemberGrade> selectByExampleWithRowbounds(MemberGradeExample example, RowBounds rowBounds);

    List<MemberGrade> selectByExample(MemberGradeExample example);

    MemberGrade selectByPrimaryKey(Integer gradeId);

    int updateByExampleSelective(@Param("record") MemberGrade record, @Param("example") MemberGradeExample example);

    int updateByExample(@Param("record") MemberGrade record, @Param("example") MemberGradeExample example);

    int updateByPrimaryKeySelective(MemberGrade record);

    int updateByPrimaryKey(MemberGrade record);
}