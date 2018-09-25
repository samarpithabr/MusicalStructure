package com.example.shara.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.shara.musicalstructure.R.id.list;

public class PopularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
        ArrayList<Music> arraylst = new ArrayList<Music>();
        arraylst.add(new Music(getString(R.string.dar),getString(R.string.heman),R.drawable.darshan));
        arraylst.add(new Music(getString(R.string.sud),getString(R.string.vijay),R.drawable.sudeep));
        arraylst.add(new Music(getString(R.string.rajh),getString(R.string.raj),R.drawable.raj));
        arraylst.add(new Music(getString(R.string.yash),getString(R.string.chanda),R.drawable.yash));
        arraylst.add(new Music(getString(R.string.malashree),getString(R.string.manj),R.drawable.malashree));
        arraylst.add(new Music(getString(R.string.vishnu),getString(R.string.spb),R.drawable.vishnu));
        MusicAdapter musadp = new MusicAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.popList_view);
        listView.setAdapter(musadp);
    }
}
