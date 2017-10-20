package com.example.user.test_backend_1;

/**
 * Created by User on 20.10.2017.
 */

public interface IHttpClient {

    void request(String url, HttpClient.ResponseListener listener);
}
