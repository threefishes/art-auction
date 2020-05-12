package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ComplainTalk;
import cn.threefishes.cloudrepository.entity.ComplainTalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComplainTalkMapper {
    long countByExample(ComplainTalkExample example);

    int deleteByExample(ComplainTalkExample example);

    int deleteByPrimaryKey(Integer talkId);

    int insert(ComplainTalk record);

    int insertSelective(ComplainTalk record);

    List<ComplainTalk> selectByExampleWithRowbounds(ComplainTalkExample example, RowBounds rowBounds);

    List<ComplainTalk> selectByExample(ComplainTalkExample example);

    ComplainTalk selectByPrimaryKey(Integer talkId);

    int updateByExampleSelective(@Param("record") ComplainTalk record, @Param("example") ComplainTalkExample example);

    int updateByExample(@Param("record") ComplainTalk record, @Param("example") ComplainTalkExample example);

    int updateByPrimaryKeySelective(ComplainTalk record);

    int updateByPrimaryKey(ComplainTalk record);
}