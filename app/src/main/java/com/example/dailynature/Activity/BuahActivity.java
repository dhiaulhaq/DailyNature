package com.example.dailynature.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.dailynature.Adapter.BuahAdapter;
import com.example.dailynature.Model.Buah;
import com.example.dailynature.R;
import com.example.dailynature.Adapter.HewanAdapter;

import java.util.ArrayList;
import java.util.List;

public class BuahActivity extends AppCompatActivity {

    List<Buah> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buah);

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
        lstBook.add(new Buah("Apel", "Categorie Book", getString(R.string.apel), R.drawable.apel));
        lstBook.add(new Buah("Jeruk", "Categorie Book", getString(R.string.jeruk), R.drawable.jeruk));
        lstBook.add(new Buah("Mangga", "Categorie Book", getString(R.string.mangga), R.drawable.mangga));
        lstBook.add(new Buah("Anggur", "Categorie Book", getString(R.string.anggur), R.drawable.anggur));
        lstBook.add(new Buah("Melon", "Categorie Book", getString(R.string.melon), R.drawable.melon));

        RecyclerView myrv = findViewById(R.id.recyclerview_id);
        BuahAdapter myAdapter = new BuahAdapter(this, lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);


    }
}
