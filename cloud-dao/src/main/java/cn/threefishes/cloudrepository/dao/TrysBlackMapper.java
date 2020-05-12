package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TrysBlack;
import cn.threefishes.cloudrepository.entity.TrysBlackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrysBlackMapper {
    long countByExample(TrysBlackExample example);

    int deleteByExample(TrysBlackExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(TrysBlack record);

    int insertSelective(TrysBlack record);

    List<TrysBlack> selectByExampleWithRowbounds(TrysBlackExample example, RowBounds rowBounds);

    List<TrysBlack> selectByExample(TrysBlackExample example);

    TrysBlack selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") TrysBlack record, @Param("example") TrysBlackExample example);

    int updateByExample(@Param("record") TrysBlack record, @Param("example") TrysBlackExample example);

    int updateByPrimaryKeySelective(TrysBlack record);

    int updateByPrimaryKey(TrysBlack record);
}