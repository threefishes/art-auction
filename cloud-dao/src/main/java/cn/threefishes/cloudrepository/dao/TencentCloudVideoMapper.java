package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.TencentCloudVideo;
import cn.threefishes.cloudrepository.entity.TencentCloudVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TencentCloudVideoMapper {
    long countByExample(TencentCloudVideoExample example);

    int deleteByExample(TencentCloudVideoExample example);

    int deleteByPrimaryKey(Integer dwid);

    int insert(TencentCloudVideo record);

    int insertSelective(TencentCloudVideo record);

    List<TencentCloudVideo> selectByExampleWithRowbounds(TencentCloudVideoExample example, RowBounds rowBounds);

    List<TencentCloudVideo> selectByExample(TencentCloudVideoExample example);

    TencentCloudVideo selectByPrimaryKey(Integer dwid);

    int updateByExampleSelective(@Param("record") TencentCloudVideo record, @Param("example") TencentCloudVideoExample example);

    int updateByExample(@Param("record") TencentCloudVideo record, @Param("example") TencentCloudVideoExample example);

    int updateByPrimaryKeySelective(TencentCloudVideo record);

    int updateByPrimaryKey(TencentCloudVideo record);
}