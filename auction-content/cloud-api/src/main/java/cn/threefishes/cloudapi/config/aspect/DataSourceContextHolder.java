package cn.threefishes.cloudapi.config.aspect;

public class DataSourceContextHolder {
    // 默认数据源
    public static final String DEFAULT_DS = "primary";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDB(String dbType) {
        contextHolder.set(dbType);
    }

    public static String getDB() {
        return (contextHolder.get());
    }

    public static void clearDB() {
        contextHolder.remove();
    }
}
