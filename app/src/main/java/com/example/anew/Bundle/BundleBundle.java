package com.example.anew.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.anew.R;

public class BundleBundle extends AppCompatActivity {
    AlertDialog.Builder builder;

    Button pindah,pindah2,pindah3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle_bundle);

        pindah =  findViewById(R.id.btn1);
        pindah2 =  findViewById(R.id.btn2);
        pindah3 =  findViewById(R.id.btn3);

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BundleBundle.this, "Anda Telah Membeli Paket Ini",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(BundleBundle.this, BundleBundle.class);
                finish();
                startActivity(intent);


            }

        });

        pindah2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BundleBundle.this, "Anda Telah Membeli Paket Ini",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(BundleBundle.this, BundleBundle.class);
                finish();
                startActivity(intent);


            }

        });

        pindah3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BundleBundle.this, "Anda Telah Membeli Paket Ini",Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(BundleBundle.this, BundleBundle.class);
                finish();
                startActivity(intent);


            }

        });
    }
}