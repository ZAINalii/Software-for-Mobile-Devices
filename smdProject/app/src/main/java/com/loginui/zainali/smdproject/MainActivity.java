package com.loginui.zainali.smdproject;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText address;
    private EditText email;
    private EditText contact;
    private Button b;
    private Button bb;
    //static int x=1;
public int x=0;
    public static MyappDatabase myappDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=(EditText) findViewById(R.id.editText3);
        address=(EditText) findViewById(R.id.edittext6);
        email=(EditText) findViewById(R.id.editText);
        contact=(EditText) findViewById(R.id.editText2);
        b=(Button) findViewById(R.id.button3);
        bb=(Button) findViewById(R.id.button4);
myappDatabase= Room.databaseBuilder(getApplicationContext(),MyappDatabase.class,"userdb").allowMainThreadQueries().build();
        name.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (name.getText().length()== 0) {
                    name.setError("Enter Name");
                }
            }
        });

        address.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (address.getText().length()== 0) {
                    address.setError("Enter Address");
                }
            }
        });


        contact.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (contact.getText().length()== 0) {
                    contact.setError("Enter Address");
                }
            }
        });


    }

    String namee;
    String adres;
    String mail;
    String contacct;
int id;
    public void register(View view){

userlogin userloginn=new userlogin();
userloginn.setName(name.getText().toString());
userloginn.setAddress(address.getText().toString());
userloginn.setContact(contact.getText().toString());
userloginn.setEmail(email.getText().toString());
  //userloginn.setId((int )(Math. random() * 50 + 1));
        userloginn.setId(10);
myappDatabase.myDao().addUser(userloginn);
        address.setText(" ");
        contact.setText(" ");
        email.setText(" ");
        name.setText(" ");



        List<userlogin> users=myappDatabase.myDao().getusers();


        for(userlogin u : users){
             namee = u.getName();
             adres=u.getAddress();
             mail=u.getEmail();
             contacct=u.getContact();
             id=u.getId();


            Toast.makeText(getApplicationContext(), namee+"   "+id+"  "+ adres+" "+ mail,Toast.LENGTH_SHORT).show();

        }


    }

    public void remoov(View view){
        Intent in=new Intent(this,deleteuser.class);
        startActivity(in);

    }
    public void uppdat(View view){
        Intent in=new Intent(this,updateuser.class);
        startActivity(in);

    }
}
