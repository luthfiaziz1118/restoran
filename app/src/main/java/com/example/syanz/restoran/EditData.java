package com.example.syanz.restoran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditData extends AppCompatActivity {
    Button btntambahmenu;
    EditText nama,harga,keterangan;
    String mnama="",mharga="",mketerangan="",id="";
    DBHelper dbHelper;
    boolean status=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_data);
        id=getIntent().getStringExtra("id");
        mnama=getIntent().getStringExtra("nama");
        mharga=getIntent().getStringExtra("harga");
        mketerangan=getIntent().getStringExtra("keterangan");
        init();
        dbHelper = new DBHelper(this);

        nama.setText(mnama);
        harga.setText(mharga);
        keterangan.setText(mketerangan);

        btntambahmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
            }
        });
    }

    public void save() {
        if (!nama.getText().toString().equals("")) {
            mnama = nama.getText().toString();
        } else {
            status = true;
        }
        if (!harga.getText().toString().equals("")) {
            mharga = harga.getText().toString();
        } else {
            status = true;
        }
        if (!keterangan.getText().toString().equals("")) {
            mketerangan = keterangan.getText().toString();
        } else {
            status = true;
        }
        if (status) {
            Toast.makeText(this, "Isi Heula Bray!!", Toast.LENGTH_SHORT).show();
            status = false;
        } else {
            if (dbHelper.EditData(id,mnama, mharga, mketerangan)) {
                Toast.makeText(this, "Succes Tambah Data", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,ListMenu.class));
            } else {
                Toast.makeText(this, "Gagal Tambah Data", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void init() {
        btntambahmenu = findViewById(R.id.btn_edit);
        nama = findViewById(R.id.namamenu);
        harga = findViewById(R.id.hargamenu);
        keterangan = findViewById(R.id.ketmenu);
    }




}