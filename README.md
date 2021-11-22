## http-log4j-appender ##
----------

简介
--

轻量的异步httpAppender，基于log4j（1.2.17）和HttpURLConnection开发。

----------


例子
--

直接发送到http服务端

    log4j.appender.http =  xu.log4j.appender.HttpAppender
    log4j.appender.http.url = http://127.0.0.1:8888
    log4j.appender.http.layout = org.apache.log4j.PatternLayout
    log4j.appender.http.layout.ConversionPattern = %m

参数说明
--

    url：Http服务端地址
    connectionTimeout：连接超时时间，默认10000（毫秒）
    readTimeOut：读取超时时间，默认10000（毫秒）
    userName：认证用户名
    password：认证密码
