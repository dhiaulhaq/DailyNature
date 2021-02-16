package com.example.dailynature.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dailynature.Adapter.HewanAdapter;
import com.example.dailynature.Model.Hewan;
import com.example.dailynature.R;

import java.util.ArrayList;
import java.util.List;

public class HewanUdaraFragment extends Fragment {

    List<Hewan> lstHewan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hewan_udara, container, false);

        //RecyclerView Section
        lstHewan = new ArrayList<>();
        lstHewan.add(new Hewan("Elang","Karnivora",getString(R.string.elang),R.drawable.elang));
        lstHewan.add(new Hewan("Burung Hantu","Karnivora",getString(R.string.burung_hantu),R.drawable.burung_hantu));
        lstHewan.add(new Hewan("Merpati","Herbivora",getString(R.string.merpati),R.drawable.merpati));
        lstHewan.add(new Hewan("Gagak","Herbivora",getString(R.string.gagak),R.drawable.gagak));

        RecyclerView myrv = view.findViewById(R.id.recyclerview_id);
        HewanAdapter myAdapter = new HewanAdapter(getActivity(),lstHewan);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
