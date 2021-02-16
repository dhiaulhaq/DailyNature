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

public class HewanAirFragment extends Fragment {

    List<Hewan> lstHewan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hewan_air, container, false);

        //RecyclerView Section
        lstHewan = new ArrayList<>();
        lstHewan.add(new Hewan("Paus","Karnivora",getString(R.string.paus),R.drawable.paus));
        lstHewan.add(new Hewan("Lumba-lumba","Karnivora",getString(R.string.lumba_lumba),R.drawable.lumba_lumba));
        lstHewan.add(new Hewan("Kodok Sawah","Herbivora",getString(R.string.kodok),R.drawable.kodok));
        lstHewan.add(new Hewan("Bebek","Herbivora",getString(R.string.bebek),R.drawable.bebek));

        RecyclerView myrv = view.findViewById(R.id.recyclerview_id);
        HewanAdapter myAdapter = new HewanAdapter(getActivity(),lstHewan);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
