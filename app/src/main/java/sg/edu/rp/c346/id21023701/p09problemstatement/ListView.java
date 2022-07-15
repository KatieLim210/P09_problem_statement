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
ArrayAdapter <song> aa;
ArrayList<String> al;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        btnStar = findViewById(R.id.btn5star);
        lv = findViewById(R.id.list);

        al = new ArrayList<>();
        aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);

        //attempting to get rating from rating bar and display




    }
}