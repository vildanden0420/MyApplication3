package com.example.user.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
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

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                int pizzaCount = 0;
                if(!TextUtils.isEmpty(pizza)){
                    pizzaCount = Integer.parseInt(pizza);
                }

                String pasta = e1.getText().toString();
                int pastaCount = 0;
                if(!TextUtils.isEmpty(pasta)){
                    pastaCount = Integer.parseInt(pasta);
                }

                String salad = e1.getText().toString();
                int saladCount = 0;
                if(!TextUtils.isEmpty(salad)){
                    saladCount = Integer.parseInt(salad);
                }

                int totalCount = pizzaCount + pastaCount + saladCount;
                int price = pizzaCount*15000 + pastaCount*13000 + saladCount*9000;

            }
        });
    }
}
