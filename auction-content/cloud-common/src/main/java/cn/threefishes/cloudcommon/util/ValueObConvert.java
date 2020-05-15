package cn.threefishes.cloudcommon.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Used by controller to service and service to mapper
 */
public class ValueObConvert {

    public static Object convert(Object destination, Object origin) throws IllegalAccessException, InvocationTargetException {

        if(origin == null)
            return null;

        Method[] methodsOri = origin.getClass().getMethods();
        Method[] methodsDes = destination.getClass().getMethods();
        String setMethodName;
        for(Method ori : methodsOri) {
            if(ori.getName().indexOf("get") != -1 && !ori.getName().equals("getClass")) {
                setMethodName = ori.getName().replace("get", "set");
                for(Method des : methodsDes) {
                    if(des.getName().equals(setMethodName)) {
                        des.invoke(destination, ori.invoke(origin, null));
                        break;
                    }
                }
            }
        }

        return destination;
    }
}
