package com.example.syanz.restoran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.syanz.restoran.Adapter.Adapter;
import com.example.syanz.restoran.model.MenuModel;

import java.util.ArrayList;

public class ListMenu extends AppCompatActivity {
    private Button btn_pesan;
    RecyclerView mRecyclerView;
    Adapter mAdapter;

    ArrayList<MenuModel> daftarMenu = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_menu);
        btn_pesan=findViewById(R.id.btn_pesan);
        String CK="Chiken katsu merupakan makanan khas Jepang yang bahan dasarnya Ayam dengan perpaduan Tepung Maizena, Tepung Terigu, Tepung Roti di campur dengan rempah - rempah";
        String KG="Kentang Goreng, Stik kentang yang disajikan dengan penyajian modern memiliki kandungan karbohidrat yang rendah gula";
        String SMPL="Sempolan makanan khas malang yang cukup terkenal, bahan dasar sempolan bisa dari ikan ataupun ayam";
        String NG="Nasi goreng, merupakan makanan khas Indonesia, hampir disemua penjuru Indonesia pasti mengenal yang namanya Nasi Goreng dengan khas masing - masing disetiap daerahnya";
        String UT="Udang tempura merupakan makanan khas Jepang dengan bahan dasar udang dibalur dengan tepung yang dicampur dengan bumbu rempah - rempah untuk memperkaya citarasanya";
        String BBQ="BBQ merupakan makanan berbahan dasar Daging sapi, dimasak dengan cara dipanggang, di balur dengan bumbu rempah-rempah yang membuat rasa BBQ ini khas";
        String JA="Minuman yang mengandung vitamin dan Lemak baik ini bagus untuk dikonsumsi setiap hari, untuk menjaga kelembapan kulit tubuh";
        String JJ="Minuman yang kaya akan vitamin C ini baik untuk di konsumsi setiap hari sebagai asupan vitamin bagi tubuh untuk menjaga kesetabilan tubuh";
        String LT="Minuman yang memiliki kandungan vitamin C dan juga memiliki anti oksidan dari daun teh yang sudah di proses dengan teknologi saat ini";
        String OB="Minuman yang memiliki rasa yang khas dan menyegarkan, campuran soda dengan perisa buah-buahan menjadikan minuman ini sangat segar di minum saat musim panas";
        String BDRK="Minuman dengan larutan jahe ini memiliki banyak khasiat bagi tubuh, selain untuk menghangatkan badan dimusim dingin minuman ini juga bisa memperkuat imun kita";
        String ST="Minuman dengan antioksidan tinggi baik dikonsumsi setiap hari dengan takaran gula yang pas";



        daftarMenu.add(new MenuModel(getString(R.string.CK),"Rp.10.000",CK,R.drawable.katsu));
        daftarMenu.add(new MenuModel(getString(R.string.KG),"Rp.8.000",KG,R.drawable.kentang));
        daftarMenu.add(new MenuModel(getString(R.string.SMPL),"Rp.5.000",SMPL,R.drawable.sempolan));
        daftarMenu.add(new MenuModel(getString(R.string.NG),"Rp.15.000",NG,R.drawable.nasgor));
        daftarMenu.add(new MenuModel(getString(R.string.UT),"Rp.20.000",UT,R.drawable.tempura));
        daftarMenu.add(new MenuModel(getString(R.string.BBQ),"Rp.25.000",BBQ,R.drawable.bbq));
        daftarMenu.add(new MenuModel(getString(R.string.ALP),"Rp.15.000",JA,R.drawable.alpukat));
        daftarMenu.add(new MenuModel(getString(R.string.JRK),"Rp.10.000",JJ,R.drawable.jeruk));
        daftarMenu.add(new MenuModel(getString(R.string.LT),"Rp.8.000",LT,R.drawable.lemontea));
        daftarMenu.add(new MenuModel(getString(R.string.OB),"Rp.15.000",OB,R.drawable.ocean));
        daftarMenu.add(new MenuModel(getString(R.string.BDRK),"Rp.10.000",BDRK,R.drawable.bandrek));
        daftarMenu.add(new MenuModel(getString(R.string.ST),"Rp.10.000",ST,R.drawable.tea));

        mRecyclerView = findViewById(R.id.rv_list_menu);
        mAdapter = new Adapter(ListMenu.this, daftarMenu);
        mRecyclerView.setAdapter (mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListMenu.this,menu.class);
                startActivity(intent);

            }
        });
    }
}
