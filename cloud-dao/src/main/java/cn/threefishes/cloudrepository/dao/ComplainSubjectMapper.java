package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ComplainSubject;
import cn.threefishes.cloudrepository.entity.ComplainSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComplainSubjectMapper {
    long countByExample(ComplainSubjectExample example);

    int deleteByExample(ComplainSubjectExample example);

    int deleteByPrimaryKey(Integer subjectId);

    int insert(ComplainSubject record);

    int insertSelective(ComplainSubject record);

    List<ComplainSubject> selectByExampleWithRowbounds(ComplainSubjectExample example, RowBounds rowBounds);

    List<ComplainSubject> selectByExample(ComplainSubjectExample example);

    ComplainSubject selectByPrimaryKey(Integer subjectId);

    int updateByExampleSelective(@Param("record") ComplainSubject record, @Param("example") ComplainSubjectExample example);

    int updateByExample(@Param("record") ComplainSubject record, @Param("example") ComplainSubjectExample example);

    int updateByPrimaryKeySelective(ComplainSubject record);

    int updateByPrimaryKey(ComplainSubject record);
}