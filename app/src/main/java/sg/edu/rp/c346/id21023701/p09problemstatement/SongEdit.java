package sg.edu.rp.c346.id21023701.p09problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class SongEdit extends AppCompatActivity {
    EditText etTitle, etSinger, etYear;
    Button btnUpdate, btnCancel, btnDelete;
    RatingBar ratingBar;
    TextView tvTitle, tvSinger, tvYear, tvStars;
    ArrayList<song> al;
    ArrayAdapter<song> aa;
    song data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_edit);

        etTitle = findViewById(R.id.etTitle);
        etSinger = findViewById(R.id.etSinger);
        etYear = findViewById(R.id.etYear);
        btnUpdate = findViewById(R.id.buttonUpdate);
        btnDelete = findViewById(R.id.buttonDelete);
        btnCancel = findViewById(R.id.buttonCancel);
        ratingBar = findViewById(R.id.ratingBar);

        Intent i = getIntent();
        data = (song) i.getSerializableExtra("data");

        etTitle.setText(data.get_id());
        etSinger.setText(data.getSingers());
        etYear.setText(data.getYear());
        ratingBar.setRating(data.getStar());

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbh = new DBHelper(SongEdit.this);
                data.setTitle(etTitle.getText().toString());
                data.setSingers(etSinger.getText().toString());
                data.setYear(Integer.parseInt(etYear.getText().toString()));
                dbh.updateSong(data);
                dbh.close();
                Intent i = new Intent(SongEdit.this, ListView.class);
                startActivity(i);
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbh = new DBHelper(SongEdit.this);
                dbh.deleteSong(data.get_id());
                Intent i = new Intent(SongEdit.this,ListView.class);
                startActivity(i);
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SongEdit.this,ListView.class);
                startActivity(i);
            }
        });
    }
}