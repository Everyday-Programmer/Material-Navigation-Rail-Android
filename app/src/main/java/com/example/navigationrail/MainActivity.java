package com.example.navigationrail;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigationrail.NavigationRailView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationRailView navigationRailView = findViewById(R.id.navigationRail);
        NavController navController = Navigation.findNavController(MainActivity.this, R.id.nav_host_fragment);
        NavigationUI.setupWithNavController(navigationRailView, navController);

        Objects.requireNonNull(navigationRailView.getHeaderView()).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Replace this with your own action", Toast.LENGTH_SHORT).show();
            }
        });
    }
}