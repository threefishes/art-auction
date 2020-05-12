package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ArticlePosition;
import cn.threefishes.cloudrepository.entity.ArticlePositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ArticlePositionMapper {
    long countByExample(ArticlePositionExample example);

    int deleteByExample(ArticlePositionExample example);

    int deleteByPrimaryKey(Integer positionId);

    int insert(ArticlePosition record);

    int insertSelective(ArticlePosition record);

    List<ArticlePosition> selectByExampleWithRowbounds(ArticlePositionExample example, RowBounds rowBounds);

    List<ArticlePosition> selectByExample(ArticlePositionExample example);

    ArticlePosition selectByPrimaryKey(Integer positionId);

    int updateByExampleSelective(@Param("record") ArticlePosition record, @Param("example") ArticlePositionExample example);

    int updateByExample(@Param("record") ArticlePosition record, @Param("example") ArticlePositionExample example);

    int updateByPrimaryKeySelective(ArticlePosition record);

    int updateByPrimaryKey(ArticlePosition record);
}