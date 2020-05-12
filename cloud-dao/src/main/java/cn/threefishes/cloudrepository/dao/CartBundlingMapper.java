package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.CartBundling;
import cn.threefishes.cloudrepository.entity.CartBundlingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CartBundlingMapper {
    long countByExample(CartBundlingExample example);

    int deleteByExample(CartBundlingExample example);

    int deleteByPrimaryKey(Integer cartBundlingId);

    int insert(CartBundling record);

    int insertSelective(CartBundling record);

    List<CartBundling> selectByExampleWithRowbounds(CartBundlingExample example, RowBounds rowBounds);

    List<CartBundling> selectByExample(CartBundlingExample example);

    CartBundling selectByPrimaryKey(Integer cartBundlingId);

    int updateByExampleSelective(@Param("record") CartBundling record, @Param("example") CartBundlingExample example);

    int updateByExample(@Param("record") CartBundling record, @Param("example") CartBundlingExample example);

    int updateByPrimaryKeySelective(CartBundling record);

    int updateByPrimaryKey(CartBundling record);
}