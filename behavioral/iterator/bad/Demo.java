package com.upgrad.designpatterns.behavioral.iterator.bad;

import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        ArrayCollection arrCollection = new ArrayCollection();

        arrCollection.add("Hello");
        arrCollection.add("World");
        arrCollection.add("How");
        arrCollection.add("Are");
        arrCollection.add("You");

        System.out.println("\nARRAY Collection");
        for(String item: arrCollection.getCollection()){
            System.out.println(item);
        }


        MapCollection mapCollection = new MapCollection();

        mapCollection.add("fname", "Adam");
        mapCollection.add("lname", "Sandler");
        mapCollection.add("job", "Actor");


        System.out.println("\nMAP Collection");
        mapCollection.getCollection().forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });
    }
}
