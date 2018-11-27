package com.loginui.zainali.myapplicationfirebase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

DatabaseReference mdatabase;
DatabaseReference techdatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdatabase= FirebaseDatabase.getInstance().getReference("User-GPS-Location");


//Everytime a unique id is generated
//String id= mdatabase.push().getKey();

gpslocation g=new gpslocation();
g.setLatitud(29.9792);
g.setLongitud(31.1342);
        String id= "zain"; //get he name from the user
        mdatabase.child(id).setValue(g);






        techdatabase= FirebaseDatabase.getInstance().getReference("Technician-GPS-Location");

// Technician's gps location
        gpslocation gg=new gpslocation();
        gg.setLatitud(25.97921);
        gg.setLongitud(38.13424);
        String idd= "Shahzad"; //get he name from the user
        techdatabase.child(idd).setValue(gg);


    }
}
