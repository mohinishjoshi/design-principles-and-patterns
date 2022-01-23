package com.upgrad.designpatterns.behavioral.iterator.good;

import java.util.List;

public class ArrayIterator implements Iterator {
    private List<Post> posts;
    private int position = 0;


    public ArrayIterator(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean hasNext() {
        return position < posts.size();
    }

    @Override
    public Object next() {
        Post post = posts.get(position);
        position += 1;
        return post;
    }
}
