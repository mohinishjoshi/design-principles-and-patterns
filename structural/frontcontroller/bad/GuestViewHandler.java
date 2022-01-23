package com.upgrad.designpatterns.structural.frontcontroller.bad;

public class GuestViewHandler {
    private GuestView guestView;

    public GuestViewHandler() {
        this.guestView = new GuestView();
    }

    public void dispatch(){
        guestView.show();
    }
}
