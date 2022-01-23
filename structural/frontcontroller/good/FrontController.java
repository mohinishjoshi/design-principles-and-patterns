package com.upgrad.designpatterns.structural.frontcontroller.good;

public class FrontController {
    private Dispatcher dispatcher;

    public FrontController() {
        this.dispatcher = new Dispatcher();
    }

    private Boolean isValidViewType(String request){
        System.out.println("Check is Valid View Type: True");
        return true;
    }

    private Boolean isAuthenticatedUser(){
        System.out.println("Check is Authenticated User: True");
        return true;
    }

    public void handleRequest(String request){
        if(isAuthenticatedUser() && isValidViewType(request)){
            System.out.println("Dispatch request via Dispatcher. -> ");
            dispatcher.dispatch(request);
        }
    }
}
