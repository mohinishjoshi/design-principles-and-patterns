package com.upgrad.designpatterns.structural.frontcontroller.good;

public class GuestViewHandler {
    private GuestView guestView;

    public GuestViewHandler() {
        this.guestView = new GuestView();
    }

    public void dispatch(){
        guestView.show();
    }
}
