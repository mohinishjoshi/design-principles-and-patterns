package com.upgrad.designpatterns.creational.abstractfactory.good;



public class TripDemo {
    public static void main(String[] args) {

        TripFactory tripFactory = TripFactory.getTripFactory(TripType.MINI);

        Trip trip = tripFactory.getTrip();

        System.out.println(trip.getClass());

        tripFactory = TripFactory.getTripFactory(TripType.SEDAN_PLAY);

        trip = tripFactory.getTrip();

        System.out.println(trip.getClass());
    }
}
