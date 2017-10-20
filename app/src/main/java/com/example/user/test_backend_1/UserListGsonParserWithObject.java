package com.example.user.test_backend_1;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by User on 20.10.2017.
 */

public class UserListGsonParserWithObject implements IUserListParser{
    private final InputStream mInputStream;

    public UserListGsonParserWithObject(InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IUserList parse() throws Exception {
        Reader reader=new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,UserListWithObjectGson.class);
    }
}
