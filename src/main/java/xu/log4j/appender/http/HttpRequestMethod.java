package xu.log4j.appender.http;


/**
 * @author xubo1
 * @date 2021/3/16 12:28
 */
public enum HttpRequestMethod {
    DELETE("DELETE"), GET("GET"), HEAD("HEAD"), OPTIONS("OPTIONS"), POST("POST"), PUT("PUT"), TRACE("TRACE");
    String key;

    HttpRequestMethod(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return key;
    }
}
