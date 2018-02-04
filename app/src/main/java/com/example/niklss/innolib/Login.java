package com.example.niklss.innolib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by user on 04.02.2018.
 */

public class Login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button bt=(Button) findViewById(R.id.button);
        EditText name=(EditText) findViewById(R.id.editText);
        EditText password=(EditText) findViewById(R.id.editText2);
        bt.setOnClickListener(click);
    }

    View.OnClickListener click=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(Login.this, InnoLib.class);
            startActivity(intent);
        }
    };
}