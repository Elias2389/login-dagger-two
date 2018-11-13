package com.arivas.daggerlogin.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.arivas.daggerlogin.R;
import com.arivas.daggerlogin.root.App;

public class MainActivity extends AppCompatActivity {

    EditText name, lastname;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        name = findViewById(R.id.first_name);
        lastname = findViewById(R.id.last_name);
        loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
