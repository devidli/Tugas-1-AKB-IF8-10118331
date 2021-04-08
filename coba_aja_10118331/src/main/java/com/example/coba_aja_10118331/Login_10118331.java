package com.example.coba_aja_10118331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.coba_aja_10118331.Presenter.ILoginPresenter;
import com.example.coba_aja_10118331.Presenter.LoginPresenter;
import com.example.coba_aja_10118331.View.ILoginView;

public class Login_10118331 extends AppCompatActivity implements ILoginView{

    EditText email,password;
    Button buttonlogin,buttonregistration;

    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_10118331);

        buttonregistration = (Button)findViewById(R.id.buttonregistration);
        buttonlogin = (Button)findViewById(R.id.buttonlogin);
        email = (EditText)findViewById(R.id.email);
        password =(EditText)findViewById(R.id.password);

        loginPresenter = new LoginPresenter(this);

        buttonregistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_10118331.this, Registrasi_10118331.class);
                startActivity(intent);
            }
        });

        buttonlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {

                if(loginPresenter.onLogin(email.getText().toString(),password.getText().toString()))
                {
                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    finish();
                }
            }
        });

    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
    }
}
// 8-4-2021
// 10118331
// Devidli Setiawan
// IF-8