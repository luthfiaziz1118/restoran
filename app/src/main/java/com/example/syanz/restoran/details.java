package com.example.syanz.restoran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class details extends AppCompatActivity {
    TextView total,katsu,kentang,sempolan,nasgor,udang,bbq,alpukat,jeruk,lemon,blue,bandrek,tea;
    Button selesai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        total=findViewById(R.id.total);
        katsu=findViewById(R.id.hrg_katsu);
        kentang=findViewById(R.id.hrg_kentang);
        sempolan=findViewById(R.id.hrg_sempolan);
        nasgor=findViewById(R.id.hrg_nasgor);
        udang=findViewById(R.id.hrg_udang);
        bbq=findViewById(R.id.hrg_bbq);
        alpukat=findViewById(R.id.hrg_alpukat);
        jeruk=findViewById(R.id.hrg_jeruk);
        lemon=findViewById(R.id.hrg_lemon);
        blue=findViewById(R.id.hrg_blue);
        bandrek=findViewById(R.id.hrg_bandrek);
        tea=findViewById(R.id.hrg_tea);
        katsu.setText(""+getIntent().getIntExtra("jum1",0));
        kentang.setText(""+getIntent().getIntExtra("jum2",0));
        sempolan.setText(""+getIntent().getIntExtra("jum3",0));
        nasgor.setText(""+getIntent().getIntExtra("jum4",0));
        udang.setText(""+getIntent().getIntExtra("jum5",0));
        bbq.setText(""+getIntent().getIntExtra("jum6",0));
        alpukat.setText(""+getIntent().getIntExtra("jum7",0));
        jeruk.setText(""+getIntent().getIntExtra("jum8",0));
        lemon.setText(""+getIntent().getIntExtra("jum9",0));
        blue.setText(""+getIntent().getIntExtra("jum10",0));
        bandrek.setText(""+getIntent().getIntExtra("jum11",0));
        tea.setText(""+getIntent().getIntExtra("jum12",0));
        total.setText(""+getIntent().getIntExtra("jumtot",0));

        selesai=findViewById(R.id.btn_selesai);
        selesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(details.this, R.string.visit, Toast.LENGTH_LONG).show();

                Intent intent = new Intent(details.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
