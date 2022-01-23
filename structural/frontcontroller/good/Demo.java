package com.upgrad.designpatterns.structural.frontcontroller.good;

public class Demo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();

        frontController.handleRequest("Admin");
        System.out.println("\n\n\n");

        frontController.handleRequest("Guest");
    }
}
