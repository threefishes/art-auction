package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.ComboGoods;
import cn.threefishes.cloudrepository.entity.ComboGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ComboGoodsMapper {
    long countByExample(ComboGoodsExample example);

    int deleteByExample(ComboGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComboGoods record);

    int insertSelective(ComboGoods record);

    List<ComboGoods> selectByExampleWithRowbounds(ComboGoodsExample example, RowBounds rowBounds);

    List<ComboGoods> selectByExample(ComboGoodsExample example);

    ComboGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComboGoods record, @Param("example") ComboGoodsExample example);

    int updateByExample(@Param("record") ComboGoods record, @Param("example") ComboGoodsExample example);

    int updateByPrimaryKeySelective(ComboGoods record);

    int updateByPrimaryKey(ComboGoods record);
}