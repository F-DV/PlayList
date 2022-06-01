package model;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    ArrayList<Song> lista = new ArrayList<Song>();



    public void saveSongList(ArrayList<Song> songs){

        songs.stream().forEach(song -> {
            lista.add(song);
        });
    }

    public void saveSong(Song song){
        lista.add(song);
    }

    public List<Song> searchByGenre(String genre){

        ArrayList<Song> list = new ArrayList<Song>();

        for (Song element: lista) {
            if(element.getGnre().equals(genre)){
                list.add(element);
            }
        }

        return list;
    }
    public List<Song> getAllPlayList(){
        return this.lista;
    }


    public List<Song> searchByYearMajor(int year){
        ArrayList<Song> list = new ArrayList<Song>();

        for (Song element:lista) {

            if(element.getDate() >= year){
                list.add(element);
            }
        }
        return list;
    }


}
