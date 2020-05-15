package cn.threefishes.cloudapi.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @ClassName SysLogAspect
 * @Description 操作日志切面定义
 * @Date 2019/8/30 11:12
 * @Version 1.0
 **/
@Aspect
@Component
@Lazy
public class SysLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(SysLogAspect.class);

    @Pointcut("@annotation(cn.threefishes.cloudservice.annotation.SystemLog)")
    public void sysLog() {

    }

    @SuppressWarnings("rawtypes")
    @AfterReturning(pointcut = "sysLog()")
    public void afterReturn(JoinPoint joinPoint) throws Exception {
        logger.info("--------调用切面保存日志开始--------");
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();




    }

}
