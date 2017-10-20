package com.example.user.test_backend_1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User on 20.10.2017.
 */

public class UserListWithObjectGson implements IUserList {
    @SerializedName("items")
    private List<UserGson> mUserList;


    @Override
    public List<UserGson> getUsersList() {
        return mUserList;
    }
}
