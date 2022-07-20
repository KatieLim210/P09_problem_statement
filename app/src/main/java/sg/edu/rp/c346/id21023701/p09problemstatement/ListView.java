package sg.edu.rp.c346.id21023701.p09problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;


import java.util.ArrayList;

public class ListView extends AppCompatActivity {
Button btnStar;
android.widget.ListView lv;
//ArrayAdapter <song> aa;
ArrayList<song> al;
CustomAdapter Ca;
song data ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        btnStar = findViewById(R.id.btn5star);
        lv = findViewById(R.id.list);

        al = new ArrayList<>();
        Ca = new CustomAdapter(this,R.layout.row,al);
        lv.setAdapter(Ca);

        btnStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                song data = al.get(pos);
                Intent i = new Intent(ListView.this,SongEdit.class);
                i.putExtra("data",data);
            }
        });




    }
}