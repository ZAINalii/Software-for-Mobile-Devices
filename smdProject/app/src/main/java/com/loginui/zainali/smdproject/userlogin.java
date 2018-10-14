package com.loginui.zainali.smdproject;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.v4.app.NotificationCompat;

import io.reactivex.annotations.NonNull;

@Entity(tableName = "userlogintable")
public class userlogin {

    @PrimaryKey
        private int id;

@ColumnInfo(name="names")
   private String name;

@ColumnInfo(name="addresses")
private String address;

@ColumnInfo(name="contacts")
private String contact;

@ColumnInfo(name="Emails")
private String email;

    public int getId() {
       return id;
    }

    public void setId(int id) {
        this.id = id;
    }
public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
