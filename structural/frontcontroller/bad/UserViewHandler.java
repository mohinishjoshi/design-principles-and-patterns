package com.upgrad.designpatterns.structural.frontcontroller.bad;

public class UserViewHandler {
    private UserView userView;

    public UserViewHandler() {
        this.userView = new UserView();
    }

    public void dispatch(){
        userView.show();
    }
}
