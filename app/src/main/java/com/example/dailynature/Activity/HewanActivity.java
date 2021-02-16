package com.example.dailynature.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dailynature.Fragment.HewanUdaraFragment;
import com.example.dailynature.Fragment.HewanAirFragment;
import com.example.dailynature.Fragment.HewanDaratFragment;
import com.example.dailynature.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HewanActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hewan);

        //ActionBar
        ImageButton btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onBackPressed();
            }
        });

        loadFragment(new HewanDaratFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }   return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;   switch (item.getItemId()){
            case R.id.navigation_home:
                fragment = new HewanDaratFragment();
                break;
            case R.id.navigation_favorite:
                fragment = new HewanAirFragment();
                break;
            case R.id.navigation_about:
                fragment = new HewanUdaraFragment();
                break;
        }   return loadFragment(fragment);
    }

}
