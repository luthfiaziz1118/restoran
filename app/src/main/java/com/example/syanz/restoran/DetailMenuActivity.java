package com.example.syanz.restoran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenuActivity extends AppCompatActivity {

    private ImageView fotoMenu;
    private TextView namaMenu,hargaMenu,deskripsiMenu;
    String namaItem,hargaItem,deskripsiItem;
    int fotoItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        namaMenu=findViewById(R.id.tv_namamenu);
        hargaMenu=findViewById(R.id.tv_harga);
        deskripsiMenu=findViewById(R.id.tv_deskripsi);
        fotoMenu=findViewById(R.id.iv_fotomenu);

        namaItem=getIntent().getStringExtra("nama");
        namaMenu.setText(namaItem);
        hargaItem=getIntent().getStringExtra("harga");
        hargaMenu.setText(hargaItem);
        deskripsiItem=getIntent().getStringExtra("deskripsi");
        deskripsiMenu.setText(deskripsiItem);
        fotoItem=getIntent().getIntExtra("foto",0);
        fotoMenu.setImageResource(fotoItem);

    }
}
