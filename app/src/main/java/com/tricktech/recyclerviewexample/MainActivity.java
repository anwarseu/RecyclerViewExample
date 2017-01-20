package com.tricktech.recyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tricktech.recyclerviewexample.adapters.MovieAdapter;
import com.tricktech.recyclerviewexample.models.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public ArrayList<Movie> movieList;
    public MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        prepareData();
        adapter = new MovieAdapter(this, movieList);
        recyclerView.setAdapter(adapter);


    }

    public void prepareData(){
        movieList = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            Movie movie = new Movie("Title "+i,"Author "+i,"200"+i);
            movieList.add(movie);
        }

    }
}
