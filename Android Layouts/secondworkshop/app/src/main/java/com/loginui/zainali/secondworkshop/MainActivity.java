package com.loginui.zainali.secondworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2=(Button) findViewById(R.id.button1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRelative();
            }
        });






        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openConstraint();
            }
        });

    }



    public void openRelative(){

        Intent intentt=new Intent(this,Main3ResourceLayout.class);
        startActivity(intentt);

    }


    public void openConstraint(){

        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }


}
