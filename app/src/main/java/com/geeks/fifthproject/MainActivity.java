package com.geeks.fifthproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.geeks.fifthproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_main);

        String urlImage = "https://i.pinimg.com/originals/23/51/bc/2351bc65b2b5d75cef146b7edddf805b.gif";
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(view -> {
            Intent intent = new Intent (MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });
        Glide.with(MainActivity.this)
                .load(urlImage)
                .placeholder(R.color.gray)
                .into(imageView);

    }
}