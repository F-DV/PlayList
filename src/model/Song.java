package model;

import java.time.LocalDate;

public class Song {
    private String title;
    private int identity;
    private int date;
    private String gnre;
    private float duration;
    private String frontPage;
    private String description;

    /**
     * Constructor
     * @param title
     * @param identity
     * @param date
     * @param gnre
     * @param frontPage
     */
    public Song(String title, int identity, int date, String gnre, float duration, String frontPage, String description) {
        this.title = title;
        this.identity = identity;
        this.date = date;
        this.gnre = gnre;
        this.duration = duration;
        this.frontPage = frontPage;
        this.description = description;
    }

    /**
     * Constructor
     */
    public Song() {
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", identity=" + identity +
                ", date=" + date +
                ", gnre='" + gnre + '\'' +
                ", duration=" + duration +
                ", frontPage='" + frontPage + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
