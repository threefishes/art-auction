package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TfOdsUsersNumber;
import cn.threefishes.cloudrepository.entity.TfOdsUsersNumberExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TfOdsUsersNumberMapper {
    long countByExample(TfOdsUsersNumberExample example);

    int deleteByExample(TfOdsUsersNumberExample example);

    int deleteByPrimaryKey(Date datelist);

    int insert(TfOdsUsersNumber record);

    int insertSelective(TfOdsUsersNumber record);

    List<TfOdsUsersNumber> selectByExampleWithRowbounds(TfOdsUsersNumberExample example, RowBounds rowBounds);

    List<TfOdsUsersNumber> selectByExample(TfOdsUsersNumberExample example);

    TfOdsUsersNumber selectByPrimaryKey(Date datelist);

    int updateByExampleSelective(@Param("record") TfOdsUsersNumber record, @Param("example") TfOdsUsersNumberExample example);

    int updateByExample(@Param("record") TfOdsUsersNumber record, @Param("example") TfOdsUsersNumberExample example);

    int updateByPrimaryKeySelective(TfOdsUsersNumber record);

    int updateByPrimaryKey(TfOdsUsersNumber record);
}