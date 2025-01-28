package org.example;

public class Node {
    private String songName;
    private String artistName;
    private int duration;
    private Node link;

    public Node(){
        songName = null;
        artistName = null;
        duration = 0;
        link = null;
    }

    public Node(String newSongName, String newArtistName, int newDuration) {
        this.songName = newSongName;
        this.artistName = newArtistName;
        this.duration = newDuration;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
