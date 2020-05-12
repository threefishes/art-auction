package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.Discount;
import cn.threefishes.cloudrepository.entity.DiscountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DiscountMapper {
    long countByExample(DiscountExample example);

    int deleteByExample(DiscountExample example);

    int deleteByPrimaryKey(Integer discountId);

    int insert(Discount record);

    int insertSelective(Discount record);

    List<Discount> selectByExampleWithRowbounds(DiscountExample example, RowBounds rowBounds);

    List<Discount> selectByExample(DiscountExample example);

    Discount selectByPrimaryKey(Integer discountId);

    int updateByExampleSelective(@Param("record") Discount record, @Param("example") DiscountExample example);

    int updateByExample(@Param("record") Discount record, @Param("example") DiscountExample example);

    int updateByPrimaryKeySelective(Discount record);

    int updateByPrimaryKey(Discount record);
}