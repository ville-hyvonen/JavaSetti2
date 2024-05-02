package org.example;

public class Teht15 {
    private static Teht15 instance;
    private String track;

    public static Teht15 getInstance() {
        if (instance == null) {
            instance = new Teht15();
        }
        return instance;
    }

    public void setTrack(String trackName) {
        this.track = trackName;
    }

    public void playTrack() {
        System.out.println("Playing track: " + this.track);
    }
}
