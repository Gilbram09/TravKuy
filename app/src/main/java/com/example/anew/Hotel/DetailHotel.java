package com.example.anew.Hotel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anew.R;

public class DetailHotel extends AppCompatActivity {
    TextView txtName,txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hotel);

        txtName = findViewById(R.id.textjudul);
        Hotel hotel = getIntent().getParcelableExtra("universitas");
        txtName.setText(hotel.getName());

        txtDetail = findViewById(R.id.penjelasanhotel1);
        txtDetail.setText(hotel.getDetail());

        imgView = findViewById(R.id.gambarhotel1);
        imgView.setImageResource(hotel.getPhoto());


    }
}

