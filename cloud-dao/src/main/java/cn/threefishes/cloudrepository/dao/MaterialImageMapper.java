package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.MaterialImage;
import cn.threefishes.cloudrepository.entity.MaterialImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MaterialImageMapper {
    long countByExample(MaterialImageExample example);

    int deleteByExample(MaterialImageExample example);

    int deleteByPrimaryKey(Long materialImageId);

    int insert(MaterialImage record);

    int insertSelective(MaterialImage record);

    List<MaterialImage> selectByExampleWithRowbounds(MaterialImageExample example, RowBounds rowBounds);

    List<MaterialImage> selectByExample(MaterialImageExample example);

    MaterialImage selectByPrimaryKey(Long materialImageId);

    int updateByExampleSelective(@Param("record") MaterialImage record, @Param("example") MaterialImageExample example);

    int updateByExample(@Param("record") MaterialImage record, @Param("example") MaterialImageExample example);

    int updateByPrimaryKeySelective(MaterialImage record);

    int updateByPrimaryKey(MaterialImage record);
}