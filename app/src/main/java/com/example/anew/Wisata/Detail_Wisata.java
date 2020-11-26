package com.example.anew.Wisata;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anew.R;

public class Detail_Wisata extends AppCompatActivity {
    TextView txtName, txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__wisata);

        txtName = findViewById(R.id.textjudul);
        parcelable wisata = getIntent().getParcelableExtra("universitas");
        txtName.setText(wisata.getName());

        txtDetail = findViewById(R.id.penjelasanwisata);
        txtDetail.setText(wisata.getDetail());

        imgView = findViewById(R.id.Gambarwisata);
        imgView.setImageResource(wisata.getPhoto());








    }
}

