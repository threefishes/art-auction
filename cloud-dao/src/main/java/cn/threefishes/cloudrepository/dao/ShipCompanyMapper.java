package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ShipCompany;
import cn.threefishes.cloudrepository.entity.ShipCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ShipCompanyMapper {
    long countByExample(ShipCompanyExample example);

    int deleteByExample(ShipCompanyExample example);

    int deleteByPrimaryKey(Integer shipId);

    int insert(ShipCompany record);

    int insertSelective(ShipCompany record);

    List<ShipCompany> selectByExampleWithRowbounds(ShipCompanyExample example, RowBounds rowBounds);

    List<ShipCompany> selectByExample(ShipCompanyExample example);

    ShipCompany selectByPrimaryKey(Integer shipId);

    int updateByExampleSelective(@Param("record") ShipCompany record, @Param("example") ShipCompanyExample example);

    int updateByExample(@Param("record") ShipCompany record, @Param("example") ShipCompanyExample example);

    int updateByPrimaryKeySelective(ShipCompany record);

    int updateByPrimaryKey(ShipCompany record);
}