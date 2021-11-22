package xu.log4j.appender.http;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author xubo1
 * @date 2021/3/16 12:29
 */
public class AsyncHttpClient extends HttpClient {
    private final ExecutorService threadPool;

    public AsyncHttpClient() {
        super();
        threadPool = Executors.newCachedThreadPool();
    }

    @Override
    public void delete(final String url, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.delete(url, handler);
            }
        });
    }

    @Override
    public void delete(final String url, final RequestParams params, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.delete(url, params, handler);
            }
        });
    }

    @Override
    public void get(final String url, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.get(url, handler);
            }
        });
    }

    @Override
    public void get(final String url, final RequestParams params, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.get(url, params, handler);
            }
        });
    }

    @Override
    public void post(final String url, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.post(url, handler);
            }
        });
    }

    @Override
    public void post(final String url, final RequestParams params, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.post(url, params, handler);
            }
        });
    }

    @Override
    public void put(final String url, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.put(url, handler);
            }
        });
    }

    @Override
    public void put(final String url, final RequestParams params, final HttpResponseHandler handler) {
        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                AsyncHttpClient.super.put(url, params, handler);
            }
        });
    }
}
