import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by boreas320 on 16/6/22.
 */
public class HttpClientTest {


    private static HttpClient client;

    @BeforeClass
    public static void init() {
        System.out.println("============================================================");
        client = HttpClientBuilder.create().build();

    }

    @Test
    public void requestLimitTest() throws Exception {




        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                HttpPost httpPost = new HttpPost("http://localhost:8083");
                try {
                    HttpResponse execute = client.execute(httpPost);
                    InputStream content = execute.getEntity().getContent();
//
//                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(content));
//
//
//
//                    String s;
//                    StringBuilder stringBuilder = new StringBuilder();
//
//                    while ((s = bufferedReader.readLine()) != null) {
//
//                        stringBuilder.append(s);
//                    }
//                    System.out.println(execute.getStatusLine().getStatusCode()+":"+stringBuilder.toString());
                    System.out.println(execute.getStatusLine().getStatusCode());

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        };


        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++)
            executorService.execute(runnable);
        executorService.awaitTermination(10, TimeUnit.SECONDS);


    }
}
