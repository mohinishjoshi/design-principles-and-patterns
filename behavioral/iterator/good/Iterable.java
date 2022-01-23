package com.upgrad.designpatterns.behavioral.iterator.good;

public interface Iterable {
    public Iterator getIterator();
    public void add(String message, String user);
    public void remove(Post post);
}
