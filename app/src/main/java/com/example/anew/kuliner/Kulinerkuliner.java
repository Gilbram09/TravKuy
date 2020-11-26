package com.example.anew.kuliner;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anew.R;

import java.util.ArrayList;

public class Kulinerkuliner extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<kuliner> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulinerkuliner);
        rvHeroes = findViewById(R.id.rv_heroess);
        rvHeroes.setHasFixedSize(true);

        list.addAll(KulinerData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListKuliner listwisata = new ListKuliner(list);
        rvHeroes.setAdapter(listwisata);
    }
}
