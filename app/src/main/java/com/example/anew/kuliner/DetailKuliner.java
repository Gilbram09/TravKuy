package com.example.anew.kuliner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.anew.BeliBeli;
import com.example.anew.R;

public class DetailKuliner extends AppCompatActivity {

    Button pindah;
    TextView txtName, txtDetail;
    ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_kuliner);
        pindah = findViewById(R.id.kulinerrr);

        txtName = findViewById(R.id.textjudul);
        kuliner kuliner = getIntent().getParcelableExtra("universitas");
        txtName.setText(kuliner.getName());

        txtDetail = findViewById(R.id.penjelasan);
        txtDetail.setText(kuliner.getDetail());

        imgView = findViewById(R.id.Gambar);
        imgView.setImageResource(kuliner.getPhoto());

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(DetailKuliner.this, BeliBeli.class);
                startActivity(intent);


            }

        });






    }
}
