package com.example.syanz.restoran;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
 private ImageView menu,call,maps;
 TextView resto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resto=findViewById(R.id.nama_restoran);

        menu = (ImageView) findViewById(R.id.daftar_menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ListMenu.class);
                startActivity(intent);
            }
        });

        call=(ImageView) findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+6281221513741"));
                startActivity(intent);
            }
        });
        maps=(ImageView)findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=-6.917314,107.721009"));
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.listmenu:
                Intent intent=new Intent(MainActivity.this,ListMenu.class);
                startActivity(intent);
                return true;
            case R.id.phone:
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+6281221513741"));
                startActivity(i);
                return true;
            case R.id.map:
                Intent ii =new Intent(Intent.ACTION_VIEW,Uri.parse("http://maps.google.com/maps?daddr=-6.917314,107.721009"));
                startActivity(ii);
                return true;
            case R.id.profile:
                Intent iii = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(iii);
                return true;
            case R.id.Language:
                Intent iv = new Intent(Settings.ACTION_LOCALE_SETTINGS);
                startActivity(iv);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
