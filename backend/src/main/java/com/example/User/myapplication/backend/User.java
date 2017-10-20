package com.example.User.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

/**
 * Created by User on 20.10.2017.
 */
@Entity
public class User {
    @Id
    private long mId;
    private String mName;
    private String mSurname;
    private String mEmail;

    public User(long mId, String mName, String mSurname, String mEmail) {
        this.mId = mId;
        this.mName = mName;
        this.mSurname = mSurname;
        this.mEmail = mEmail;
    }

    public User() {
    }

    public long getmId() {
        return mId;
    }

    public String getmName() {
        return mName;
    }

    public String getmSurname() {
        return mSurname;
    }

    public String getmEmail() {
        return mEmail;
    }
}
