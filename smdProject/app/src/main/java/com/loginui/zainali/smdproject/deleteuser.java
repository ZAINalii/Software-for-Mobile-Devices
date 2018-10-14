package com.loginui.zainali.smdproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class deleteuser extends AppCompatActivity {

    private Button bn;
    private EditText txt;
    int idd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deleteuser);

 bn=(Button) findViewById(R.id.button2);
txt=(EditText) findViewById(R.id.textViewww);

//try {
//idd=Integer.parseInt(txt.getText().toString());
   //String i = txt.getText().toString();
 //idd=Integer.valueOf(i);

//}
//catch(Exception e){

  //  e.printStackTrace();
//}
 /*
 bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userlogin userloginn=new userlogin();
               // userloginn.setName(txt.getText().toString());
                userloginn.setId(idd);
               // MainActivity.myappDatabase.myDao().deletee(userloginn);
 //               Toast.makeText(getApplicationContext(),txt.getText().toString()+"  removed",Toast.LENGTH_SHORT).show();
            }
        });
*/
    }

    public void reegd(View view){
        userlogin userloginn=new userlogin();
       //  userloginn.setName(txt.getText().toString());
        //userloginn.setId(idd);
        userloginn.setId(10);

        MainActivity.myappDatabase.myDao().deletee(userloginn);
        Toast.makeText(getApplicationContext(),txt.getText().toString()+"  removed  "+ idd,Toast.LENGTH_SHORT).show();
  }

}

