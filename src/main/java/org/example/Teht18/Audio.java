package org.example.Teht18;

public class Audio extends File2 {
    public Audio(String path) {
        super(path, FILES.AUDIO);
    }

    @Override
    public void open() {
        System.out.println("Opening audio file...");
    }

    @Override
    public void close() {
        System.out.println("Closing audio file...");
    }
}
