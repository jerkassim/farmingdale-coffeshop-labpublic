package edu.fsc.ramsbrew.model;

public class Cappuccino implements Beverage {

    @Override
    public String getName() {
        return "Cappuccino";
    }

    @Override
    public double getBasePrice() {
        return 4.25;
    }

    @Override
    public boolean supportsIced() {
        return false;
    }

    @Override
    public boolean supportsMilkOptions() {
        return true;
    }

    @Override
    public boolean supportsEspressoShots() {
        return true;
    }
}

