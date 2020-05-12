package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.EvaluateGoods;
import cn.threefishes.cloudrepository.entity.EvaluateGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EvaluateGoodsMapper {
    long countByExample(EvaluateGoodsExample example);

    int deleteByExample(EvaluateGoodsExample example);

    int deleteByPrimaryKey(Integer evaluateId);

    int insert(EvaluateGoods record);

    int insertSelective(EvaluateGoods record);

    List<EvaluateGoods> selectByExampleWithRowbounds(EvaluateGoodsExample example, RowBounds rowBounds);

    List<EvaluateGoods> selectByExample(EvaluateGoodsExample example);

    EvaluateGoods selectByPrimaryKey(Integer evaluateId);

    int updateByExampleSelective(@Param("record") EvaluateGoods record, @Param("example") EvaluateGoodsExample example);

    int updateByExample(@Param("record") EvaluateGoods record, @Param("example") EvaluateGoodsExample example);

    int updateByPrimaryKeySelective(EvaluateGoods record);

    int updateByPrimaryKey(EvaluateGoods record);
}