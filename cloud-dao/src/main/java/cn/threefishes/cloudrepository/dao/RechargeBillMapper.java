package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.RechargeBill;
import cn.threefishes.cloudrepository.entity.RechargeBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RechargeBillMapper {
    long countByExample(RechargeBillExample example);

    int deleteByExample(RechargeBillExample example);

    int deleteByPrimaryKey(Integer billId);

    int insert(RechargeBill record);

    int insertSelective(RechargeBill record);

    List<RechargeBill> selectByExampleWithRowbounds(RechargeBillExample example, RowBounds rowBounds);

    List<RechargeBill> selectByExample(RechargeBillExample example);

    RechargeBill selectByPrimaryKey(Integer billId);

    int updateByExampleSelective(@Param("record") RechargeBill record, @Param("example") RechargeBillExample example);

    int updateByExample(@Param("record") RechargeBill record, @Param("example") RechargeBillExample example);

    int updateByPrimaryKeySelective(RechargeBill record);

    int updateByPrimaryKey(RechargeBill record);
}