package org.example.Teht18;

public class Text extends File2 {
    public Text(String path) {
        super(path, FILES.TEXT);
    }

    @Override
    public void open() {
        System.out.println("Opening text file...");
    }

    @Override
    public void close() {
        System.out.println("Closing text file...");
    }
}
