package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TurntableLucklyDetail;
import cn.threefishes.cloudrepository.entity.TurntableLucklyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TurntableLucklyDetailMapper {
    long countByExample(TurntableLucklyDetailExample example);

    int deleteByExample(TurntableLucklyDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TurntableLucklyDetail record);

    int insertSelective(TurntableLucklyDetail record);

    List<TurntableLucklyDetail> selectByExampleWithRowbounds(TurntableLucklyDetailExample example, RowBounds rowBounds);

    List<TurntableLucklyDetail> selectByExample(TurntableLucklyDetailExample example);

    TurntableLucklyDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TurntableLucklyDetail record, @Param("example") TurntableLucklyDetailExample example);

    int updateByExample(@Param("record") TurntableLucklyDetail record, @Param("example") TurntableLucklyDetailExample example);

    int updateByPrimaryKeySelective(TurntableLucklyDetail record);

    int updateByPrimaryKey(TurntableLucklyDetail record);
}