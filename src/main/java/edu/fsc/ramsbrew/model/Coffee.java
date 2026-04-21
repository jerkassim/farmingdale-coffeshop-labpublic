package edu.fsc.ramsbrew.model;

public class Coffee implements Beverage {

    @Override
    public String getName() {
        return "Coffee";
    }

    @Override
    public double getBasePrice() {
        return 2.50;
    }

    @Override
    public boolean supportsIced() {
        return true;
    }

    @Override
    public boolean supportsMilkOptions() {
        return true;
    }

    @Override
    public boolean supportsEspressoShots() {
        return false;
    }
}

