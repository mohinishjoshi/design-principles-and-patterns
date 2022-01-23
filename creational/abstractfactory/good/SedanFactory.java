package com.upgrad.designpatterns.creational.abstractfactory.good;

public class SedanFactory extends TripFactory {
    private TripType tripType;

    public SedanFactory(TripType tripType) {
        this.tripType = tripType;
    }

    @Override
    public Trip getTrip() {
        return new Trip(getCab(), getDriver());
    }

    @Override
    public Driver getDriver() {
        switch(this.tripType) {
            case SEDAN:
                return new SedanDriver();
            case SEDAN_PLAY:
                return new SedanPlayDriver();
            default:
                break;
        }
        return null;
    }

    @Override
    public Cab getCab() {
        switch(this.tripType) {
            case SEDAN:
                return new SedanCab();
            case SEDAN_PLAY:
                return new SedanPlayCab();
            default:
                break;
        }
        return null;
    }
}
