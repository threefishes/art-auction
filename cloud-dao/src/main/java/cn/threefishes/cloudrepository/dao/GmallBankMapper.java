package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.GmallBank;
import cn.threefishes.cloudrepository.entity.GmallBankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface GmallBankMapper {
    long countByExample(GmallBankExample example);

    int deleteByExample(GmallBankExample example);

    int deleteByPrimaryKey(Integer bankId);

    int insert(GmallBank record);

    int insertSelective(GmallBank record);

    List<GmallBank> selectByExampleWithRowbounds(GmallBankExample example, RowBounds rowBounds);

    List<GmallBank> selectByExample(GmallBankExample example);

    GmallBank selectByPrimaryKey(Integer bankId);

    int updateByExampleSelective(@Param("record") GmallBank record, @Param("example") GmallBankExample example);

    int updateByExample(@Param("record") GmallBank record, @Param("example") GmallBankExample example);

    int updateByPrimaryKeySelective(GmallBank record);

    int updateByPrimaryKey(GmallBank record);
}