package org.example.Teht18;

abstract class File {
    private final String path;
    private final FILES type;

    File(String path, FILES type) {
        this.path = path;
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public FILES getType() {
        return type;
    }

    abstract void open();
    abstract void close();
}
