package com.example.user.test_backend_1;

import com.google.gson.Gson;

/**
 * Created by User on 20.10.2017.
 */

public class UserGsonParser implements  IUserParser {

    private final String mSourse;

    public UserGsonParser(final String pSourse) {
        mSourse = pSourse;
    }

    @Override
    public IUser parse() throws Exception {
        return new Gson().fromJson(mSourse,UserGson.class);
    }
}
