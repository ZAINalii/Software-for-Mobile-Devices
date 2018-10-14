package com.loginui.zainali.smdproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class updateuser extends AppCompatActivity {


    private EditText t;
    private EditText tt;
    private Button b;
    int iddd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updateuser);



        b= (Button) findViewById(R.id.button2);
        t=(EditText) findViewById(R.id.textView);
        tt=(EditText) findViewById(R.id.textView2);
      /*  try {
            //iddd = Integer.parseInt(t.getText().toString());
        }
        catch(Exception e){

            e.printStackTrace();
        }*/
    }
    public void updat(View view){


        userlogin userloginn=new userlogin();
        //  userloginn.setName(txt.getText().toString());
//        userloginn.setId(iddd);
        userloginn.setId(10);

        userloginn.setName(tt.getText().toString());
        MainActivity.myappDatabase.myDao().updateuser(userloginn);
        Toast.makeText(getApplicationContext(),tt.getText().toString()+"  Updated",Toast.LENGTH_SHORT).show();

    }
}
