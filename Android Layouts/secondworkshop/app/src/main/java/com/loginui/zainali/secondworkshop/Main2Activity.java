package com.loginui.zainali.secondworkshop;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private EditText pass;
    private EditText em;
    private RadioGroup rg;
    private RadioButton rb;
    private CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       // button = findViewById();


        rg=findViewById(R.id.radioGroup5);
        cb=findViewById(R.id.checkBox);


        pass=(EditText) findViewById(R.id.editText3);
        em=(EditText) findViewById(R.id.editText5);

        em.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(em.getText().length()<1){

                    em.setError("Enter email");
                }
            }
        });

        pass.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if(pass.getText().length()==0){
                    pass.setError("Enter Password");

                }
            }
        });
    }


    public void check_button(View view){
        int idd= rg.getCheckedRadioButtonId();
        rb=findViewById(idd);
        Toast.makeText(this, "The gender is  "+rb.getText(), Toast.LENGTH_SHORT).show();

    }

    public void check_checkbox(View view)
    {
        if(cb.isChecked()==false){

            cb.setError("Please accept the terms and conditions ");
        }
    }


    public void showtoast1(View view) {
        if(cb.isChecked()==true) {

            Toast.makeText(this, "pass is " + pass.getText().toString() + "  Email is  " + em.getText()+ "The gender is  "+rb.getText() , Toast.LENGTH_SHORT).show();
            // Toast.makeText(this, "Email is is"+em.getText(), Toast.LENGTH_SHORT).show();
        }
        else{

            cb.setError("Please accept the terms and conditions ");

        }

    }
}
