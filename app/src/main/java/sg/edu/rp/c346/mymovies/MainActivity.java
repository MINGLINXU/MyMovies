package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie>alMovie;
    CustomAdapter caMovie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvMovie = findViewById(R.id.ListViewMovie);
        alMovie = new ArrayList<>();
        Movie item1 = new Movie("The Avengers","2012","pg13"," - Action | Sci-Fi","15/11/2014","Golden Village","Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.",4);
        alMovie.add(item1);
        Movie item2 = new Movie("Planes","2013","pg"," - Animation | Comedy","15/5/2015","Cathay - AMK Hub","A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.",2);
        alMovie.add(item2);

        caMovie = new CustomAdapter(this, R.layout.row,alMovie);


        lvMovie.setAdapter(caMovie);



        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(),SecondActivity.class);
                startActivity(intent);
            }
        });


    }
}
