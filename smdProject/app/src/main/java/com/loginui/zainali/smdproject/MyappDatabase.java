package com.loginui.zainali.smdproject;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {userlogin.class},version = 2)
public abstract class MyappDatabase extends RoomDatabase{

public abstract MyDao myDao();

}
