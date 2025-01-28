package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList playlist = new LinkedList();
        Scanner scanner = new Scanner(System.in);



        while (true) {
            System.out.println("------------------");
            System.out.println("Playlist Menu");
            System.out.println();
            System.out.println("1. Add a Song");
            System.out.println("2. Delete a Song");
            System.out.println("3. Display the Playlist");
            System.out.println("4. Search for a Song");
            System.out.println("5. Find the Total Duration");
            System.out.println("6. Exit");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Song Name: ");
                    String songName = scanner.nextLine();
                    System.out.println("Enter Artist Name: ");
                    String artistName = scanner.nextLine();
                    System.out.println("Enter Duration in seconds: ");
                    int duration = scanner.nextInt();
                    playlist.addSong(songName, artistName, duration);
                    break;

                case 2:
                    System.out.println("Enter Song Name To Delete: ");
                    String songToDelete = scanner.nextLine();
                    playlist.deleteSong(songToDelete);
                    break;

                case 3:
                    playlist.displayPlaylist();
                    break;

                case 4:
                    System.out.println("Enter a song name or artist name to search: ");
                    String songOrArtistNameToSearch = scanner.nextLine();
                    playlist.searchSong(songOrArtistNameToSearch);
                    break;

                case 5:
                    playlist.totalDuration();
                    break;

                case 6:

                    System.out.println("Exiting Program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid Choice. Please choose again.");
            }
        }
    }
}
