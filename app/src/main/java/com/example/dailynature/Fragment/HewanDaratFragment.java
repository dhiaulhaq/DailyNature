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

import com.example.dailynature.Model.Hewan;
import com.example.dailynature.R;
import com.example.dailynature.Adapter.HewanAdapter;

import java.util.ArrayList;
import java.util.List;

public class HewanDaratFragment extends Fragment {

    List<Hewan> lstHewan;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hewan_darat, container, false);

        //RecyclerView Section
        lstHewan = new ArrayList<>();
        lstHewan.add(new Hewan("Kucing","Karnivora",getString(R.string.kucing),R.drawable.kucing));
        lstHewan.add(new Hewan("Singa","Karnivora",getString(R.string.singa),R.drawable.singa));
        lstHewan.add(new Hewan("Gajah","Herbivora",getString(R.string.gajah),R.drawable.gajah));
        lstHewan.add(new Hewan("Anjing","Herbivora",getString(R.string.anjing),R.drawable.anjing));
        lstHewan.add(new Hewan("Kuda","Herbivora",getString(R.string.kuda),R.drawable.kuda));

        RecyclerView myrv = view.findViewById(R.id.recyclerview_id);
        HewanAdapter myAdapter = new HewanAdapter(getActivity(),lstHewan);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),1));
        myrv.setAdapter(myAdapter);

        return view;
    }
}
