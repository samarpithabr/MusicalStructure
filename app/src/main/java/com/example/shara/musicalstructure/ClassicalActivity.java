package com.example.shara.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ClassicalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classical);
        ArrayList<Music> arraylst = new ArrayList<Music>();
        arraylst.add(new Music(getString(R.string.nada),getString(R.string.raj),R.drawable.fluit));
        arraylst.add(new Music(getString(R.string.olavina),getString(R.string.spb),R.drawable.mrudhanga));
        arraylst.add(new Music(getString(R.string.jaga),"",R.drawable.veene));
        arraylst.add(new Music(getString(R.string.indhu),getString(R.string.pbsrinivas),R.drawable.thabala));
        arraylst.add(new Music(getString(R.string.haadhi),getString(R.string.janaki),R.drawable.violin));
        arraylst.add(new Music(getString(R.string.sundari),getString(R.string.vijanu),R.drawable.piono));
        MusicAdapter musadp = new MusicAdapter(this,arraylst);
        ListView listView = (ListView) findViewById(R.id.classic_list);
        listView.setAdapter(musadp);

    }
}
