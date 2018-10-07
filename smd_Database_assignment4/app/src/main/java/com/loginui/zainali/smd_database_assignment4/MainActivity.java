package com.loginui.zainali.smd_database_assignment4;
import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //editText = findViewById(R.id.editText);
    }


    private String getDataFromEditText() {
        String data = "file";
        return data;
    }

    private void saveData(File file, String data) {
        try {

            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes());
            Toast.makeText(this, "Data Saved Successfully at: " + file.getAbsolutePath(), Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public void storeinternal_cache(View view) {

        String data = getDataFromEditText();
        if (data != null) {
            File chacheDir = getCacheDir();
            File file = new File(chacheDir.getAbsolutePath(), "myFile.txt");
            saveData(file, data);
        }


    }

    public void external_cache(View view) {
        String data = getDataFromEditText();

        File externalCacherDir = getExternalCacheDir();

        if (data != null && externalCacherDir != null) {
            File file = new File(externalCacherDir.getAbsolutePath(), "myFile.txt");
            saveData(file, data);
        }

    }


    public void external_storage_public(View view) {
        String data = getDataFromEditText();
        if (data != null) {

            // FIRST check state
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) { // if media is available

                // check for permisssion
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
                    {
//                        File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                        File folder = Environment.getExternalStoragePublicDirectory("myFolder");
                        folder.mkdir();
                        File file = new File(folder.getAbsolutePath(), "myFile.txt");
                        saveData(file, data);
                    }
                    else
                    {
                        requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},99);
                    }
                }
                else
                { // if device is less then MarshMellow no need to request permission
                    File folder = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                    File file = new File(folder, "myFile.txt");
                    saveData(file, data);
                }


            }
        }
    }





    public void internal_storage(View view) {
        String data = getDataFromEditText();
        if (data != null) {
            try {

                FileOutputStream fos = openFileOutput("myFile.txt", MODE_PRIVATE);
                fos.write(data.getBytes());
                Toast.makeText(this, "Data Successfully Save in internal Storage ", Toast.LENGTH_SHORT).show();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void external_storage_private(View view) {
        String data = getDataFromEditText();
        if (data != null) {
            File folder = getExternalFilesDir("myFolder");
            File file = new File(folder, "myFile.txt");
            saveData(file, data);
        }
    }

    public void sdCard(View view){
        try {
            File myFile = new File("/sdcard/mysdfile.txt");
            myFile.createNewFile();
            FileOutputStream fOut = new FileOutputStream(myFile);
            OutputStreamWriter myOutWriter =
                    new OutputStreamWriter(fOut);
            //myOutWriter.append(txtData.getText());
            myOutWriter.close();
            fOut.close();
            Toast.makeText(getBaseContext(),
                    "Done writing SD 'mysdfile.txt'",
                    Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(getBaseContext(), e.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }

    }



}