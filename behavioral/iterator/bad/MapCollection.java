package com.upgrad.designpatterns.behavioral.iterator.bad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapCollection {
    private Map<String, String> collection;

    public MapCollection() {
        this.collection =  new HashMap<>();
    }

    public void add(String key, String value){
        collection.put(key, value);
    }

    public void remove(String key){
        collection.remove(key);
    }

    public Map<String, String> getCollection() {
        return collection;
    }
}
