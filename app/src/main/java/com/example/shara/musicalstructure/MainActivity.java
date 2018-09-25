package com.example.shara.musicalstructure;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView dev = (TextView) findViewById(R.id.devotional_text_view);
        Button devbtn = (Button) findViewById(R.id.dev_play_button);
        TextView pop = (TextView) findViewById(R.id.Popular_text_view);
        TextView artt = (TextView) findViewById(R.id.art_text_view);
        TextView clas = (TextView) findViewById(R.id.classical_text_view);
        Button popbtn = (Button) findViewById(R.id.pop_play_button) ;
        Button artbtn = (Button) findViewById(R.id.art_play_button);
        Button clasbtn = (Button) findViewById(R.id.clas_play_button) ;


        dev.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent devIntent = new Intent(MainActivity.this, DevotionalActivity.class);
                startActivity(devIntent);
            }
        });
        if (dev != null) {
            dev.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent devIntent = new Intent(MainActivity.this, DevotionalActivity.class);
                    startActivity(devIntent);
                }
            });
        }
        devbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent devbtnIntent = new Intent(MainActivity.this,DevotionalActivity.class);
                startActivity(devbtnIntent);
            }
        });

        if(devbtn!= null){
            devbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent devbtnIntent = new Intent(MainActivity.this, DevotionalActivity.class);
                    startActivity(devbtnIntent);
                }
            });
        }
        popbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent popbtnIntent = new Intent(MainActivity.this,PopularActivity.class);
                startActivity(popbtnIntent);
            }
        });

        if(popbtn!= null){
            popbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent popbtnIntent = new Intent(MainActivity.this, PopularActivity.class);
                    startActivity(popbtnIntent);
                }
            });
        }
        artbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artbtnIntent = new Intent(MainActivity.this,ArtActivity.class);
                startActivity(artbtnIntent);
            }
        });

        if(artbtn!= null){
            artbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent artbtnIntent = new Intent(MainActivity.this, ArtActivity.class);
                    startActivity(artbtnIntent);
                }
            });
        }
        clasbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clasbtnIntent = new Intent(MainActivity.this,ClassicalActivity.class);
                startActivity(clasbtnIntent);
            }
        });

        if(clasbtn!= null){
            clasbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent clasbtnIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                    startActivity(clasbtnIntent);
                }
            });
        }

        pop.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent popIntent = new Intent(MainActivity.this, PopularActivity.class);
                    startActivity(popIntent);
                }
            });
        if(pop !=null){
            pop.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent popIntent = new Intent(MainActivity.this, PopularActivity.class);
                    startActivity(popIntent);
                }
            });

        }

       artt.setOnClickListener( new View.OnClickListener() {
           // The code in this method will be executed when the numbers View is clicked on.
           @Override
           public void onClick(View view) {
               Intent artIntent = new Intent(MainActivity.this, ArtActivity.class);
               startActivity(artIntent);
           }
       });
        if(artt!= null){
            artt.setOnClickListener( new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent artIntent = new Intent(MainActivity.this, ArtActivity.class);
                    startActivity(artIntent);
                }
            });
        }
       clas.setOnClickListener(new View.OnClickListener() {
           // The code in this method will be executed when the numbers View is clicked on.
           @Override
           public void onClick(View view) {
               Intent clasIntent = new Intent(MainActivity.this, ClassicalActivity.class);
               startActivity(clasIntent);
           }
       });
        if(clas!=null){
            clas.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the numbers View is clicked on.
                @Override
                public void onClick(View view) {
                    Intent clasIntent = new Intent(MainActivity.this, ClassicalActivity.class);
                    startActivity(clasIntent);
                }
            });

        }

    }
    }