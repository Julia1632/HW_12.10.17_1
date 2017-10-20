package com.example.user.test_backend_1;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.InputStream;
import java.util.List;

/**
 * Created by User on 20.10.2017.
 */

public class UserListLoader extends AsyncTask<Context, Void, String> {

    public static final String NO_DATA = "No data";
    private IUserList userListWithObject;
    private Context context;
   //String user_url = "http://localhost:8080/_ah/api/userApi/v1/user";

    @Override
    protected String doInBackground(Context... params) {

        final UsersListParserFactory usersListParserFactory = new UsersListParserFactory();
        IHttpClient httpClient = new HttpClient();

        userListWithObject = null;

        httpClient.request(Api.USER_URL, new HttpClient.ResponseListener() {
            @Override
            public void onResponse(InputStream inputStream) {
                try {
                    userListWithObject = usersListParserFactory.createParserForResponceWithObject(inputStream).parse();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        context = params[0];

        if (userListWithObject == null) {
            return NO_DATA;
        }

        List<UserGson> usersList = userListWithObject.getUsersList();

        if (usersList == null || usersList.isEmpty()) {
            return NO_DATA;
        }

        return usersList.get(usersList.size() -1).getName();
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context, s, Toast.LENGTH_LONG).show();
    }

}