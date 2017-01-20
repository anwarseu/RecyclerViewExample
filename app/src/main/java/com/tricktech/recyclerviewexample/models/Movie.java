package com.tricktech.recyclerviewexample.models;

/**
 * Created by am on 1/20/2017.
 */

public class Movie {
    public String title;
    public String author;
    public String release;

    public Movie(String title, String author, String release) {
        this.title = title;
        this.author = author;
        this.release = release;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }
}
