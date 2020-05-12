package cn.threefishes.cloudrepository.dao;

import cn.threefishes.cloudrepository.entity.VoucherTemplate;
import cn.threefishes.cloudrepository.entity.VoucherTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface VoucherTemplateMapper {
    long countByExample(VoucherTemplateExample example);

    int deleteByExample(VoucherTemplateExample example);

    int deleteByPrimaryKey(Integer templateId);

    int insert(VoucherTemplate record);

    int insertSelective(VoucherTemplate record);

    List<VoucherTemplate> selectByExampleWithRowbounds(VoucherTemplateExample example, RowBounds rowBounds);

    List<VoucherTemplate> selectByExample(VoucherTemplateExample example);

    VoucherTemplate selectByPrimaryKey(Integer templateId);

    int updateByExampleSelective(@Param("record") VoucherTemplate record, @Param("example") VoucherTemplateExample example);

    int updateByExample(@Param("record") VoucherTemplate record, @Param("example") VoucherTemplateExample example);

    int updateByPrimaryKeySelective(VoucherTemplate record);

    int updateByPrimaryKey(VoucherTemplate record);
}