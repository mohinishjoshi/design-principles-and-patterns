package com.upgrad.designpatterns.behavioral.iterator.good;

import sun.net.www.http.HttpClient;

public class Demo {
    public static void main(String[] args) {
        SocialMediaService sms = new SocialMediaService();

        PostArrayCollection postsArray = sms.getPostsArray();
        Iterator arrayIterator = postsArray.getIterator();

        System.out.println("\nArray Collection");
        while(arrayIterator.hasNext()){
            Post post = (Post) arrayIterator.next();
            System.out.println(post);
        }


        PostMapCollection postsMap = sms.getPostsMap();
        Iterator mapIterator = postsMap.getIterator();

        System.out.println("\nMap Collection");
        while(mapIterator.hasNext()){
            Post post = (Post) mapIterator.next();
            System.out.println(post);
        }


    }
}
