package com.example.user.test_backend_1;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 20.10.2017.
 */

public class UserGson implements IUser {

    @SerializedName("id")
    private long mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("surname")
    private String mSurname;

    @SerializedName("email")
    private String mEmail;

    public UserGson() {
    }

    @Override
    public long getId() {
        return mId;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public String getSurname() {
        return mSurname;
    }

    @Override
    public String getEmail() {
        return mEmail;
    }
}
