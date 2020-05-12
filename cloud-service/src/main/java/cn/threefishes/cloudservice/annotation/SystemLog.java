package cn.threefishes.cloudservice.annotation;

import java.lang.annotation.*;

/**
 * @ClassName SysLog
 * @Description TODO
 * @Author q
 * @Date 2019/8/30 10:56
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemLog {
    // 操作
    String operate();

    // 模块
    String module();

    //方法
    String method();
}
