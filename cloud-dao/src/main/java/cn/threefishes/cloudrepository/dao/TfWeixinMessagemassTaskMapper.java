package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfWeixinMessagemassTask;
import cn.threefishes.cloudrepository.entity.TfWeixinMessagemassTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfWeixinMessagemassTaskMapper {
    long countByExample(TfWeixinMessagemassTaskExample example);

    int deleteByExample(TfWeixinMessagemassTaskExample example);

    int deleteByPrimaryKey(Integer taskId);

    int insert(TfWeixinMessagemassTask record);

    int insertSelective(TfWeixinMessagemassTask record);

    List<TfWeixinMessagemassTask> selectByExampleWithRowbounds(TfWeixinMessagemassTaskExample example, RowBounds rowBounds);

    List<TfWeixinMessagemassTask> selectByExample(TfWeixinMessagemassTaskExample example);

    TfWeixinMessagemassTask selectByPrimaryKey(Integer taskId);

    int updateByExampleSelective(@Param("record") TfWeixinMessagemassTask record, @Param("example") TfWeixinMessagemassTaskExample example);

    int updateByExample(@Param("record") TfWeixinMessagemassTask record, @Param("example") TfWeixinMessagemassTaskExample example);

    int updateByPrimaryKeySelective(TfWeixinMessagemassTask record);

    int updateByPrimaryKey(TfWeixinMessagemassTask record);
}