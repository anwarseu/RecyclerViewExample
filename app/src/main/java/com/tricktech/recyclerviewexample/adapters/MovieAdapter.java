package com.tricktech.recyclerviewexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.tricktech.recyclerviewexample.R;
import com.tricktech.recyclerviewexample.models.Movie;

import java.util.ArrayList;

/**
 * Created by am on 1/20/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    public ArrayList<Movie> movieList;
    public Context mContext;

    public MovieAdapter(Context mContext, ArrayList<Movie> movieList) {
        this.mContext = mContext;
        this.movieList = movieList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
           Movie movie = movieList.get(position);
           holder.txt_title.setText(movie.getTitle());
           holder.txt_author.setText(movie.getAuthor());
           holder.txt_release.setText(movie.getRelease());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageView;
        public TextView txt_title,txt_author,txt_release;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            txt_title = (TextView) itemView.findViewById(R.id.textView);
            txt_author = (TextView) itemView.findViewById(R.id.textView2);
            txt_release = (TextView) itemView.findViewById(R.id.textView3);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext, "Clicked!",Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
