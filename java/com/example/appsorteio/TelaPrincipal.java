package com.example.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class TelaPrincipal extends AppCompatActivity {

   ImageView menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        menu = findViewById(R.id.img_menu);
        menu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View va) {
                Intent intenta = new Intent(TelaPrincipal.this, MenuTela.class);
                startActivity(intenta);


            }
        });

    }
}