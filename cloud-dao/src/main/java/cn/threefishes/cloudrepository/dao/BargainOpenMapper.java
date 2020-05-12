package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.BargainOpen;
import cn.threefishes.cloudrepository.entity.BargainOpenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BargainOpenMapper {
    long countByExample(BargainOpenExample example);

    int deleteByExample(BargainOpenExample example);

    int deleteByPrimaryKey(Integer openId);

    int insert(BargainOpen record);

    int insertSelective(BargainOpen record);

    List<BargainOpen> selectByExampleWithRowbounds(BargainOpenExample example, RowBounds rowBounds);

    List<BargainOpen> selectByExample(BargainOpenExample example);

    BargainOpen selectByPrimaryKey(Integer openId);

    int updateByExampleSelective(@Param("record") BargainOpen record, @Param("example") BargainOpenExample example);

    int updateByExample(@Param("record") BargainOpen record, @Param("example") BargainOpenExample example);

    int updateByPrimaryKeySelective(BargainOpen record);

    int updateByPrimaryKey(BargainOpen record);
}