package cn.threefishes.cloudservice.serviceinterface;

/**

 * @date 2019/8/29 13:43
 */
public interface BaseService<T,E> {

    public long countByExample(E example);

    public int deleteByExample(E example);

    public int deleteByPrimaryKey(Integer id);

    public int insert(T record);

    public int insertSelective(T record);


    public java.util.List<T> selectByExample(E example) ;

    public T selectByPrimaryKey(Integer id);

    public int updateByExampleSelective(T record, E example);

    public int updateByExample(T record, E example);

    public int updateByPrimaryKeySelective(T record);

    public int updateByPrimaryKey(T record);
}
