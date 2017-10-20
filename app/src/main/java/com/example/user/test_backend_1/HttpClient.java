package com.example.user.test_backend_1;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by User on 20.10.2017.
 */

public class HttpClient implements IHttpClient {

    @Override
    public void request(String url, ResponseListener listener) {
        try {
            HttpURLConnection con = (HttpURLConnection) (new URL(url)).openConnection();
            InputStream is = con.getInputStream();
            listener.onResponse(is);
            con.disconnect();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public interface ResponseListener {
        void onResponse(InputStream inputStream);
    }

}