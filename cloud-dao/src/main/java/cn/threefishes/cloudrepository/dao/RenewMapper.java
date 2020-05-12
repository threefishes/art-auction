package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Renew;
import cn.threefishes.cloudrepository.entity.RenewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RenewMapper {
    long countByExample(RenewExample example);

    int deleteByExample(RenewExample example);

    int deleteByPrimaryKey(Integer renewId);

    int insert(Renew record);

    int insertSelective(Renew record);

    List<Renew> selectByExampleWithRowbounds(RenewExample example, RowBounds rowBounds);

    List<Renew> selectByExample(RenewExample example);

    Renew selectByPrimaryKey(Integer renewId);

    int updateByExampleSelective(@Param("record") Renew record, @Param("example") RenewExample example);

    int updateByExample(@Param("record") Renew record, @Param("example") RenewExample example);

    int updateByPrimaryKeySelective(Renew record);

    int updateByPrimaryKey(Renew record);
}