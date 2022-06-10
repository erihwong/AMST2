package com.example.amst2;

import android.content.ClipData;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_simple,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.video_youtube){
            Toast.makeText(this, "video",Toast.LENGTH_SHORT).show();
            Intent siguiente = new Intent(this, VideoYoutube.class);
            startActivity(siguiente);

        }else if(id==R.id.calendario){
            Toast.makeText(this, "video",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.mapa){
            Toast.makeText(this, "video",Toast.LENGTH_SHORT).show();
        }else if(id==R.id.grafico_lineal){
            Toast.makeText(this, "video",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}