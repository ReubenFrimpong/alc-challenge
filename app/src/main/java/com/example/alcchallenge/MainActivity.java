package com.example.alcchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openAbout(View view) {
        startActivity(new Intent(this, WebActivity.class));

    }

    public void openProfile(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }

}
