package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MobileMemberCustom;
import cn.threefishes.cloudrepository.entity.MobileMemberCustomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MobileMemberCustomMapper {
    long countByExample(MobileMemberCustomExample example);

    int deleteByExample(MobileMemberCustomExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MobileMemberCustom record);

    int insertSelective(MobileMemberCustom record);

    List<MobileMemberCustom> selectByExampleWithRowbounds(MobileMemberCustomExample example, RowBounds rowBounds);

    List<MobileMemberCustom> selectByExample(MobileMemberCustomExample example);

    MobileMemberCustom selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MobileMemberCustom record, @Param("example") MobileMemberCustomExample example);

    int updateByExample(@Param("record") MobileMemberCustom record, @Param("example") MobileMemberCustomExample example);

    int updateByPrimaryKeySelective(MobileMemberCustom record);

    int updateByPrimaryKey(MobileMemberCustom record);
}