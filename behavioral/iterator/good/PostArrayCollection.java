package com.upgrad.designpatterns.behavioral.iterator.good;

import java.util.ArrayList;
import java.util.List;

public class PostArrayCollection implements Iterable{
    private List<Post> posts;


    public PostArrayCollection() {
        this.posts = new ArrayList<Post>();
        this.posts.add(new Post("Arr Message 1", "User A"));
        this.posts.add(new Post("Arr Message 2", "User B"));
        this.posts.add(new Post("Arr Message 3", "User C"));
    }


    @Override
    public Iterator getIterator() {
        return new ArrayIterator(posts);
    }

    @Override
    public void add(String message, String user) {
        this.posts.add(new Post(message, user));
    }

    @Override
    public void remove(Post post) {
        this.posts.remove(post);
    }
}
