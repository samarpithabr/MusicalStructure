package com.example.shara.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);
        ArrayList<Music> arraylst = new ArrayList<Music>();
        arraylst.add(new Music(getString(R.string.onav), getString(R.string.spb), R.drawable.peacock));
        arraylst.add(new Music(getString(R.string.ninna), getString(R.string.spb), R.drawable.ninna));
        arraylst.add(new Music(getString(R.string.anjali), getString(R.string.vijay), R.drawable.anjali));
        arraylst.add(new Music(getString(R.string.mal), getString(R.string.shreya), R.drawable.rain));
        arraylst.add(new Music(getString(R.string.usire), getString(R.string.vijay), R.drawable.usire));
        arraylst.add(new Music(getString(R.string.omeg), getString(R.string.spb), R.drawable.cloud));
        MusicAdapter musadp = new MusicAdapter(this, arraylst);
        ListView listView = (ListView) findViewById(R.id.list_art);
        listView.setAdapter(musadp);
    }
}
