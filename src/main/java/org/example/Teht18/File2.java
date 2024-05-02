package org.example.Teht18;

public abstract class File2 {
    private final String path;
    private final FILES type;

    File2(String path, FILES type) {
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public FILES getType() {
        return type;
    }

    public abstract void open();
    public abstract void close();
}
