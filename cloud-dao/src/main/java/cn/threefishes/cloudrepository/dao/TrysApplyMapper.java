package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TrysApply;
import cn.threefishes.cloudrepository.entity.TrysApplyExample;
import cn.threefishes.cloudrepository.entity.TrysApplyWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrysApplyMapper {
    long countByExample(TrysApplyExample example);

    int deleteByExample(TrysApplyExample example);

    int deleteByPrimaryKey(Integer applyId);

    int insert(TrysApplyWithBLOBs record);

    int insertSelective(TrysApplyWithBLOBs record);

    List<TrysApplyWithBLOBs> selectByExampleWithBLOBsWithRowbounds(TrysApplyExample example, RowBounds rowBounds);

    List<TrysApplyWithBLOBs> selectByExampleWithBLOBs(TrysApplyExample example);

    List<TrysApply> selectByExampleWithRowbounds(TrysApplyExample example, RowBounds rowBounds);

    List<TrysApply> selectByExample(TrysApplyExample example);

    TrysApplyWithBLOBs selectByPrimaryKey(Integer applyId);

    int updateByExampleSelective(@Param("record") TrysApplyWithBLOBs record, @Param("example") TrysApplyExample example);

    int updateByExampleWithBLOBs(@Param("record") TrysApplyWithBLOBs record, @Param("example") TrysApplyExample example);

    int updateByExample(@Param("record") TrysApply record, @Param("example") TrysApplyExample example);

    int updateByPrimaryKeySelective(TrysApplyWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TrysApplyWithBLOBs record);

    int updateByPrimaryKey(TrysApply record);
}