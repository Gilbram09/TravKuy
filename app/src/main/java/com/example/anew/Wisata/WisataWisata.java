package com.example.anew.Wisata;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anew.R;

import java.util.ArrayList;

public class WisataWisata extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<parcelable> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_wisata);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(WisataData.getListData());
        showRecyclerList();
    }


    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListWisata listwisata = new ListWisata(list);
        rvHeroes.setAdapter(listwisata);
    }

}