package com.example.nfctagmark0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_list, button_storage, button_scan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_list= findViewById(R.id.button_list);
        button_storage= findViewById(R.id.button_storage);
        button_scan= findViewById(R.id.button_scan);

        button_list.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //We will show our database to user
            }
        });
        button_storage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //We will only show our database values with boolean value True to user
            }
        });
        button_scan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //We will scan NFC tag, get some info from user such as name. And save it to the database.

            }
        });
    }


}