package com.upgrad.designpatterns.creational.abstractfactory.good;

public class MiniFactory extends TripFactory {
    private TripType tripType;

    public MiniFactory(TripType tripType) {
        this.tripType = tripType;
    }

    @Override
    public Trip getTrip() {
        return new Trip(getCab(), getDriver());
    }

    @Override
    public Driver getDriver() {
        switch(this.tripType) {
            case MINI:
                return new MiniDriver();
            case MINI_MICRO:
                return new MiniMicroDriver();
            default:
                break;
        }
        return null;
    }

    @Override
    public Cab getCab() {
        switch(this.tripType) {
            case MINI:
                return new MiniCab();
            case MINI_MICRO:
                return new MiniMicroCab();
            default:
                break;
        }
        return null;
    }
}
