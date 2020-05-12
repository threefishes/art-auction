package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Wxclickreply;
import cn.threefishes.cloudrepository.entity.WxclickreplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface WxclickreplyMapper {
    long countByExample(WxclickreplyExample example);

    int deleteByExample(WxclickreplyExample example);

    int deleteByPrimaryKey(Integer crId);

    int insert(Wxclickreply record);

    int insertSelective(Wxclickreply record);

    List<Wxclickreply> selectByExampleWithRowbounds(WxclickreplyExample example, RowBounds rowBounds);

    List<Wxclickreply> selectByExample(WxclickreplyExample example);

    Wxclickreply selectByPrimaryKey(Integer crId);

    int updateByExampleSelective(@Param("record") Wxclickreply record, @Param("example") WxclickreplyExample example);

    int updateByExample(@Param("record") Wxclickreply record, @Param("example") WxclickreplyExample example);

    int updateByPrimaryKeySelective(Wxclickreply record);

    int updateByPrimaryKey(Wxclickreply record);
}