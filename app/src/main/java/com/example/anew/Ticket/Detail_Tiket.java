package com.example.anew.Ticket;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anew.R;
import com.example.anew.BeliBeli;

public class Detail_Tiket extends AppCompatActivity {
    Button pindah;

    TextView txtName, txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__tiket);



        Ticket Tiket = getIntent().getParcelableExtra("universitas");

        txtDetail = findViewById(R.id.penjelasantiket1);
        txtDetail.setText(Tiket.getDetail());

        txtDetail = findViewById(R.id.penjelasantiket2);
        txtDetail.setText(Tiket.getDetaill());

        imgView = findViewById(R.id.gambartiket1);
        imgView.setImageResource(Tiket.getPhoto());

        imgView = findViewById(R.id.gambartiket2);
        imgView.setImageResource(Tiket.getPhotoo());


        pindah =  findViewById(R.id.tiket);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Detail_Tiket.this, BeliBeli.class);
                startActivity(intent);


            }

        });

        pindah =  findViewById(R.id.tikett);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Detail_Tiket.this, BeliBeli.class);
                startActivity(intent);


            }

        });



    }
}
