package com.example.shara.musicalstructure;

public class Music {
    //Name of the song
    private String songName;
    //Singer of the song
    private String songBy;
    //id of the image in Drawable
    private int imageResId;

    public Music(String songN,String songB,int imageId){
 songName = songN;
 songBy = songB;
 imageResId= imageId;

    }

    public String getSongBy() {
        return songBy;
    }

    public String getSongName() {
        return songName;
    }

    public int getImageResId(){
        return imageResId;

    }

}
