package com.example.anew;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class BeliBeli extends AppCompatActivity {
    TextView txtJumlah, txtHarga, txtGetNama;
    EditText edtNama;
    CheckBox chk_Tomat, chk_Setan;
    int Jumlah, total, harga = 10, Tomat, Setan;
    String nama, Biasa = "Tidak", VIP = "Tidak";
    boolean iscbx_tomat, isCbx_Setan;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beli_beli);

        txtJumlah = (TextView) findViewById(R.id.txt_jumlah);
        txtHarga = (TextView) findViewById(R.id.txt_price);
        edtNama = (EditText) findViewById(R.id.txt_nama);
        txtGetNama = (TextView) findViewById(R.id.txt_getNama);
        chk_Setan = (CheckBox) findViewById(R.id.chx_VIP);
        chk_Tomat = (CheckBox) findViewById(R.id.chx_Biasa);

    }

    public void sambal() {
        if (chk_Tomat.isChecked()) {
            Biasa = " Tiket Biasa";
            Tomat = 1;
        } else {
            iscbx_tomat = false;
            Biasa = "";
            Tomat = 0;
        }

        if (chk_Setan.isChecked()) {
            VIP = "Tiket VIP";
            Setan = 1;
        } else {
            isCbx_Setan = false;
            VIP = "";
            Setan = 0;
        }
    }

    public void tambah(View view) {
        Jumlah = Jumlah + 1;
        txtJumlah.setText("" + Jumlah);

    }

    public void Kurang(View view) {
        Jumlah = Jumlah + 1;
        txtJumlah.setText("" + Jumlah);
    }

    public void order(View view) {
        display(harga);
    }

    public void display(int harga) {


        sambal();
        total = Jumlah * harga;
        if (isCbx_Setan) {
            total += (Jumlah * Setan);
        }
        if (iscbx_tomat) {
            total += (Jumlah * Tomat);
        }
        Log.i("Harga :", "" + total);
        nama = edtNama.getText().toString();
        txtGetNama.setText("Nama :" + nama +
                "\n" + VIP +
                "\n" + Biasa);
        txtHarga.setText("Harga : Rp." + total + ".000.000,00");
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
