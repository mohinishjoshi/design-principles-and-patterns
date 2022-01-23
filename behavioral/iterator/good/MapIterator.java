package com.upgrad.designpatterns.behavioral.iterator.good;

import java.util.List;
import java.util.Map;

public class MapIterator implements Iterator {
    private Map<String, Post> posts;
    private int position = 0;


    public MapIterator(Map<String, Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean hasNext() {
        return position < posts.values().size();
    }

    @Override
    public Object next() {
        return posts.values().toArray()[position++];
    }
}
