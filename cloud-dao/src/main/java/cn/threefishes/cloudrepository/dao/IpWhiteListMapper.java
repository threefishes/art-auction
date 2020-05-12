package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.IpWhiteList;
import cn.threefishes.cloudrepository.entity.IpWhiteListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IpWhiteListMapper {
    long countByExample(IpWhiteListExample example);

    int deleteByExample(IpWhiteListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpWhiteList record);

    int insertSelective(IpWhiteList record);

    List<IpWhiteList> selectByExampleWithRowbounds(IpWhiteListExample example, RowBounds rowBounds);

    List<IpWhiteList> selectByExample(IpWhiteListExample example);

    IpWhiteList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpWhiteList record, @Param("example") IpWhiteListExample example);

    int updateByExample(@Param("record") IpWhiteList record, @Param("example") IpWhiteListExample example);

    int updateByPrimaryKeySelective(IpWhiteList record);

    int updateByPrimaryKey(IpWhiteList record);
}