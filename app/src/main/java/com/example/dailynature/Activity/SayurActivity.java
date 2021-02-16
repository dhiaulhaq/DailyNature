package com.example.dailynature.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.dailynature.Adapter.SayurAdapter;
import com.example.dailynature.Model.Sayur;
import com.example.dailynature.R;

import java.util.ArrayList;
import java.util.List;

public class SayurActivity extends AppCompatActivity {

    List<Sayur> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayur);

        //ActionBar
        ImageButton btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onBackPressed();
            }
        });

        //RecyclerView Section
        lstBook = new ArrayList<>();
        lstBook.add(new Sayur("Wortel", "Categorie Book", getString(R.string.wortel), R.drawable.wortel));
        lstBook.add(new Sayur("Cabai", "Categorie Book", getString(R.string.cabai), R.drawable.cabai));
        lstBook.add(new Sayur("Bayam", "Categorie Book", getString(R.string.bayam), R.drawable.bayam));
        lstBook.add(new Sayur("Mentimun", "Categorie Book", getString(R.string.mentimun), R.drawable.mentimun));
        lstBook.add(new Sayur("Paprika", "Categorie Book", getString(R.string.paprika), R.drawable.paprika));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        SayurAdapter myAdapter = new SayurAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
    }
}
