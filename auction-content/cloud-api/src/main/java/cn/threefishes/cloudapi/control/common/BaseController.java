package cn.threefishes.cloudapi.control.common;

import cn.threefishes.cloudrepository.entity.common.ResultEntity;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Date 2019/8/30 14:16
 * @Version 1.0
 **/
@Controller
public class BaseController {
    protected final Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HttpServletRequest request;


    /**
     * @return cn.threefishes.cloudrepository.entity.common.ResultEntity
     * @Author zw
     * @Description 返回成功实体
     * @Date 2019/8/30 10:02
     * @Param [datas]
     **/
    public ResultEntity getSuccessEntity(Object datas) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.SUCCESS);
        resultEntity.setMessage("操作成功");
        resultEntity.setData(datas);
        return resultEntity;
    }

    /**
     * @return
     * @Description 返回成功实体
     * @Date 2019/8/30 10:04
     * @Param
     **/
    public ResultEntity getSuccessEntity(String message, Object data) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.SUCCESS);
        resultEntity.setMessage(message);
        resultEntity.setData(data);
        return resultEntity;
    }

    /**
     * @return
     * @Description 返回成功实体
     * @Date 2019/8/30 10:04
     * @Param
     **/
    public ResultEntity getSuccessEntity(String message) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.SUCCESS);
        resultEntity.setMessage(message);
        return resultEntity;
    }

    /**
     * 获取失败返回实体
     *
     * @return
     */
    protected ResultEntity getErrorEntity() {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.FAIL);
        resultEntity.setMessage("操作失败");
        return resultEntity;
    }

    /**
     * 获取失败返回实体
     *
     * @param error
     * @return
     */
    protected ResultEntity getErrorEntity(String error) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.FAIL);
        resultEntity.setMessage(error);
        return resultEntity;
    }

    /**
     * 获取失败返回实体
     *
     * @param datas
     * @return
     */
    protected ResultEntity getErrorEntity(Object datas) {
        ResultEntity apiResultEntity = new ResultEntity();
        apiResultEntity.setCode(ResultEntity.FAIL);
        apiResultEntity.setMessage("操作失败");
        apiResultEntity.setData(datas);
        return apiResultEntity;
    }

    /**
     * 获取失败返回实体
     *
     * @param error
     * @return
     */
    protected ResultEntity getErrorEntity(String error, Object datas) {
        ResultEntity apiResultEntity = new ResultEntity();
        apiResultEntity.setCode(ResultEntity.FAIL);
        apiResultEntity.setMessage(error);
        apiResultEntity.setData(datas);
        return apiResultEntity;
    }

    /**
     * 获取登录失效
     * @return
     */
    protected ResultEntity getNoLoginEntity() {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.NO_LOGIN);
        resultEntity.setMessage("登录失效");
        return resultEntity;
    }

    /**
     * 签名验证失败的
     * @return
     */
    protected ResultEntity getSignErrorEntity() {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(ResultEntity.FAIL);
        resultEntity.setMessage("签名错误");
        return resultEntity;
    }
}
