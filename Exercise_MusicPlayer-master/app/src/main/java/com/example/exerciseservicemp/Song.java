package com.example.exerciseservicemp;

public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist){
        id= songID;
        title = songTitle;
        artist = songArtist;
    }

    public long getID(){return id;}
    public String getArtist(){return artist;}
    public String getTitle(){return title;}


}
