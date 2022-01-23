package com.upgrad.designpatterns.behavioral.iterator.good;

import java.util.List;

public class SocialMediaService {
    public PostArrayCollection getPostsArray(){
        return new PostArrayCollection();
    }

    public PostMapCollection getPostsMap(){
        return new PostMapCollection();
    }
}
