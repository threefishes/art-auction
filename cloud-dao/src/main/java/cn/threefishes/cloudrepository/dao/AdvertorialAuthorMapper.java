package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.AdvertorialAuthor;
import cn.threefishes.cloudrepository.entity.AdvertorialAuthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface AdvertorialAuthorMapper {
    long countByExample(AdvertorialAuthorExample example);

    int deleteByExample(AdvertorialAuthorExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(AdvertorialAuthor record);

    int insertSelective(AdvertorialAuthor record);

    List<AdvertorialAuthor> selectByExampleWithRowbounds(AdvertorialAuthorExample example, RowBounds rowBounds);

    List<AdvertorialAuthor> selectByExample(AdvertorialAuthorExample example);

    AdvertorialAuthor selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") AdvertorialAuthor record, @Param("example") AdvertorialAuthorExample example);

    int updateByExample(@Param("record") AdvertorialAuthor record, @Param("example") AdvertorialAuthorExample example);

    int updateByPrimaryKeySelective(AdvertorialAuthor record);

    int updateByPrimaryKey(AdvertorialAuthor record);
}