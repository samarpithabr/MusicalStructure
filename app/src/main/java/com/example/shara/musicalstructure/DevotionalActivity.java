package com.example.shara.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DevotionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devotional);
        ArrayList<Music> arraylst = new ArrayList<Music>();
        arraylst.add(new Music(getString(R.string.maha),getString(R.string.raje),R.drawable.ganapathi));
        arraylst.add(new Music(getString(R.string.devare),getString(R.string.spb),R.drawable.images));
        arraylst.add(new Music(getString(R.string.krishna),getString(R.string.chitra),R.drawable.ganapathi));
        arraylst.add(new Music(getString(R.string.olord),getString(R.string.raj),R.drawable.jesus));
        arraylst.add(new Music(getString(R.string.elli),getString(R.string.raj),R.drawable.hanuman));
        arraylst.add(new Music(getString(R.string.venka),getString(R.string.vijay),R.drawable.venkatesha));
        MusicAdapter musadp = new MusicAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(musadp);
    }
}

