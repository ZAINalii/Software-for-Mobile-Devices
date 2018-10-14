package com.loginui.zainali.smdproject;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface MyDao {

    @Insert
public void addUser(userlogin ul);

    @Query("Select * from userlogintable")
public List<userlogin> getusers();

    @Delete
    public void deletee(userlogin u);

    @Update
    public void updateuser(userlogin u);


}
