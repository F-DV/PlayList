package main;

import model.PlayList;
import model.Song;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Song> canciones = new ArrayList<>();

        PlayList playList = new PlayList();

        Song song1 = new Song("smoth criminal",1,1984,"pop",3,"caratula","descripcion");
        Song song2 = new Song("Never",2,1985,"rock",4,"caratula","descripcion");
        Song song3 = new Song("smoth criminal",3,2000,"pop",3,"caratula","descripcion");
        Song song4 = new Song("Bonita",4,2002,"Pop",3,"caratula","descripcion");


        canciones.add(song1);
        canciones.add(song2);
        canciones.add(song3);

        playList.saveSongList(canciones);

        //playList.searchByGenre("pop").forEach(song -> System.out.println(song));

        System.out.println("-------------------------");

        playList.saveSong(song4);
        //playList.getAllPlayList().forEach(song -> System.out.println(song));

        //playList.getAllPlayList().forEach(song -> System.out.println(song));

        playList.searchByYearMajor(2000).forEach(song -> System.out.println(song));

    }
}
