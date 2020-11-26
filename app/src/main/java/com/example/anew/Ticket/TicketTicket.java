package com.example.anew.Ticket;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.anew.R;

import java.util.ArrayList;

public class TicketTicket extends AppCompatActivity {
    private RecyclerView rvHeroes;
    private ArrayList<Ticket> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_ticket);

        rvHeroes = findViewById(R.id.rv_heroesss);
        rvHeroes.setHasFixedSize(true);

        list.addAll(TicketData.getListData());
        showRecyclerList();
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListTicket listTicket = new ListTicket(list);
        rvHeroes.setAdapter(listTicket);
    }
}


