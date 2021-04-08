package com.example.coba_aja_10118331;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.coba_aja_10118331.View.ILoginView;

public class Registrasi_10118331 extends AppCompatActivity {

    Button back,register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi_10118331);

        register = (Button)findViewById(R.id.register);
        back = (Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Registrasi_10118331.this, Login_10118331.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Registrasi_10118331.this, Login_10118331.class);
                startActivity(intent);
            }
        });
    }
}

// 8-4-2021
// 10118331
// Devidli Setiawan
// IF-8