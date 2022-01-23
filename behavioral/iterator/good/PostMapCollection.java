package com.upgrad.designpatterns.behavioral.iterator.good;

import java.util.HashMap;
import java.util.Map;

public class PostMapCollection implements Iterable{
    private Map<String, Post> posts;

    public PostMapCollection() {
        this.posts = new HashMap<>();
        this.posts.put("key1", new Post("Map Message 1", "User A"));
        this.posts.put("key2", new Post("Map Message 2", "User B"));
        this.posts.put("key3", new Post("Map Message 3", "User C"));
    }

    @Override
    public Iterator getIterator() {
        return new MapIterator(posts);
    }

    @Override
    public void add(String message, String user) {
        this.posts.put(user, new Post( message, user));
    }

    @Override
    public void remove(Post post) {
        this.posts.remove(post);
    }
}
