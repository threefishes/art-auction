package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShowOrdersZan;
import cn.threefishes.cloudrepository.entity.ShowOrdersZanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShowOrdersZanMapper {
    long countByExample(ShowOrdersZanExample example);

    int deleteByExample(ShowOrdersZanExample example);

    int deleteByPrimaryKey(Integer showOrdersReadId);

    int insert(ShowOrdersZan record);

    int insertSelective(ShowOrdersZan record);

    List<ShowOrdersZan> selectByExampleWithRowbounds(ShowOrdersZanExample example, RowBounds rowBounds);

    List<ShowOrdersZan> selectByExample(ShowOrdersZanExample example);

    ShowOrdersZan selectByPrimaryKey(Integer showOrdersReadId);

    int updateByExampleSelective(@Param("record") ShowOrdersZan record, @Param("example") ShowOrdersZanExample example);

    int updateByExample(@Param("record") ShowOrdersZan record, @Param("example") ShowOrdersZanExample example);

    int updateByPrimaryKeySelective(ShowOrdersZan record);

    int updateByPrimaryKey(ShowOrdersZan record);
}