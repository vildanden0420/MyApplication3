package com.example.user.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Main5Activity extends AppCompatActivity {
    Button b1;
    EditText e1, e2, e3;
    CheckBox c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init();
    }

    void init(){
        e1 = (EditText)findViewById(R.id.editText7);
        e2 = (EditText)findViewById(R.id.editText8);
        e3 = (EditText)findViewById(R.id.editText9);
        b1 = (Button)findViewById(R.id.button10);
        c1 = (CheckBox)findViewById(R.id.checkBox);
    }
}
