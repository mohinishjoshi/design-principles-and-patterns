package com.upgrad.designpatterns.behavioral.iterator.bad;

import java.util.ArrayList;
import java.util.List;

public class ArrayCollection {
    private List<String> collection;

    public ArrayCollection() {
        this.collection =  new ArrayList<>();
    }

    public void add(String item){
        collection.add(item);
    }

    public void remove(String item){
        collection.remove(item);
    }

    public List<String> getCollection() {
        return collection;
    }
}
