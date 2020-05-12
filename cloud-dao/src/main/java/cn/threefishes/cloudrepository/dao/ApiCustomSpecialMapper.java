package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ApiCustomSpecial;
import cn.threefishes.cloudrepository.entity.ApiCustomSpecialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ApiCustomSpecialMapper {
    long countByExample(ApiCustomSpecialExample example);

    int deleteByExample(ApiCustomSpecialExample example);

    int deleteByPrimaryKey(Integer specialId);

    int insert(ApiCustomSpecial record);

    int insertSelective(ApiCustomSpecial record);

    List<ApiCustomSpecial> selectByExampleWithBLOBsWithRowbounds(ApiCustomSpecialExample example, RowBounds rowBounds);

    List<ApiCustomSpecial> selectByExampleWithBLOBs(ApiCustomSpecialExample example);

    List<ApiCustomSpecial> selectByExampleWithRowbounds(ApiCustomSpecialExample example, RowBounds rowBounds);

    List<ApiCustomSpecial> selectByExample(ApiCustomSpecialExample example);

    ApiCustomSpecial selectByPrimaryKey(Integer specialId);

    int updateByExampleSelective(@Param("record") ApiCustomSpecial record, @Param("example") ApiCustomSpecialExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiCustomSpecial record, @Param("example") ApiCustomSpecialExample example);

    int updateByExample(@Param("record") ApiCustomSpecial record, @Param("example") ApiCustomSpecialExample example);

    int updateByPrimaryKeySelective(ApiCustomSpecial record);

    int updateByPrimaryKeyWithBLOBs(ApiCustomSpecial record);

    int updateByPrimaryKey(ApiCustomSpecial record);
}