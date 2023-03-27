package org.example_1.hw_17.Task_2;

public class Track {

    private String author;
    private String  name;
    public int listeningCount;

    public Track() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getListeningCount() {
        return listeningCount;
    }

    public void setListeningCount(int listeningCount) {
        this.listeningCount = listeningCount;
    }

    @Override
    public String toString() {
        return "Track{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", listeningCount=" + listeningCount +
                '}';
    }
}
