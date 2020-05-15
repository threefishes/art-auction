package cn.threefishes.cloudservice.services;

import cn.threefishes.cloudrepository.dao.GeneralMyBatisMapper;
import cn.threefishes.cloudservice.serviceinterface.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @date 2019/8/29 13:52
 */
@Transactional(rollbackFor = Exception.class)
@Service
public abstract class BaseServiceImpl<T,E>  implements BaseService<T,E> {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private GeneralMyBatisMapper<T,E> mapper;

    public long countByExample(E example) {
        return mapper.countByExample(example);
    }

    public int deleteByExample(E example) {
        return mapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    public int insert(T record) {
        return mapper.insert(record);
    }

    public int insertSelective(T record) {
        return mapper.insertSelective(record);
    }


    public java.util.List<T> selectByExample(E example) {
        return mapper.selectByExample(example);
    }

    public T selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(T record, E example) {
        return mapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(T record, E example) {
        return mapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }
}
