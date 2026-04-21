package edu.fsc.ramsbrew.model;

public class Latte implements Beverage {

    @Override
    public String getName() {
        return "Latte";
    }

    @Override
    public double getBasePrice() {
        return 4.50;
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
        return true;
    }
}

