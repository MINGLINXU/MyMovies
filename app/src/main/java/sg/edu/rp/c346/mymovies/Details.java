package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Details extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;

    public Details(Context context, int resource, ArrayList<Movie>objects){
        super(context,resource,objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @Override
    public View getView(int position, View secView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivPG = rowView.findViewById(R.id.imageViewPG);
        TextView tvDes = rowView.findViewById(R.id.textViewDescription);
        TextView tvwatch = rowView.findViewById(R.id.textViewYear);
        TextView tvtheatre = rowView.findViewById(R.id.textViewTheatre);

        Movie currentItem = movieList.get(position);
        tvTitle.setText(currentItem.getTitle());
        tvYear.setText(currentItem.getYear());
        tvGenre.setText(currentItem.getGenre());
        tvDes.setText(currentItem.getDescription());
        tvwatch.setText(currentItem.getWatched_on());
        tvtheatre.setText(currentItem.getIn_theatre());


        if(currentItem.getRated() == "pg"){
            ivPG.setImageResource(R.drawable.rating_pg);
        }
        else if(currentItem.getRated() =="pg13"){
            ivPG.setImageResource(R.drawable.rating_pg13);
        }

        return rowView;

    }

}
