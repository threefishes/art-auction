package cn.threefishes.cloudapi.control.activity;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.threefishes.cloudapi.vo.MemberVo;
import cn.threefishes.cloudservice.services.dto.*;
import cn.threefishes.cloudrepository.entity.common.ResultEntity;
import cn.threefishes.cloudservice.serviceinterface.HelloTvService;
import cn.threefishes.cloudcommon.util.ValueObConvert;


/**
 *  @author wy
 */
@RestController
public class HelloTvController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private HelloTvService helloTvService;

    /**
     * Test Hello Tv
     * @return
     */
    @RequestMapping(value = "activity/hellotv/hello")
    public ResultEntity hello(){
        return helloTvService.helloTv();
    }

    @RequestMapping(value = "activity/hellotv/hive")
    public ResultEntity saveMember(MemberVo mparam){
        MemberDTO m = new MemberDTO();
        try{
            ValueObConvert.convert(m,mparam);
        }catch(Exception exception){

        }
        return helloTvService.saveMember(m);
    }

}
