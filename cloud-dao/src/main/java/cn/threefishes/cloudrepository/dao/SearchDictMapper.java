package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.SearchDict;
import cn.threefishes.cloudrepository.entity.SearchDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SearchDictMapper {
    long countByExample(SearchDictExample example);

    int deleteByExample(SearchDictExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(SearchDict record);

    int insertSelective(SearchDict record);

    List<SearchDict> selectByExampleWithRowbounds(SearchDictExample example, RowBounds rowBounds);

    List<SearchDict> selectByExample(SearchDictExample example);

    SearchDict selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") SearchDict record, @Param("example") SearchDictExample example);

    int updateByExample(@Param("record") SearchDict record, @Param("example") SearchDictExample example);

    int updateByPrimaryKeySelective(SearchDict record);

    int updateByPrimaryKey(SearchDict record);
}