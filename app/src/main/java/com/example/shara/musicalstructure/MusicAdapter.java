package com.example.shara.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MusicAdapter extends ArrayAdapter<Music> {


    public MusicAdapter(@NonNull Context context, @NonNull List<Music> objects) {
        super(context, 0,  objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        Music currentmusic = getItem(position);
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.song_Name);
        nameTextView.setText(currentmusic.getSongName());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.song_By);
        numberTextView.setText(currentmusic.getSongBy());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_id);
        iconView.setImageResource(currentmusic.getImageResId());
        return listItemView;
    }

}
