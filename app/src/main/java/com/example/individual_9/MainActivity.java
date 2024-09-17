package com.example.individual_9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imagen1, imagen2, imagen3, imagen4;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        imagen1=(ImageView) findViewById(R.id.btn_1);
        imagen2=(ImageView) findViewById(R.id.btn_2);
        imagen3=(ImageView) findViewById(R.id.btn_3);
        imagen4=(ImageView) findViewById(R.id.btn_4);

        imagen1.setOnClickListener(this);
        imagen2.setOnClickListener(this);
        imagen3.setOnClickListener(this);
        imagen4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id =  view.getId();

        if (id == R.id.btn_1 ){
            llamar2("" + R.drawable.wolf);
        } else if (id == R.id.btn_2) {
            llamar2("" + R.drawable.mlion);
        } else if (id == R.id.btn_3) {
            llamar2("" + R.drawable.fox);
        } else if (id == R.id.btn_4) {
            llamar2("" + R.drawable.red );
        }

    }

    protected  void llamar2(String image){

        Intent intento = new Intent(MainActivity.this, MainActivity2.class) ;
        intento.putExtra("imagen",image);
        startActivity(intento);
    }
}