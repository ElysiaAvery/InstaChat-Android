package com.example.guest.instachat.models;

import org.parceler.Parcel;

/**
 * Created by Guest on 12/7/16.
 */
@Parcel
public class User {

    String mName;
    String mEmail;
    String mUid;

    public User(String mName, String mEmail, String mUid) {
        this.mName = mName;
        this.mEmail = mEmail;
        this.mUid = mUid;
    }

    public User() {}

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmUid() {
        return mUid;
    }

    public void setmUid(String mUid) {
        this.mUid = mUid;
    }

}
