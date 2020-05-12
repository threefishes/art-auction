package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ReconciliationMistake;
import cn.threefishes.cloudrepository.entity.ReconciliationMistakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ReconciliationMistakeMapper {
    long countByExample(ReconciliationMistakeExample example);

    int deleteByExample(ReconciliationMistakeExample example);

    int deleteByPrimaryKey(Integer mistakeId);

    int insert(ReconciliationMistake record);

    int insertSelective(ReconciliationMistake record);

    List<ReconciliationMistake> selectByExampleWithRowbounds(ReconciliationMistakeExample example, RowBounds rowBounds);

    List<ReconciliationMistake> selectByExample(ReconciliationMistakeExample example);

    ReconciliationMistake selectByPrimaryKey(Integer mistakeId);

    int updateByExampleSelective(@Param("record") ReconciliationMistake record, @Param("example") ReconciliationMistakeExample example);

    int updateByExample(@Param("record") ReconciliationMistake record, @Param("example") ReconciliationMistakeExample example);

    int updateByPrimaryKeySelective(ReconciliationMistake record);

    int updateByPrimaryKey(ReconciliationMistake record);
}