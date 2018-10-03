package com.example.syanz.restoran;

import android.content.Intent;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class menu extends AppCompatActivity {
    private Button btn_order,btn_cancel;
    private EditText menu1,menu2,menu3,menu4,menu5,menu6,menu7,menu8,menu9,menu10,menu11,menu12;
    int jumlah=0,juma=0,jumb=0,jumc=0,jumd=0,jume=0,jumf=0,jumg=0,jumh=0,jumi=0,jumj=0,jumk=0,juml=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menu1=findViewById(R.id.menu1);
        menu2=findViewById(R.id.menu2);
        menu3=findViewById(R.id.menu3);
        menu4=findViewById(R.id.menu4);
        menu5=findViewById(R.id.menu5);
        menu6=findViewById(R.id.menu6);
        menu7=findViewById(R.id.menu7);
        menu8=findViewById(R.id.menu8);
        menu9=findViewById(R.id.menu9);
        menu10=findViewById(R.id.menu10);
        menu11=findViewById(R.id.menu11);
        menu12=findViewById(R.id.menu12);

        menu1.setText("0");
        menu2.setText("0");
        menu3.setText("0");
        menu4.setText("0");
        menu5.setText("0");
        menu6.setText("0");
        menu7.setText("0");
        menu8.setText("0");
        menu9.setText("0");
        menu10.setText("0");
        menu11.setText("0");
        menu12.setText("0");


        btn_cancel=(Button)findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(menu.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn_order=(Button)findViewById(R.id.btn_order);

        btn_order=findViewById(R.id.btn_order);
        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                String katsu = menu1.getText().toString();
                String kentang = menu2.getText().toString();
                String sempolan = menu3.getText().toString();
                String nasgor = menu4.getText().toString();
                String udang = menu5.getText().toString();
                String bbq = menu6.getText().toString();
                String alpukat = menu7.getText().toString();
                String jeruk = menu8.getText().toString();
                String lemon = menu9.getText().toString();
                String blue = menu10.getText().toString();
                String bandrek = menu11.getText().toString();
                String tea = menu12.getText().toString();
                int a = Integer.valueOf(katsu);
                int b = Integer.valueOf(kentang);
                int c = Integer.valueOf(sempolan);
                int d = Integer.valueOf(nasgor);
                int e = Integer.valueOf(udang);
                int f = Integer.valueOf(bbq);
                int g = Integer.valueOf(alpukat);
                int h = Integer.valueOf(jeruk);
                int i = Integer.valueOf(lemon);
                int j = Integer.valueOf(blue);
                int k = Integer.valueOf(bandrek);
                int l = Integer.valueOf(tea);


                juma = a * 10000;
                jumb = b * 8000;
                jumc = c * 5000;
                jumd = d * 15000;
                jume = e * 20000;
                jumf = f * 25000;
                jumg = g * 15000;
                jumh = h * 10000;
                jumi = i * 8000;
                jumj = j * 15000;
                jumk = k * 10000;
                juml = l * 10000;

                jumlah = ((a * 10000) + (b * 8000) + (c * 5000) + (d * 15000) + (e * 20000) + (f * 25000) + (g * 15000) + (h * 10000) + (i * 8000) +
                        (j * 15000) + (k * 10000) + (l * 10000));

                if (jumlah==0){

                    Toast.makeText(menu.this, "Setidaknya Membeli 1 Menu Kami", Toast.LENGTH_SHORT).show();
                }

                else {
                    Intent intent = new Intent(menu.this, details.class);
                    intent.putExtra("jumtot", jumlah);
                    intent.putExtra("jum1", juma);
                    intent.putExtra("jum2", jumb);
                    intent.putExtra("jum3", jumc);
                    intent.putExtra("jum4", jumd);
                    intent.putExtra("jum5", jume);
                    intent.putExtra("jum6", jumf);
                    intent.putExtra("jum7", jumg);
                    intent.putExtra("jum8", jumh);
                    intent.putExtra("jum9", jumi);
                    intent.putExtra("jum10", jumj);
                    intent.putExtra("jum11", jumk);
                    intent.putExtra("jum12", juml);

                    startActivity(intent);
                }



            }
        });


    }
}
