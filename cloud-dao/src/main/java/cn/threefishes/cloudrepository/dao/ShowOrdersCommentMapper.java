package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersComment;
import cn.threefishes.cloudrepository.entity.ShowOrdersCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersCommentMapper {
    long countByExample(ShowOrdersCommentExample example);

    int deleteByExample(ShowOrdersCommentExample example);

    int deleteByPrimaryKey(Integer commentId);

    int insert(ShowOrdersComment record);

    int insertSelective(ShowOrdersComment record);

    List<ShowOrdersComment> selectByExampleWithRowbounds(ShowOrdersCommentExample example, RowBounds rowBounds);

    List<ShowOrdersComment> selectByExample(ShowOrdersCommentExample example);

    ShowOrdersComment selectByPrimaryKey(Integer commentId);

    int updateByExampleSelective(@Param("record") ShowOrdersComment record, @Param("example") ShowOrdersCommentExample example);

    int updateByExample(@Param("record") ShowOrdersComment record, @Param("example") ShowOrdersCommentExample example);

    int updateByPrimaryKeySelective(ShowOrdersComment record);

    int updateByPrimaryKey(ShowOrdersComment record);
}