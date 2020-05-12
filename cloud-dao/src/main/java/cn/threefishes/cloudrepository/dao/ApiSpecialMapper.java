package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiSpecial;
import cn.threefishes.cloudrepository.entity.ApiSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiSpecialMapper {
    long countByExample(ApiSpecialExample example);

    int deleteByExample(ApiSpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(ApiSpecial record);

    int insertSelective(ApiSpecial record);

    List<ApiSpecial> selectByExampleWithRowbounds(ApiSpecialExample example, RowBounds rowBounds);

    List<ApiSpecial> selectByExample(ApiSpecialExample example);

    ApiSpecial selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") ApiSpecial record, @Param("example") ApiSpecialExample example);

    int updateByExample(@Param("record") ApiSpecial record, @Param("example") ApiSpecialExample example);

    int updateByPrimaryKeySelective(ApiSpecial record);

    int updateByPrimaryKey(ApiSpecial record);
}