package main;

import model.Song;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<Song>();

        Song song1 = new Song("smoth criminal",1,1984,"Pop",3,"caratula","descripcion");
        Song song2 = new Song("smoth criminal",1,1984,"Pop",3,"caratula","descripcion");
        Song song3 = new Song("smoth criminal",1,1984,"Pop",3,"caratula","descripcion");
        Song song4 = new Song("smoth criminal",1,1984,"Pop",3,"caratula","descripcion");

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);

        for (Song son: songs) {
            System.out.println(son);
        }
    }
}
