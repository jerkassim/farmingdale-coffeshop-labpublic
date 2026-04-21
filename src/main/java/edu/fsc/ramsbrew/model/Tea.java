package edu.fsc.ramsbrew.model;

public class Tea implements Beverage {

    @Override
    public String getName() {
        return "Tea";
    }

    @Override
    public double getBasePrice() {
        return 2.25;
    }

    @Override
    public boolean supportsIced() {
        return true;
    }

    @Override
    public boolean supportsMilkOptions() {
        return false;
    }

    @Override
    public boolean supportsEspressoShots() {
        return false;
    }
}

