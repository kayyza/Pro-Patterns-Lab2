package org.example;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void addSong(String songName, String artistName, int songLength) {
        Node newSong = new Node(songName, artistName, songLength);
        if (head == null) {
            head = newSong;
        }
        else {
            Node temp = head;
            while (temp.getLink() != null) {
                temp = temp.getLink();
            }
            temp.setLink(newSong);
        }
        System.out.println("Song " + songName + " added to the playlist");
    }

    public void deleteSong(String songName) {
        if (head == null) {
            System.out.println("Playlist is empty :(");
            return;
        }
        if (head.getSongName().equals(songName)) {
            System.out.println("Song " + songName + " deleted from the playlist");
            head = head.getLink();

        } else {
            Node temp = head;
            while (temp.getLink() != null && !temp.getLink().getSongName().equals(songName)) {
                temp = temp.getLink();
            }
            if (temp.getLink() == null) {
                System.out.println("Song " + songName + " not found");
            } else {
                temp.setLink(temp.getLink().getLink());
            }
        }

    }

    public void displayPlaylist() {
        Node temp = head;
        System.out.println("Songs in playlist: ");
        if (temp == null) {
            System.out.println("No songs in playlist");
            return;
        }
        while (temp != null) {
            System.out.println("Song name: " + temp.getSongName() + ", Artist Name: " + temp.getArtistName() + ", Duration: " + temp.getDuration() + " seconds");
            temp = temp.getLink();
        }
    }

    public void searchSong(String nameOrArtist) {
        Node temp = head;
        while (temp != null) {
            if (temp.getSongName().equals(nameOrArtist) || temp.getArtistName().equals(nameOrArtist)) {
                System.out.println("Song Name: " + temp.getSongName() + ", Artist Name: " + temp.getArtistName() + ", Duration: " + temp.getDuration() + " seconds");
                return;
            }
            temp = temp.getLink();
        }
        System.out.println("Song Name: " + nameOrArtist + " not found in the playlist");
    }

    public void totalDuration() {
        Node temp = head;
        int totalDuration = 0;
        while (temp != null) {
            totalDuration += temp.getDuration();
            temp = temp.getLink();
        }
        System.out.println("Total duration: " + totalDuration + " seconds");
    }
}
